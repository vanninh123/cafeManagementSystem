/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe;

import java.awt.Color;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CartDao;
import model.Payment;
import model.PaymentDao;

/**
 *
 * @author MY PC
 */
public class CartFrame extends javax.swing.JFrame {

    
    LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
    CartDao cartDao = new CartDao();
    DefaultTableModel model;
   PaymentDao paymentDao = new PaymentDao();
    public CartFrame() {
        initComponents();
        init();
    }
    
    private void init(){
        JPayment.setText(String.valueOf(cartDao.getMaxCart() - 1));
        JDate.setText(currentDate.format(formatter));
        JTotal.setText(String.valueOf(cartDao.subTotal()));
        tableProduct();
    }
        public void tableProduct(){
            
       cartDao.getAllCarts(JTableProduct);
        model = (DefaultTableModel) JTableProduct.getModel();
        JTableProduct.setRowHeight(100);
        JTableProduct.setShowGrid(true);
        JTableProduct.setGridColor(Color.black);
        JTableProduct.setBackground(new Color(30, 30, 30));           
        JTableProduct.setForeground(Color.WHITE);
        JTableProduct.setSelectionBackground(new Color(51,51,51));
        JTableProduct.setModel(model);
        JTableProduct.getTableHeader().setReorderingAllowed(false);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableProduct = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JPayment = new javax.swing.JTextField();
        JTotal = new javax.swing.JTextField();
        JDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JCash = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JChange = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cart");

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JTableProduct.setAutoCreateRowSorter(true);
        JTableProduct.setBackground(new java.awt.Color(30, 30, 30));
        JTableProduct.setForeground(new java.awt.Color(255, 255, 204));
        JTableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cart ID", "Product ID", "Product Name", "Quantity", "Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(JTableProduct);

        jPanel2.setBackground(new java.awt.Color(30, 30, 30));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information of Cart", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Payment ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Total:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Payment Date:");

        JPayment.setEditable(false);
        JPayment.setBackground(new java.awt.Color(30, 30, 30));
        JPayment.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        JPayment.setForeground(new java.awt.Color(255, 255, 255));
        JPayment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JPayment.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        JPayment.setCaretColor(new java.awt.Color(102, 102, 102));
        JPayment.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        JPayment.setEnabled(false);
        JPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPaymentActionPerformed(evt);
            }
        });

        JTotal.setEditable(false);
        JTotal.setBackground(new java.awt.Color(30, 30, 30));
        JTotal.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        JTotal.setForeground(new java.awt.Color(255, 255, 255));
        JTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        JTotal.setCaretColor(new java.awt.Color(102, 102, 102));
        JTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        JTotal.setEnabled(false);
        JTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTotalActionPerformed(evt);
            }
        });

        JDate.setEditable(false);
        JDate.setBackground(new java.awt.Color(30, 30, 30));
        JDate.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        JDate.setForeground(new java.awt.Color(255, 255, 255));
        JDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JDate.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        JDate.setCaretColor(new java.awt.Color(102, 102, 102));
        JDate.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        JDate.setEnabled(false);
        JDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Customer Name:");

        JName.setBackground(new java.awt.Color(30, 30, 30));
        JName.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        JName.setForeground(new java.awt.Color(255, 255, 255));
        JName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        JName.setCaretColor(new java.awt.Color(102, 102, 102));
        JName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Cash:");

        JCash.setBackground(new java.awt.Color(30, 30, 30));
        JCash.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        JCash.setForeground(new java.awt.Color(255, 255, 255));
        JCash.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JCash.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        JCash.setCaretColor(new java.awt.Color(102, 102, 102));
        JCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCashActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Change:");

        JChange.setEditable(false);
        JChange.setBackground(new java.awt.Color(30, 30, 30));
        JChange.setFont(new java.awt.Font("Segoe UI Symbol", 1, 16)); // NOI18N
        JChange.setForeground(new java.awt.Color(255, 255, 255));
        JChange.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JChange.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));
        JChange.setCaretColor(new java.awt.Color(102, 102, 102));
        JChange.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        JChange.setEnabled(false);
        JChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(JPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                            .addComponent(JDate)
                            .addComponent(JTotal)
                            .addComponent(JName)
                            .addComponent(JCash)
                            .addComponent(JChange))
                        .addGap(0, 29, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(JPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(JDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(JTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(JName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(30, 30, 30));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Payment");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(478, 478, 478)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addContainerGap(556, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void JPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPaymentActionPerformed

    }//GEN-LAST:event_JPaymentActionPerformed

    private void JTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTotalActionPerformed

    private void JDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JDateActionPerformed

    private void JNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JNameActionPerformed

    private void JCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCashActionPerformed

    private void JChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JChangeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) JTableProduct.getModel();
        String proName = "";
        String proId = "";
        for (int i = 0; i < model.getRowCount(); i++){
            proId += model.getValueAt(i, 1).toString() + ", ";
            proName += model.getValueAt(i, 2).toString() + ", ";
        }
        int pid = cartDao.getMaxCart();
        String cName =  JName.getText();
        int total = cartDao.subTotal();
        Payment payment = new Payment(pid, proId, proName, cName,total, JDate.getText().trim());
        if (check()){
            if(paymentDao.insertPayment(payment)){
                JOptionPane.showMessageDialog(this, "Payment Succeed!");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
 
    
    public boolean check(){
        if (JName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Customer name is required", "Warning", 2);
            return false;
        }
        if (JCash.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Cash is required", "Warning", 2);
            return false;
        }
        try {
            Integer.parseInt(JCash.getText().trim());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Quantity must be an integer", "Warning", 2);
            return false;
        }
        int cash = Integer.parseInt(JCash.getText().trim());
        if (cash < cartDao.subTotal()) {
            JOptionPane.showMessageDialog(this, "Cash is not enough money", "Warning", 2);
            return false;
        }
        return true;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new HomeFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JCash;
    private javax.swing.JTextField JChange;
    private javax.swing.JTextField JDate;
    private javax.swing.JTextField JName;
    private javax.swing.JTextField JPayment;
    private javax.swing.JTable JTableProduct;
    private javax.swing.JTextField JTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
