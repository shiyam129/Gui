/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_gui;


import javax.swing.JOptionPane;

/**
 *
 * @author thosiba c55-b5101
 */
public class viewLogin extends javax.swing.JFrame {

    /**
     * Creates new form viewLogin
     */
    public viewLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        panelbody = new javax.swing.JPanel();
        PanelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        PanelMain = new javax.swing.JPanel();
        PanelHome = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PanelKuliner = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        PanelBupati = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Panelwisata = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        PanelNav = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnWisata = new javax.swing.JButton();
        btnKuliner = new javax.swing.JButton();
        btnBupati = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        dialogBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("About Majalengka City");

        panelbody.setBackground(new java.awt.Color(52, 152, 219));
        panelbody.setLayout(new java.awt.CardLayout());

        PanelLogin.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MAJALENGKA");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password :");

        jTextField2.setBackground(new java.awt.Color(44, 62, 80));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);

        btnLogin.setBackground(new java.awt.Color(52, 152, 219));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Don't have a account ?");

        jPasswordField1.setBackground(new java.awt.Color(44, 62, 80));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);

        jCheckBox1.setBackground(new java.awt.Color(44, 62, 80));
        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(51, 102, 255));
        jCheckBox1.setText("Register  Here");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\thosiba c55-b5101\\Desktop\\Documents\\lambang 2.png")); // NOI18N
        jLabel12.setToolTipText("");
        jLabel12.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 133));

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGroup(PanelLoginLayout.createSequentialGroup()
                                .addComponent(btnLogin)
                                .addGap(5, 5, 5)))
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLoginLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1))
                            .addGroup(PanelLoginLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelLoginLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        panelbody.add(PanelLogin, "card2");

        PanelMenu.setBackground(new java.awt.Color(52, 73, 94));
        PanelMenu.setAutoscrolls(true);

        PanelMain.setBackground(new java.awt.Color(52, 152, 219));
        PanelMain.setLayout(new java.awt.CardLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ABOUT MAJALENGKA");

        javax.swing.GroupLayout PanelHomeLayout = new javax.swing.GroupLayout(PanelHome);
        PanelHome.setLayout(PanelHomeLayout);
        PanelHomeLayout.setHorizontalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHomeLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(66, 66, 66))
        );
        PanelHomeLayout.setVerticalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHomeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addContainerGap(426, Short.MAX_VALUE))
        );

        PanelMain.add(PanelHome, "card5");

        PanelKuliner.setBackground(new java.awt.Color(52, 152, 219));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("KULINER DI MAJALENGKA");

        javax.swing.GroupLayout PanelKulinerLayout = new javax.swing.GroupLayout(PanelKuliner);
        PanelKuliner.setLayout(PanelKulinerLayout);
        PanelKulinerLayout.setHorizontalGroup(
            PanelKulinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelKulinerLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(80, 80, 80))
        );
        PanelKulinerLayout.setVerticalGroup(
            PanelKulinerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelKulinerLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel11)
                .addContainerGap(423, Short.MAX_VALUE))
        );

        PanelMain.add(PanelKuliner, "card3");

        PanelBupati.setBackground(new java.awt.Color(52, 152, 219));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BUPATI MAJALENGKA");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DARI MASA KE MASA");

        javax.swing.GroupLayout PanelBupatiLayout = new javax.swing.GroupLayout(PanelBupati);
        PanelBupati.setLayout(PanelBupatiLayout);
        PanelBupatiLayout.setHorizontalGroup(
            PanelBupatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBupatiLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(PanelBupatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBupatiLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBupatiLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(102, 102, 102))))
        );
        PanelBupatiLayout.setVerticalGroup(
            PanelBupatiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBupatiLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(398, Short.MAX_VALUE))
        );

        PanelMain.add(PanelBupati, "card4");

        Panelwisata.setBackground(new java.awt.Color(52, 152, 219));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("WISATA DI MAJALENGKA");

        javax.swing.GroupLayout PanelwisataLayout = new javax.swing.GroupLayout(Panelwisata);
        Panelwisata.setLayout(PanelwisataLayout);
        PanelwisataLayout.setHorizontalGroup(
            PanelwisataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelwisataLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(83, 83, 83))
        );
        PanelwisataLayout.setVerticalGroup(
            PanelwisataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelwisataLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addContainerGap(429, Short.MAX_VALUE))
        );

        PanelMain.add(Panelwisata, "card2");

        PanelNav.setBackground(new java.awt.Color(52, 152, 219));

        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnWisata.setText("WISATA");
        btnWisata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWisataActionPerformed(evt);
            }
        });

        btnKuliner.setText("KULINER");
        btnKuliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKulinerActionPerformed(evt);
            }
        });

        btnBupati.setText("BUPATI");
        btnBupati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBupatiActionPerformed(evt);
            }
        });

        btnAbout.setText("ABOUT");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        dialogBtn.setText("LOGOUT");
        dialogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialogBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MAJALENGKA");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CITY");

        javax.swing.GroupLayout PanelNavLayout = new javax.swing.GroupLayout(PanelNav);
        PanelNav.setLayout(PanelNavLayout);
        PanelNavLayout.setHorizontalGroup(
            PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNavLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnWisata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKuliner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBupati, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dialogBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNavLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46))
        );
        PanelNavLayout.setVerticalGroup(
            PanelNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNavLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addGap(18, 18, 18)
                .addComponent(btnWisata)
                .addGap(18, 18, 18)
                .addComponent(btnKuliner)
                .addGap(18, 18, 18)
                .addComponent(btnBupati)
                .addGap(18, 18, 18)
                .addComponent(btnAbout)
                .addGap(18, 18, 18)
                .addComponent(dialogBtn)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelNav, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelbody.add(PanelMenu, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        //remove panel;
        PanelLogin.removeAll();
        PanelLogin.repaint();
        PanelLogin.revalidate();
        //add panel
        PanelLogin.add(PanelMenu);
        PanelLogin.add(PanelMain);
        PanelLogin.add(PanelNav);
        PanelLogin.revalidate();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
                //remove panel;
        PanelMain.removeAll();
        PanelMain.repaint();
        PanelMain.revalidate();
        //add panel
        PanelMain.add(PanelHome);
        PanelMain.revalidate();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnWisataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWisataActionPerformed
        // TODO add your handling code here:
        //remove panel;
        PanelMain.removeAll();
        PanelMain.repaint();
        PanelMain.revalidate();
        //add panel
        PanelMain.add(Panelwisata);
        PanelMain.revalidate();
    }//GEN-LAST:event_btnWisataActionPerformed

    private void btnKulinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKulinerActionPerformed
        // TODO add your handling code here:
                        //remove panel;
        PanelMain.removeAll();
        PanelMain.repaint();
        PanelMain.revalidate();
        //add panel
        PanelMain.add(PanelKuliner);
        PanelMain.revalidate();
    }//GEN-LAST:event_btnKulinerActionPerformed

    private void btnBupatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBupatiActionPerformed
        // TODO add your handling code here:                //remove panel;
        PanelMain.removeAll();
        PanelMain.repaint();
        PanelMain.revalidate();
        //add panel
        PanelMain.add(PanelBupati);
        PanelMain.revalidate();
    }//GEN-LAST:event_btnBupatiActionPerformed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
         MainView n = new MainView();
         n.setVisible(true);
        
    }//GEN-LAST:event_btnAboutActionPerformed

    private void dialogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialogBtnActionPerformed
        // TODO add your handling code here:
        int dialogBTn = JOptionPane.YES_NO_OPTION;
        int dialogResult;
        dialogResult = JOptionPane.showConfirmDialog(this,"Apakah anda yakin ingin keuar?");
        if (dialogResult==0){
            //true condition
            System.exit(0);
        }else{
            //false condition
        }
    }//GEN-LAST:event_dialogBtnActionPerformed

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
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBupati;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JPanel PanelKuliner;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPanel PanelMain;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelNav;
    private javax.swing.JPanel Panelwisata;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnBupati;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnKuliner;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnWisata;
    private javax.swing.JButton dialogBtn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panelbody;
    // End of variables declaration//GEN-END:variables
}
