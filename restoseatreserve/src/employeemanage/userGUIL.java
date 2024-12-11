package employeemanage;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author STI
 */
public class userGUI extends javax.swing.JFrame {

    ImageIcon line = new ImageIcon("C:\\Users\\STI\\Downloads\\EmployeeSystem-main\\restoseatreserve\\src\\employeemanage\\line-graph.png");
    ImageIcon bar = new ImageIcon("C:\\Users\\STI\\Downloads\\EmployeeSystem-main\\restoseatreserve\\src\\employeemanage\\bar-graph.png");
    /**
     * Creates new form userGUI
     */
    public userGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        infoPanel = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        greet = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        balanceLabel = new javax.swing.JLabel();
        salaryFIeld = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        balanceFIeld = new javax.swing.JLabel();
        lastpaidField = new javax.swing.JLabel();
        lastpaidLabel = new javax.swing.JLabel();
        barGraph = new javax.swing.JButton();
        lineGraph = new javax.swing.JButton();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        infoPanel.setBackground(new java.awt.Color(0, 0, 102));
        infoPanel.setForeground(new java.awt.Color(0, 0, 51));
        infoPanel.setPreferredSize(new java.awt.Dimension(310, 630));

        userName.setFont(new java.awt.Font("Cambria Math", 1, 30)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("NAME");

        greet.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        greet.setForeground(new java.awt.Color(255, 255, 255));
        greet.setText("Welcome back,");

        idLabel.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        idLabel.setForeground(new java.awt.Color(255, 255, 255));
        idLabel.setText("ID:");

        idField.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        idField.setForeground(new java.awt.Color(255, 255, 255));
        idField.setText("idField");

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(greet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(logoutBtn)
                        .addContainerGap(100, Short.MAX_VALUE))
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(idField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(greet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName)
                .addGap(31, 31, 31)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(59, 59, 59))
        );

        balanceLabel.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        balanceLabel.setText("Balance");

        salaryFIeld.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        salaryFIeld.setText("salaryField");

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jLabel1.setText("Salary");

        balanceFIeld.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        balanceFIeld.setText("balanceFIeld");

        lastpaidField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lastpaidField.setText("lastpaidField");

        lastpaidLabel.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        lastpaidLabel.setText("Last paid");

        barGraph.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        barGraph.setText("Bar Graph");
        barGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barGraphActionPerformed(evt);
            }
        });

        lineGraph.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lineGraph.setText("Line Graph");
        lineGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineGraphActionPerformed(evt);
            }
        });

        pic.setBackground(new java.awt.Color(255, 255, 255));
        pic.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(barGraph)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lineGraph)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(balanceLabel)
                                    .addComponent(balanceFIeld))
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(salaryFIeld))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastpaidLabel)
                                    .addComponent(lastpaidField))))
                        .addGap(109, 109, 109))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lastpaidLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastpaidField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(balanceLabel)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salaryFIeld)
                            .addComponent(balanceFIeld))))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barGraph)
                    .addComponent(lineGraph))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>                        

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int select = JOptionPane.showConfirmDialog(logoutBtn, "Are you sure you want to logout?");
            if (select == 0) {
                    dispose();      
                    JOptionPane.showMessageDialog(null, "Logout Sucessfully");
                    Restoseatreserve.main(null);
            }
    }                                         

    private void lineGraphActionPerformed(java.awt.event.ActionEvent evt) {                                          
        pic.setIcon(line);
    }                                         

    private void barGraphActionPerformed(java.awt.event.ActionEvent evt) {                                         
        pic.setIcon(bar);
    }                                        

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
            java.util.logging.Logger.getLogger(userGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userGUI().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify                     
    private javax.swing.JLabel balanceFIeld;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton barGraph;
    private javax.swing.JLabel greet;
    private javax.swing.JLabel idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastpaidField;
    private javax.swing.JLabel lastpaidLabel;
    private javax.swing.JButton lineGraph;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel salaryFIeld;
    private javax.swing.JLabel userName;
    // End of variables declaration                   
}
