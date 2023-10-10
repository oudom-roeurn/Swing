package views;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {
    public home() {
        initComponents();
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mgr_control = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        txtGender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        hometable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btnSignOut = new com.k33ptoo.components.KButton();
        btnSignOut2 = new com.k33ptoo.components.KButton();
        btnSignOut3 = new com.k33ptoo.components.KButton();
        btnSignOut4 = new com.k33ptoo.components.KButton();
        Image = new javax.swing.JLabel();
        panelSearch = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        btnSignOut5 = new com.k33ptoo.components.KButton();
        panelProfile = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnSignOut6 = new com.k33ptoo.components.KButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new com.k33ptoo.components.KButton();
        btnSearch = new com.k33ptoo.components.KButton();
        btnProfile = new com.k33ptoo.components.KButton();
        btnSignOut1 = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mgr_control.setBackground(new java.awt.Color(255, 255, 255));
        mgr_control.setLayout(new java.awt.CardLayout());

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Employee System");
        panelHome.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -10, 330, 70));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Last Name");
        panelHome.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 30));

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        panelHome.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 220, 40));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("First Name");
        panelHome.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 30));

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        panelHome.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 220, 40));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        panelHome.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 220, 40));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Address");
        panelHome.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 90, 30));

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        panelHome.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 220, 40));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Gender");
        panelHome.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 30));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Salary");
        panelHome.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 90, 30));

        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });
        panelHome.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 220, 40));

        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", " ", " " }));
        txtGender.setToolTipText("");
        panelHome.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 220, 40));

        hometable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fist Name", "Last Name", "Gender", "Address", "Phone", "Salary", "Image"
            }
        ));
        hometable.setToolTipText("");
        jScrollPane1.setViewportView(hometable);

        panelHome.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 790, 220));

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Phone");
        panelHome.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 90, 30));

        btnSignOut.setBorder(null);
        btnSignOut.setText("Clear");
        btnSignOut.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnSignOut.setkBorderRadius(20);
        btnSignOut.setkEndColor(new java.awt.Color(204, 204, 204));
        btnSignOut.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSignOut.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        btnSignOut.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignOut.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        btnSignOut.setkPressedColor(new java.awt.Color(204, 4, 143));
        btnSignOut.setkSelectedColor(new java.awt.Color(204, 4, 143));
        btnSignOut.setkStartColor(new java.awt.Color(204, 204, 204));
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });
        panelHome.add(btnSignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 160, 40));

        btnSignOut2.setBorder(null);
        btnSignOut2.setText("Add");
        btnSignOut2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnSignOut2.setkBorderRadius(20);
        btnSignOut2.setkEndColor(new java.awt.Color(204, 204, 204));
        btnSignOut2.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSignOut2.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        btnSignOut2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignOut2.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        btnSignOut2.setkPressedColor(new java.awt.Color(204, 4, 143));
        btnSignOut2.setkSelectedColor(new java.awt.Color(204, 4, 143));
        btnSignOut2.setkStartColor(new java.awt.Color(204, 204, 204));
        btnSignOut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOut2ActionPerformed(evt);
            }
        });
        panelHome.add(btnSignOut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 160, 40));

        btnSignOut3.setBorder(null);
        btnSignOut3.setText("Update");
        btnSignOut3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnSignOut3.setkBorderRadius(20);
        btnSignOut3.setkEndColor(new java.awt.Color(204, 204, 204));
        btnSignOut3.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSignOut3.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        btnSignOut3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignOut3.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        btnSignOut3.setkPressedColor(new java.awt.Color(204, 4, 143));
        btnSignOut3.setkSelectedColor(new java.awt.Color(204, 4, 143));
        btnSignOut3.setkStartColor(new java.awt.Color(204, 204, 204));
        btnSignOut3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOut3ActionPerformed(evt);
            }
        });
        panelHome.add(btnSignOut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 160, 40));

        btnSignOut4.setBorder(null);
        btnSignOut4.setText("Delete");
        btnSignOut4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnSignOut4.setkBorderRadius(20);
        btnSignOut4.setkEndColor(new java.awt.Color(204, 204, 204));
        btnSignOut4.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSignOut4.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        btnSignOut4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignOut4.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        btnSignOut4.setkPressedColor(new java.awt.Color(204, 4, 143));
        btnSignOut4.setkSelectedColor(new java.awt.Color(204, 4, 143));
        btnSignOut4.setkStartColor(new java.awt.Color(204, 204, 204));
        btnSignOut4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOut4ActionPerformed(evt);
            }
        });
        panelHome.add(btnSignOut4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 160, 40));

        Image.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Image.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImageMouseClicked(evt);
            }
        });
        panelHome.add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 130, 140));

        mgr_control.add(panelHome, "card2");

        panelSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelSearch.setPreferredSize(new java.awt.Dimension(800, 480));
        panelSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fist Name", "Last Name", "Gender", "Address", "Phone", "Salary", "Image"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        panelSearch.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 810, 310));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        panelSearch.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, 50));

        btnSignOut5.setBorder(null);
        btnSignOut5.setText("Search");
        btnSignOut5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnSignOut5.setkBorderRadius(20);
        btnSignOut5.setkEndColor(new java.awt.Color(204, 204, 204));
        btnSignOut5.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSignOut5.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        btnSignOut5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignOut5.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        btnSignOut5.setkPressedColor(new java.awt.Color(204, 4, 143));
        btnSignOut5.setkSelectedColor(new java.awt.Color(204, 4, 143));
        btnSignOut5.setkStartColor(new java.awt.Color(204, 204, 204));
        btnSignOut5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOut5ActionPerformed(evt);
            }
        });
        panelSearch.add(btnSignOut5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 50));

        mgr_control.add(panelSearch, "card3");

        panelProfile.setBackground(new java.awt.Color(255, 255, 255));
        panelProfile.setPreferredSize(new java.awt.Dimension(800, 480));
        panelProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        panelProfile.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 160));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Last Name");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        panelProfile.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 240, 30));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Salary");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        panelProfile.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 500, 30));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("First Name");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        panelProfile.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 240, 30));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Gender");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        panelProfile.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 500, 30));

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Address");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        panelProfile.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 500, 30));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Phone");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        panelProfile.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 500, 30));

        btnSignOut6.setBorder(null);
        btnSignOut6.setText("Edit");
        btnSignOut6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnSignOut6.setkBorderRadius(20);
        btnSignOut6.setkEndColor(new java.awt.Color(204, 204, 204));
        btnSignOut6.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSignOut6.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        btnSignOut6.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignOut6.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        btnSignOut6.setkPressedColor(new java.awt.Color(204, 4, 143));
        btnSignOut6.setkSelectedColor(new java.awt.Color(204, 4, 143));
        btnSignOut6.setkStartColor(new java.awt.Color(204, 204, 204));
        btnSignOut6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOut6ActionPerformed(evt);
            }
        });
        panelProfile.add(btnSignOut6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 40));

        mgr_control.add(panelProfile, "card3");

        getContentPane().add(mgr_control, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 820, 510));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons8-person-90.png"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(120, 0, 120, 100);

        btnHome.setBorder(null);
        btnHome.setText("Home");
        btnHome.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnHome.setkBorderRadius(80);
        btnHome.setkEndColor(new java.awt.Color(204, 204, 204));
        btnHome.setkForeGround(new java.awt.Color(0, 0, 0));
        btnHome.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        btnHome.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnHome.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        btnHome.setkPressedColor(new java.awt.Color(204, 4, 143));
        btnHome.setkSelectedColor(new java.awt.Color(204, 4, 143));
        btnHome.setkStartColor(new java.awt.Color(204, 204, 204));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel4.add(btnHome);
        btnHome.setBounds(50, 130, 240, 60);

        btnSearch.setBorder(null);
        btnSearch.setText("Search");
        btnSearch.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnSearch.setkBorderRadius(80);
        btnSearch.setkEndColor(new java.awt.Color(204, 204, 204));
        btnSearch.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSearch.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        btnSearch.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSearch.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        btnSearch.setkPressedColor(new java.awt.Color(204, 4, 143));
        btnSearch.setkSelectedColor(new java.awt.Color(204, 4, 143));
        btnSearch.setkStartColor(new java.awt.Color(204, 204, 204));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel4.add(btnSearch);
        btnSearch.setBounds(50, 210, 240, 60);

        btnProfile.setBorder(null);
        btnProfile.setText("Profile");
        btnProfile.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnProfile.setkBorderRadius(80);
        btnProfile.setkEndColor(new java.awt.Color(204, 204, 204));
        btnProfile.setkForeGround(new java.awt.Color(0, 0, 0));
        btnProfile.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        btnProfile.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnProfile.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        btnProfile.setkPressedColor(new java.awt.Color(204, 4, 143));
        btnProfile.setkSelectedColor(new java.awt.Color(204, 4, 143));
        btnProfile.setkStartColor(new java.awt.Color(204, 204, 204));
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        jPanel4.add(btnProfile);
        btnProfile.setBounds(50, 290, 240, 60);

        btnSignOut1.setBorder(null);
        btnSignOut1.setText("Sign Out");
        btnSignOut1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btnSignOut1.setkBorderRadius(80);
        btnSignOut1.setkEndColor(new java.awt.Color(204, 204, 204));
        btnSignOut1.setkForeGround(new java.awt.Color(0, 0, 0));
        btnSignOut1.setkHoverEndColor(new java.awt.Color(0, 126, 242));
        btnSignOut1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignOut1.setkHoverStartColor(new java.awt.Color(204, 4, 143));
        btnSignOut1.setkPressedColor(new java.awt.Color(204, 4, 143));
        btnSignOut1.setkSelectedColor(new java.awt.Color(204, 4, 143));
        btnSignOut1.setkStartColor(new java.awt.Color(204, 204, 204));
        btnSignOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOut1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnSignOut1);
        btnSignOut1.setBounds(40, 400, 260, 70);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, 510));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons8-employee-50.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(850, 0, 90, 60);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Employee Manegerment");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(910, 10, 220, 50);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 70));

        setSize(new java.awt.Dimension(1174, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        mgr_control.removeAll();
        mgr_control.add(panelHome);
        mgr_control.repaint();
        mgr_control.revalidate();
        
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        mgr_control.removeAll();
        mgr_control.add(panelSearch);
        mgr_control.repaint();
        mgr_control.revalidate();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        mgr_control.removeAll();
        mgr_control.add(panelProfile);
        mgr_control.repaint();
        mgr_control.revalidate();
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed

    }//GEN-LAST:event_btnSignOutActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void btnSignOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOut1ActionPerformed
         int check = JOptionPane.showConfirmDialog(null, "Do you wanna close the window?");
        if (check == JOptionPane.YES_OPTION) {
            new sign_up();
            dispose();
        }else if(check == JOptionPane.NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSignOut1ActionPerformed

    private void btnSignOut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOut2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignOut2ActionPerformed

    private void btnSignOut3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOut3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignOut3ActionPerformed

    private void btnSignOut4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOut4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignOut4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void btnSignOut5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOut5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignOut5ActionPerformed

    private void btnSignOut6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOut6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignOut6ActionPerformed

    private void ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImageMouseClicked
         JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            File file = fileChooser.getSelectedFile();
            String fileName = file.getAbsolutePath();
            txtImage.setText(fileName);
            ImageIcon imageIcon = new ImageIcon(fileName);
            Image scaledImage = imageIcon.getImage().getScaledInstance(lbImage.getWidth, lbImage.getHeight(), Image.SCALE_SMOOTH);
            lbImage.setIcon(new ImageIcon(scaledImage));
    }//GEN-LAST:event_ImageMouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private com.k33ptoo.components.KButton btnHome;
    private com.k33ptoo.components.KButton btnProfile;
    private com.k33ptoo.components.KButton btnSearch;
    private com.k33ptoo.components.KButton btnSignOut;
    private com.k33ptoo.components.KButton btnSignOut1;
    private com.k33ptoo.components.KButton btnSignOut2;
    private com.k33ptoo.components.KButton btnSignOut3;
    private com.k33ptoo.components.KButton btnSignOut4;
    private com.k33ptoo.components.KButton btnSignOut5;
    private com.k33ptoo.components.KButton btnSignOut6;
    private javax.swing.JTable hometable;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel mgr_control;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelProfile;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
