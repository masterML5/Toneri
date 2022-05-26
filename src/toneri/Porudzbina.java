/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toneri;

import java.awt.Desktop;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import org.omg.CORBA.Object;
import javax.swing.JFileChooser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Milos Jelic
 */
public class Porudzbina extends javax.swing.JFrame {
    
    /**
     * Creates new form Porudžbina
     */
    private StringSelection stsel;
    private Clipboard clipboard;
    public Porudzbina() {
        initComponents();
        SelectPorudzbina();
        
    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    ResultSet RsTable = null;
    Integer b = 0;
    
 
    
    public void SelectPorudzbina()
    {
        try{
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toneridb","root","");
        St = Con.createStatement();
        RsTable = St.executeQuery("Select Printers.MARKA as 'Marka', Printers.MODEL as 'Model', Toneri.TONER_NAZIV AS 'Toner',"
                + " Toneri.TONER_PREPKOLICINA-Toneri.TONER_KOLICINA AS Količina "
                + "from TONERI LEFT JOIN PRINTERS ON Printers.TONER=Toneri.TONER_NAZIV WHERE Toneri.TONER_PREPKOLICINA-Toneri.TONER_KOLICINA > 0 AND Toneri.TONER_PORUCEN = 'Nije porucen' GROUP BY Toneri.TONER_NAZIV");
        Porudzbina_table.setModel(DbUtils.resultSetToTableModel(RsTable));

        Porudzbina_table.setEnabled(false);
        Porudzbina_table.setRowSelectionAllowed(true);
        Porudzbina_table.setColumnSelectionAllowed(true);

        
       
         
        
       

        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void openFile(String file){
        try{
            File path = new File(file);
            Desktop.getDesktop().open(path);
        }
         catch(IOException ioe ){
            System.out.println(ioe);
        }
    
    
    }
    public void exportExcel(){
           try{
           JFileChooser jFileChooser = new JFileChooser();
           jFileChooser.showSaveDialog(this);
           File saveFile = jFileChooser.getSelectedFile();
           
           if(saveFile != null){
               saveFile = new File(saveFile.toString()+".xlsx");
               Workbook wb = new XSSFWorkbook();
               Sheet sheet = wb.createSheet("Porudzbina");
               
               SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
               java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
               Header header = sheet.getHeader();  
               header.setCenter("Pionir d.o.o Porudžbina " + formatter.format(date));  
               Row rowCol = sheet.createRow(0);
               for(int i=0;i<Porudzbina_table.getColumnCount();i++){
                   Cell cell = rowCol.createCell(i);
                   cell.setCellValue(Porudzbina_table.getColumnName(i));
               }
               
               for(int j=0;j<Porudzbina_table.getRowCount();j++){
                   Row row = sheet.createRow(j+1);
                   for(int k=0;k<Porudzbina_table.getColumnCount();k++){
                       Cell cell = row.createCell(k);
                       if(Porudzbina_table.getValueAt(j, k)!=null){
                           cell.setCellValue(Porudzbina_table.getValueAt(j, k).toString());
                       }
                   }
               }
               FileOutputStream out = new FileOutputStream(new File(saveFile.toString()));
               wb.write(out);
               wb.close();
               out.close();
               openFile(saveFile.toString());
           }else{
               b = 1;
               JOptionPane.showMessageDialog(null,"Greska prilikom exporta");
               
           }
       }catch(FileNotFoundException e){
           System.out.println(e);
       }catch(IOException io){
           System.out.println(io);
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Porudzbina_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toneri/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel2.setText("TONERI I ŠTAMPAČI");

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel4.setText("Porudžbina");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Porudzbina_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RB", "Toner", "Količina"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Porudzbina_table);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Copy");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Excel");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Poruci sve");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(201, 201, 201)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 273, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu4.setText("Edit štampača");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        jMenu10.setText("Home");
        jMenu10.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu10);

        jMenu5.setBackground(new java.awt.Color(255, 255, 255));
        jMenu5.setText("Štampači info");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu9.setText("Zamena tonera");
        jMenu9.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu9);

        jMenu6.setBackground(new java.awt.Color(255, 255, 255));
        jMenu6.setForeground(new java.awt.Color(255, 51, 51));
        jMenu6.setText("Porudžbina");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setBackground(new java.awt.Color(255, 255, 255));
        jMenu7.setText("Servis");
        jMenu7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu7.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        jMenu8.setBackground(new java.awt.Color(255, 255, 255));
        jMenu8.setText("Logout");
        jMenu8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu8.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Help");
        jMenu3.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        new EditPrinters().setVisible(true);
        this.dispose();        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        new Welcome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu10MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        new Stampaci().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        new ZamenaTonera().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        new Porudzbina().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        new Servis().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        new Login().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        JOptionPane.showMessageDialog(this,"Program Toneri i Stampaci Pionir d.o.o\n"
                + "Napravio : Jelic Milos\n"
                + "Kontakt : 024/660-111");        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
            //LocalDate vreme = java.time.LocalDate.now();
          Date today = new Date();
          DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
          String strDate = dateFormat.format(today);  

     
          MessageFormat header = new MessageFormat("Porudžbina tonera Pionir d.o.o");
          MessageFormat footer = new MessageFormat(strDate);
                      
            try{
                Porudzbina_table.print(JTable.PrintMode.NORMAL, header, footer);
               }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            }
    
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         exportExcel();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
          ActionEvent nev = new ActionEvent(Porudzbina_table, ActionEvent.ACTION_PERFORMED, "copy");
          Porudzbina_table.selectAll();
          Porudzbina_table.getActionMap().get(nev.getActionCommand()).actionPerformed(nev);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int count = Porudzbina_table.getModel().getRowCount(); 
        if (count > 0){
        
        int respone = JOptionPane.showConfirmDialog(this,"Da li želite da poručite tonere?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           
        if(respone == JOptionPane.YES_OPTION){
       
        exportExcel();
        if(b != 1){
        try{
        SimpleDateFormat formatter= new SimpleDateFormat("yyyyMMdd");
        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
        final String brojPorudzbine = "DIR-"+formatter.format(date)+"-TP";
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/toneridb","root","");
        String Query = "Update TONERI set TONER_PORUCEN = 'Porucen' WHERE TONER_PREPKOLICINA-TONER_KOLICINA > 0 AND TONER_PORUCEN = 'Nije porucen'";
        Statement Add = Con.createStatement();
        Add.executeUpdate(Query);            
        
        
 
        int rows=Porudzbina_table.getRowCount();
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Con.setAutoCommit(false);

        String queryco = "Insert into toneri_porudzbine(PORUDZBINE_TONER,PORUDZBINE_KOLICINA,PORUDZBINE_BROJ,PORUDZBINE_STATUS) values (?,?,?,?)";
        PreparedStatement pst = Con.prepareStatement(queryco);
        for(int row = 0; row<rows; row++)
        {

        String toner = String.valueOf(Porudzbina_table.getValueAt(row, 2));
        String kolicina2 = String.valueOf(Porudzbina_table.getValueAt(row, 3));
        String brojpor = brojPorudzbine;
        
        Integer kolicina = parseInt(kolicina2);

        pst.setString(1, toner);
        pst.setInt(2, kolicina);
        pst.setString(3, brojpor);
        pst.setString(4, "Porucen");
        

            pst.addBatch();
        }
        pst.executeBatch();
        Con.commit();
        SelectPorudzbina();
        
        
        JOptionPane.showMessageDialog(this,"Uspesno ste prebacili status izlistanih tonera na porucen!");

        }catch(Exception e){
            e.printStackTrace();
        }
        }else{
        JOptionPane.showMessageDialog(this,"Prekid");
        }
    
         }
        }else{
        JOptionPane.showMessageDialog(this,"Nema tonera za poručivanje!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
      

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Porudzbina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Porudzbina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Porudzbina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Porudzbina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Porudzbina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Porudzbina_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
