/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toneri;

import java.awt.Desktop;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Milos Jelic
 */
public class Stampaci extends javax.swing.JFrame {
   String sDB = "jdbc:derby://localhost:1527/toneridb";
   String sUser = "User1";
   String sPassword = "test";
   String LinkTo = "";
    private String stampac_toner;

 
   
    public Stampaci() {
        initComponents();
        setLocationRelativeTo(null);
    }

  
 
 
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Printer_slika = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Printer_ipaddr = new javax.swing.JLabel();
        Printer_toner = new javax.swing.JLabel();
        Printer_poslednjaprom = new javax.swing.JLabel();
        Printer_poslednjiservis = new javax.swing.JLabel();
        Printer_marka = new javax.swing.JLabel();
        Printer_model = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Printer_invbroj = new javax.swing.JLabel();
        jTextField1_printer_id = new javax.swing.JTextField();
        StampacId = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Printer_tip = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Printer_kolicina = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Printer_lokacija = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LinkToDriver = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Printer_status = new javax.swing.JLabel();
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
        jLabel4.setText("Štampači info");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Printer_slika.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        Printer_slika.setText("Slika");

        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel5.setText("IP Adress :");

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel6.setText("Toner :");

        jLabel7.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel7.setText("Driver :");

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel8.setText("Poslednja promena tonera :");

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel10.setText("Poslednji servis :");

        Printer_ipaddr.setBackground(new java.awt.Color(255, 255, 255));
        Printer_ipaddr.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        Printer_toner.setBackground(new java.awt.Color(255, 255, 255));
        Printer_toner.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        Printer_poslednjaprom.setBackground(new java.awt.Color(255, 255, 255));
        Printer_poslednjaprom.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        Printer_poslednjiservis.setBackground(new java.awt.Color(255, 255, 255));
        Printer_poslednjiservis.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        Printer_marka.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        Printer_marka.setText("test");

        Printer_model.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        Printer_model.setText("test");

        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel12.setText("Inventarski broj :");

        Printer_invbroj.setBackground(new java.awt.Color(255, 255, 255));
        Printer_invbroj.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jTextField1_printer_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_printer_idActionPerformed(evt);
            }
        });
        jTextField1_printer_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1_printer_idKeyReleased(evt);
            }
        });

        StampacId.setBackground(new java.awt.Color(255, 255, 255));
        StampacId.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel9.setText("Unesi ID štampača");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pretraži");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel1.setText("ID Štampača :");

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Poništi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel11.setText("Tip :");

        Printer_tip.setBackground(new java.awt.Color(255, 255, 255));
        Printer_tip.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel13.setText("Količina tonera :");

        Printer_kolicina.setBackground(new java.awt.Color(255, 255, 255));
        Printer_kolicina.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel14.setText("Lokacija :");

        Printer_lokacija.setBackground(new java.awt.Color(255, 255, 255));
        Printer_lokacija.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        LinkToDriver.setBackground(new java.awt.Color(255, 255, 255));
        LinkToDriver.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        LinkToDriver.setForeground(new java.awt.Color(51, 51, 255));
        LinkToDriver.setText("Link");
        LinkToDriver.setBorder(null);
        LinkToDriver.setBorderPainted(false);
        LinkToDriver.setContentAreaFilled(false);
        LinkToDriver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LinkToDriver.setFocusPainted(false);
        LinkToDriver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LinkToDriverMouseClicked(evt);
            }
        });
        LinkToDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkToDriverActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel15.setText("Status :");

        Printer_status.setBackground(new java.awt.Color(255, 255, 255));
        Printer_status.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Printer_slika, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(StampacId)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Printer_lokacija)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Printer_kolicina)
                                    .addComponent(LinkToDriver))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addGap(167, 167, 167))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Printer_ipaddr)
                                    .addComponent(Printer_toner)
                                    .addComponent(Printer_poslednjaprom))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextField1_printer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(194, 194, 194))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Printer_invbroj)
                                    .addComponent(Printer_tip)
                                    .addComponent(Printer_poslednjiservis))
                                .addContainerGap(540, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(131, 131, 131)
                                .addComponent(Printer_status))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Printer_marka)
                                    .addGap(96, 96, 96)
                                    .addComponent(Printer_model, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(Printer_slika, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StampacId)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Printer_marka)
                            .addComponent(Printer_model))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(Printer_ipaddr))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(Printer_toner))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(Printer_poslednjaprom))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(Printer_kolicina))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(LinkToDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(Printer_poslednjiservis))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Printer_invbroj)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(Printer_tip)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1_printer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Printer_lokacija)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Printer_status)
                    .addComponent(jLabel15))
                .addContainerGap(63, Short.MAX_VALUE))
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
                                .addGap(218, 218, 218)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 295, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        jMenu5.setForeground(new java.awt.Color(255, 51, 51));
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

    private void jTextField1_printer_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_printer_idActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_printer_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String printer_id = jTextField1_printer_id.getText();
          
                StampacId.setText("");
                    Printer_ipaddr.setText("");
                    Printer_model.setText("");
                    Printer_marka.setText("");
                    Printer_toner.setText("");
                    LinkTo = "";  
                    Printer_poslednjaprom.setText("");
                    Printer_poslednjiservis.setText("");
                    Printer_invbroj.setText("");
                    Printer_slika.setIcon(new ImageIcon(""));
                    Printer_kolicina.setText("");
                    Printer_lokacija.setText("");
                    Printer_tip.setText("");
                    Printer_status.setText("");    
                 
               if(printer_id.length() > 0){
                String query = "SELECT * FROM User1.PRINTERS WHERE PRINTID = ?";
                Connection con = DriverManager.getConnection(sDB, sUser, sPassword);
                PreparedStatement pstmt = con.prepareStatement(query); 
                pstmt.setString(1,printer_id);
                java.sql.ResultSet rs = pstmt.executeQuery();
                if(rs.next()){
                    String stampac_id = rs.getString(1);
                    String stampac_ipaddr = rs.getString(2);
                    String stampac_model = rs.getString(3);
                    String stampac_marka = rs.getString(4);
                    String stampac_toner = rs.getString(5);
                    Date stampac_poslednjapromena = rs.getDate(7);
                    Date stampac_poslednjiservis = rs.getDate(8);
                    String stampac_invbroj = rs.getString(9);
                    String stampac_slika = rs.getString(10);
                    String stampac_tip = rs.getString(11);
                    
                    String stampac_lokacija = rs.getString(12);
                    String stampac_status = rs.getString(13);
                    
                    DateFormat dateFormat = new SimpleDateFormat("d-M-Y");  
                    String strDate = dateFormat.format(stampac_poslednjapromena);
                    String strDate2 = dateFormat.format(stampac_poslednjiservis);
                    System.out.println(strDate);
                    
                    LinkTo = rs.getString(6);
                    StampacId.setText(stampac_id);
                    Printer_ipaddr.setText(stampac_ipaddr);
                    Printer_model.setText(stampac_model);
                    Printer_marka.setText(stampac_marka);
               
                    Printer_poslednjaprom.setText(strDate);
                    Printer_poslednjiservis.setText(strDate2);
                    Printer_invbroj.setText(stampac_invbroj);
                    Printer_slika.setIcon(new ImageIcon("D:\\Toneri\\src\\toneri\\slike\\" + stampac_slika + ".png"));
                    Printer_tip.setText(stampac_tip);
               
                    Printer_lokacija.setText(stampac_lokacija);
                    Printer_status.setText(stampac_status);
                    
                   String query2 = "SELECT * FROM User1.TONERI WHERE TONER_NAZIV = ?";
                   PreparedStatement pstmt2 = con.prepareStatement(query2);
                   pstmt2.setString(1,stampac_toner);
                   java.sql.ResultSet rs2 = pstmt2.executeQuery();
                   if(rs2.next()){
                       String toner = rs2.getString(2);
                       String kolicina = rs2.getString(3);
                       Printer_toner.setText(toner);
                       Printer_kolicina.setText(kolicina);
                   }
                   else{
                    JOptionPane.showMessageDialog(null, "Stampac nema svoj toner, unesite toner za stampac", "a", JOptionPane.ERROR_MESSAGE);                   
                    jTextField1_printer_id.setText("");
                }
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "No data for this ID", "a", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(null,"Enter a valid ID","Printer ID",JOptionPane.INFORMATION_MESSAGE);
                    jTextField1_printer_id.setText("");
                }
                   
                   
                   
                   
                
            }else{
                JOptionPane.showMessageDialog(null, "No data for this ID", "a", JOptionPane.ERROR_MESSAGE);
            }
        }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "SQL Syntax should be reviewed", "Database", JOptionPane.ERROR_MESSAGE);
                    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1_printer_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_printer_idKeyReleased
        if(jTextField1_printer_id.getText().length()==0){
                    StampacId.setText("");
                    Printer_ipaddr.setText("");
                    Printer_model.setText("");
                    Printer_marka.setText("");
                    Printer_toner.setText("");
                    LinkTo = "";  
                    Printer_poslednjaprom.setText("");
                    Printer_poslednjiservis.setText("");
                    Printer_invbroj.setText("");
                    Printer_slika.setIcon(new ImageIcon(""));
                    Printer_kolicina.setText("");
                    Printer_lokacija.setText("");
                    Printer_tip.setText("");
                    Printer_status.setText("");
        }
    }//GEN-LAST:event_jTextField1_printer_idKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                jTextField1_printer_id.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LinkToDriverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkToDriverMouseClicked
            
        if (Desktop.isDesktopSupported()  && LinkTo != null && !LinkTo.isEmpty()) {
					Desktop desktop = Desktop.getDesktop();
					try {
						desktop.browse(new URL (LinkTo).toURI());
					} catch (Exception ex) {
					}
				} else {
                            JOptionPane.showMessageDialog(null, "No data for this Driver", "a", JOptionPane.ERROR_MESSAGE);
				}
    
    }//GEN-LAST:event_LinkToDriverMouseClicked

    private void LinkToDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkToDriverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LinkToDriverActionPerformed

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
            java.util.logging.Logger.getLogger(Stampaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stampaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stampaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stampaci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stampaci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LinkToDriver;
    private javax.swing.JLabel Printer_invbroj;
    private javax.swing.JLabel Printer_ipaddr;
    private javax.swing.JLabel Printer_kolicina;
    private javax.swing.JLabel Printer_lokacija;
    private javax.swing.JLabel Printer_marka;
    private javax.swing.JLabel Printer_model;
    private javax.swing.JLabel Printer_poslednjaprom;
    private javax.swing.JLabel Printer_poslednjiservis;
    private javax.swing.JLabel Printer_slika;
    private javax.swing.JLabel Printer_status;
    private javax.swing.JLabel Printer_tip;
    private javax.swing.JLabel Printer_toner;
    private javax.swing.JLabel StampacId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1_printer_id;
    // End of variables declaration//GEN-END:variables
}
