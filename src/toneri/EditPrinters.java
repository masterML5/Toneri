/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toneri;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Milos Jelic
 */
public class EditPrinters extends javax.swing.JFrame {

    /**
     * Creates new form EditPrinters
     */
    public EditPrinters() {
        initComponents();
        SelectToner();
    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    public void SelectToner()
    {
        try{
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/toneridb","User1","test");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from User1.PRINTERS ");
        Toner_table.setModel(DbUtils.resultSetToTableModel(Rs));
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
   
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        Toner_toner2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Toner_poslednjaprom2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Toner_toner = new javax.swing.JTextField();
        Toner_poslednjaprom = new javax.swing.JTextField();
        Toner_driver = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        RemoveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Toner_poslednjiservis = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Toner_tip = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Toner_table = new javax.swing.JTable();
        Toner_invbroj = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ID_Toner = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Toner_ipaddress = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Toner_marka = new javax.swing.JTextField();
        Toner_model = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Toner_lokacija = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Toner_slika = new javax.swing.JTextField();
        Toner_status = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
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

        jMenuItem4.setText("jMenuItem4");

        Toner_toner2.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel14.setText("Toner");

        Toner_poslednjaprom2.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel15.setText("Poslednja promena");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toneri/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel2.setText("TONERI I ŠTAMPAČI");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Toner_toner.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        Toner_poslednjaprom.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        Toner_driver.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel1.setText("Toner");

        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel5.setText("Poslednja promena tonera");

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel6.setText("Driver");

        AddBtn.setBackground(new java.awt.Color(255, 51, 51));
        AddBtn.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        RemoveBtn.setBackground(new java.awt.Color(255, 51, 51));
        RemoveBtn.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        RemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        RemoveBtn.setText("Remove");
        RemoveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoveBtnMouseClicked(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(255, 51, 51));
        EditBtn.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 255, 255));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        ClearBtn.setBackground(new java.awt.Color(255, 51, 51));
        ClearBtn.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setText("Clear");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel7.setText("Tip");

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel8.setText("Poslednji servis");

        Toner_poslednjiservis.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        Toner_tip.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        Toner_tip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CrnoBeli", "Color" }));

        Toner_table.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        Toner_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "IP adresa", "Model", "Marka", "Lokacija", "Toner", "Poslednja promena", "Driver", "Inventarski broj", "Tip", "Slika", "Poslednji servis", "Status"
            }
        ));
        Toner_table.setSelectionBackground(new java.awt.Color(255, 102, 102));
        Toner_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Toner_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Toner_table);

        Toner_invbroj.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel10.setText("Inventarski broj");

        ID_Toner.setEditable(false);
        ID_Toner.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel16.setText("ID Štampača");

        Toner_ipaddress.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel17.setText("IP adresa");

        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel12.setText("Marka");

        Toner_marka.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        Toner_marka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Toner_markaActionPerformed(evt);
            }
        });

        Toner_model.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel13.setText("Model");

        jLabel18.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel18.setText("Lokacija");

        Toner_lokacija.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        Toner_lokacija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Toner_lokacijaActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel19.setText("Slika");

        Toner_slika.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        Toner_slika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Toner_slikaActionPerformed(evt);
            }
        });

        Toner_status.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        Toner_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Toner_statusActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel20.setText("Status");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(ID_Toner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(Toner_ipaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Toner_poslednjaprom)
                            .addComponent(Toner_toner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Toner_driver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Toner_tip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Toner_poslednjiservis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AddBtn)
                        .addGap(18, 18, 18)
                        .addComponent(EditBtn)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ClearBtn)
                        .addGap(104, 104, 104)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Toner_lokacija, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addComponent(Toner_invbroj, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Toner_model)
                    .addComponent(Toner_marka, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Toner_status, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Toner_slika, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Toner_toner, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(Toner_poslednjaprom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Toner_tip, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(Toner_invbroj, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Toner_driver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Toner_poslednjiservis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(Toner_lokacija, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ID_Toner, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Toner_ipaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Toner_slika, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Toner_marka, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Toner_status, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Toner_model, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel11.setText("Evidencija zamena tonera");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 283, 283)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel11)))
                        .addGap(0, 721, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
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
        jMenu4.setForeground(new java.awt.Color(255, 51, 51));
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

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if( Toner_marka.getText().isEmpty() || Toner_toner.getText().isEmpty() || Toner_model.getText().isEmpty() || ID_Toner.getText().isEmpty() || Toner_invbroj.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Popunite sva polja!");
            
        }
        else{
        try {
                     
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/toneridb","User1","test");
            PreparedStatement add = Con.prepareStatement("insert into PRINTERS values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(ID_Toner.getText()));
            add.setString(2, Toner_ipaddress.getText());
            add.setString(3, Toner_model.getText());
            add.setString(4, Toner_marka.getText());
            add.setString(5, Toner_toner.getText());
            add.setString(6, Toner_driver.getText());
            add.setString(7, Toner_poslednjaprom.getText());
            add.setString(8, Toner_poslednjiservis.getText());
            add.setString(9, Toner_invbroj.getText());
            add.setString(10, Toner_slika.getText());
            add.setString(11, Toner_tip.getSelectedItem().toString());  
            add.setString(12, Toner_lokacija.getText());
            add.setString(13, Toner_status.getText());
            
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Toner added succesfully");   
            Con.close();
            SelectToner();
        } catch (Exception e) {
                    e.printStackTrace();
            }
        
    }//GEN-LAST:event_AddBtnMouseClicked
    }
    private void Toner_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Toner_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel)Toner_table.getModel();
        int Myindex = Toner_table.getSelectedRow();
        ID_Toner.setText(model.getValueAt(Myindex, 0).toString());
        Toner_ipaddress.setText(model.getValueAt(Myindex, 1).toString());
        Toner_model.setText(model.getValueAt(Myindex, 2).toString());
        Toner_marka.setText(model.getValueAt(Myindex, 3).toString());
        Toner_lokacija.setText(model.getValueAt(Myindex, 11).toString());
        Toner_toner.setText(model.getValueAt(Myindex, 4).toString());
        Toner_poslednjaprom.setText(model.getValueAt(Myindex, 6).toString());
        Toner_driver.setText(model.getValueAt(Myindex, 5).toString());
        Toner_invbroj.setText(model.getValueAt(Myindex, 8).toString());
        Toner_tip.setSelectedItem(model.getValueAt(Myindex, 10).toString());
        Toner_slika.setText(model.getValueAt(Myindex, 9).toString());
        Toner_poslednjiservis.setText(model.getValueAt(Myindex, 7).toString());
        Toner_status.setText(model.getValueAt(Myindex, 12).toString());
        
        
    }//GEN-LAST:event_Toner_tableMouseClicked

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        ID_Toner.setText("");
        Toner_ipaddress.setText("");
        Toner_model.setText("");
        Toner_marka.setText("");
        Toner_lokacija.setText("");
        Toner_toner.setText("");
        Toner_poslednjaprom.setText("");
        Toner_driver.setText("");
        Toner_invbroj.setText("");
        Toner_tip.setSelectedItem("");
        Toner_slika.setText("");
        Toner_poslednjiservis.setText("");
        Toner_status.setText("");
        
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void RemoveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveBtnMouseClicked
       if(ID_Toner.getText().isEmpty())
       {
          JOptionPane.showMessageDialog(this,"Enter toner to be deleted"); 
       }
       else
       {
           int respone = JOptionPane.showConfirmDialog(this,"Da li stvarno želite da obrišete toner?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           
           if(respone == JOptionPane.YES_OPTION){
           try{
             Con = DriverManager.getConnection("jdbc:derby://localhost:1527/toneridb","User1","test");
             String TId = ID_Toner.getText();
             String Query = "Delete from User1.PRINTERS where PRINTID="+TId;
             Statement Add = Con.createStatement();
             Add.executeUpdate(Query);
             SelectToner();
             JOptionPane.showMessageDialog(this,"Toner deleted Succesfully");
           }catch(Exception e)
           {
              e.printStackTrace();
           }
       }
              else if(respone == JOptionPane.NO_OPTION){
                  System.out.println("canceled");
    }
       }
    
    }//GEN-LAST:event_RemoveBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(Toner_marka.getText().isEmpty() || Toner_toner.getText().isEmpty() || Toner_model.getText().isEmpty() || ID_Toner.getText().isEmpty() ||
               Toner_invbroj.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing information");
    }//GEN-LAST:event_EditBtnMouseClicked
else
        {
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/toneridb","User1","test");
                String Query = "Update User1.PRINTERS set IP_ADDRESS='"+Toner_ipaddress.getText()+"'"+",MODEL='"+Toner_model.getText()+"'"+",LOKACIJA='"+Toner_lokacija.getText()+"'"+",MARKA='"+Toner_marka.getText()+"'"+",STATUS='"+Toner_status.getText()+"'"+",TIP='"+Toner_tip.getSelectedItem().toString()+"'"+",SLIKA='"+Toner_slika.getText()+"'"+",POSLEDNJI_SERVIS='"+Toner_poslednjiservis.getText()+"'"+",INV_BROJ='"+Toner_invbroj.getText()+"'"+",TONER='"+Toner_toner.getText()+"'"+",DRIVER='"+Toner_driver.getText()+"'"+",POSLEDNJA_PROMENA='"+Toner_poslednjaprom.getText()+"'"+" where PRINTID="+ID_Toner.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectToner();
                JOptionPane.showMessageDialog(this,"Toner updated");
                
            }catch(SQLException e){
            e.printStackTrace();}
        
        }
    
    }
    private void Toner_lokacijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Toner_lokacijaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Toner_lokacijaActionPerformed

    private void Toner_markaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Toner_markaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Toner_markaActionPerformed

    private void Toner_slikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Toner_slikaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Toner_slikaActionPerformed

    private void Toner_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Toner_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Toner_statusActionPerformed

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
            java.util.logging.Logger.getLogger(EditPrinters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPrinters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPrinters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPrinters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPrinters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField ID_Toner;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JTextField Toner_driver;
    private javax.swing.JTextField Toner_invbroj;
    private javax.swing.JTextField Toner_ipaddress;
    private javax.swing.JTextField Toner_lokacija;
    private javax.swing.JTextField Toner_marka;
    private javax.swing.JTextField Toner_model;
    private javax.swing.JTextField Toner_poslednjaprom;
    private javax.swing.JTextField Toner_poslednjaprom2;
    private javax.swing.JTextField Toner_poslednjiservis;
    private javax.swing.JTextField Toner_slika;
    private javax.swing.JTextField Toner_status;
    private javax.swing.JTable Toner_table;
    private javax.swing.JComboBox<String> Toner_tip;
    private javax.swing.JTextField Toner_toner;
    private javax.swing.JTextField Toner_toner2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
