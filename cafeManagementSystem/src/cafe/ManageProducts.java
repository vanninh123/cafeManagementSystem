/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Product;
import model.ProductDao;

public class ManageProducts extends javax.swing.JFrame {

    private File file;
    ProductDao productDao = new ProductDao();
    DefaultTableModel model;
    public ManageProducts() {
        initComponents();
        tableProduct();
        JUdate.setEnabled(false);
        JRemove.setEnabled(false);
    }
    
    public void tableProduct(){
        productDao.getAllProducts(JTableProduct);
        model = (DefaultTableModel) JTableProduct.getModel();
        JTableProduct.setRowHeight(100);
        JTableProduct.setShowGrid(true);
        JTableProduct.setGridColor(Color.black);
        JTableProduct.setBackground(new Color(30, 30, 30));           
        JTableProduct.setForeground(Color.WHITE);
        JTableProduct.setSelectionBackground(new Color(51,51,51));
        JTableProduct.setModel(model);
        JTableProduct.getTableHeader().setReorderingAllowed(false);
        JTableProduct.getColumnModel().getColumn(5).setCellRenderer(new ManageProducts.ImageRenderer());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JID = new javax.swing.JTextField();
        JName = new javax.swing.JTextField();
        JQuantity = new javax.swing.JTextField();
        JPrice = new javax.swing.JTextField();
        JType = new javax.swing.JTextField();
        jFile = new javax.swing.JButton();
        JRemove = new javax.swing.JButton();
        JUdate = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        JAdd = new javax.swing.JButton();
        JImage = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableProduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Products");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, -1));

        jPanel2.setBackground(new java.awt.Color(30, 30, 30));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information of Products", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 204))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Type");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Price");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Image");

        JID.setBackground(new java.awt.Color(30, 30, 30));
        JID.setFont(new java.awt.Font("Segoe UI Symbol", 3, 16)); // NOI18N
        JID.setForeground(new java.awt.Color(204, 204, 204));
        JID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        JID.setCaretColor(new java.awt.Color(102, 102, 102));
        JID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JIDMouseClicked(evt);
            }
        });
        JID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JIDActionPerformed(evt);
            }
        });

        JName.setBackground(new java.awt.Color(30, 30, 30));
        JName.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        JName.setForeground(new java.awt.Color(204, 204, 204));
        JName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        JName.setCaretColor(new java.awt.Color(102, 102, 102));
        JName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNameActionPerformed(evt);
            }
        });

        JQuantity.setBackground(new java.awt.Color(30, 30, 30));
        JQuantity.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        JQuantity.setForeground(new java.awt.Color(204, 204, 204));
        JQuantity.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        JQuantity.setCaretColor(new java.awt.Color(102, 102, 102));
        JQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JQuantityActionPerformed(evt);
            }
        });

        JPrice.setBackground(new java.awt.Color(30, 30, 30));
        JPrice.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        JPrice.setForeground(new java.awt.Color(204, 204, 204));
        JPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        JPrice.setCaretColor(new java.awt.Color(102, 102, 102));
        JPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPriceActionPerformed(evt);
            }
        });

        JType.setBackground(new java.awt.Color(30, 30, 30));
        JType.setFont(new java.awt.Font("Segoe UI Symbol", 0, 16)); // NOI18N
        JType.setForeground(new java.awt.Color(204, 204, 204));
        JType.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        JType.setCaretColor(new java.awt.Color(102, 102, 102));
        JType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTypeActionPerformed(evt);
            }
        });

        jFile.setBackground(new java.awt.Color(30, 30, 30));
        jFile.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jFile.setForeground(new java.awt.Color(204, 204, 204));
        jFile.setText("Image");
        jFile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileActionPerformed(evt);
            }
        });

        JRemove.setBackground(new java.awt.Color(30, 30, 30));
        JRemove.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JRemove.setForeground(new java.awt.Color(255, 51, 0));
        JRemove.setText("Remove");
        JRemove.setFocusPainted(false);
        JRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRemoveActionPerformed(evt);
            }
        });

        JUdate.setBackground(new java.awt.Color(30, 30, 30));
        JUdate.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JUdate.setForeground(new java.awt.Color(0, 153, 153));
        JUdate.setText("Update");
        JUdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUdateActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(30, 30, 30));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 0));
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        JAdd.setBackground(new java.awt.Color(30, 30, 30));
        JAdd.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JAdd.setForeground(new java.awt.Color(204, 153, 0));
        JAdd.setText("Add");
        JAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAddActionPerformed(evt);
            }
        });

        JImage.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JImage.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JType, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JID, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JName, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jFile, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JImage, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(JRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JUdate, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(JAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(JPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JImage))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JUdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 450, 440));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 30, 30));

        JTableProduct.setBackground(new java.awt.Color(30, 30, 30));
        JTableProduct.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        JTableProduct.setForeground(new java.awt.Color(204, 204, 204));
        JTableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "Price", "Type", "Image"
            }
        ));
        JTableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableProduct);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 720, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JIDActionPerformed
    }//GEN-LAST:event_JIDActionPerformed

    private void JNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JNameActionPerformed

    private void JQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JQuantityActionPerformed

    private void JPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPriceActionPerformed

    private void JTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTypeActionPerformed

    private void jFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setMultiSelectionEnabled(false);
        if (jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            this.file = jFileChooser.getSelectedFile();
            JImage.setText(file.getName());
        }
        
    }//GEN-LAST:event_jFileActionPerformed

    private void JRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRemoveActionPerformed
        // TODO add your handling code here:
        String id = JID.getText().trim();
        if (productDao.delete(id)){
            JOptionPane.showMessageDialog(null, "Product deleted successfully..");
            clear();
            this.model.setRowCount(0);
            tableProduct();
        }
        else {
            JOptionPane.showMessageDialog(null, "Delete Failed!", "Warning", 2);
        }
    }//GEN-LAST:event_JRemoveActionPerformed

    private void JUdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUdateActionPerformed
        // TODO add your handling code here:
        if (isValidInfo()){
            try{
                String id = JID.getText().trim();
                String name = JName.getText().trim();
                int quantity = Integer.parseInt(JQuantity.getText());
                int price = Integer.parseInt(JPrice.getText());
                String type = JType.getText().trim();
                byte[] image = Files.readAllBytes(this.file.toPath());
                Product product = new Product(id, name, quantity, price, type, image);
                if (productDao.update(product)){
                    JOptionPane.showMessageDialog(null, "Product updated successfully..");
                    clear();
                    this.model.setRowCount(0);
                    tableProduct();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Update Failed!", "Warning", 2);
                }
            }
                catch (Exception e){
                JOptionPane.showMessageDialog(null, "" + e, "Warning", 2);
            }
        }
    }//GEN-LAST:event_JUdateActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void JAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAddActionPerformed
        // TODO add your handling code here:
        if (isValidInfo()){
            try{
                String id = JID.getText().trim();
                if (!productDao.isProductExist(id))
                {
                    String name = JName.getText().trim();
                    int quantity = Integer.parseInt(JQuantity.getText());
                    int price = Integer.parseInt(JPrice.getText());
                    String type = JType.getText().trim();
                    byte[] image = Files.readAllBytes(this.file.toPath());
                    Product product = new Product(id, name, quantity, price, type, image);
                    if (productDao.insertProduct(product)){
                        JOptionPane.showMessageDialog(null, "Product added successfully..");
                        clear();
                        this.model.setRowCount(0);
                        tableProduct();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Failed!", "Warning", 2);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Product exists!", "Warning", 2);
                }
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "" + e, "Warning", 2);

        }
    }
        
    }//GEN-LAST:event_JAddActionPerformed

    private void JIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JIDMouseClicked
            // TODO add your handling code here:
    }//GEN-LAST:event_JIDMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new HomeFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JTableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableProductMouseClicked
        // TODO add your handling code here:
        JUdate.setEnabled(true);
        JRemove.setEnabled(true);
        JAdd.setEnabled(false);
        model = (DefaultTableModel) JTableProduct.getModel();
        JID.setText(model.getValueAt(JTableProduct.getSelectedRow(), 0).toString());
        JID.setEnabled(false);
        JName.setText(model.getValueAt(JTableProduct.getSelectedRow(), 1).toString());
        JQuantity.setText(model.getValueAt(JTableProduct.getSelectedRow(), 2).toString());
        JPrice.setText(model.getValueAt(JTableProduct.getSelectedRow(), 3).toString());
        JType.setText(model.getValueAt(JTableProduct.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_JTableProductMouseClicked
    
    private void clear(){
        JID.setText(null);
        JName.setText(null);
        JQuantity.setText(null);
        JPrice.setText(null);
        JType.setText(null);
        file = null;
        JImage.setText(null);
        JUdate.setEnabled(false);
        JRemove.setEnabled(false);            
        JID.setEnabled(true);
        JAdd.setEnabled(true);
    }
    public boolean isValidInfo(){
        if (JID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "ID is required", "Warning", 2);
            return false;
        }
        if (JName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Name of Product is required", "Warning", 2);
            return false;
        }
        if (JQuantity.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Quantity of Product is required", "Warning", 2);
            return false;
        }
        if (JPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Price of Product is required", "Warning", 2);
            return false;
        }
        if (JType.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Type of Product is required", "Warning", 2);
            return false;
        }
        if (this.file == null){
            JOptionPane.showMessageDialog(this, "Image of Product is required", "Warning", 2);
            return false;
        }
        try {
            Integer.parseInt(JQuantity.getText().trim());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Quantity must be an integer", "Warning", 2);
            return false;
        }
       try {
            Integer.parseInt(JPrice.getText().trim());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Price must be an integer", "Warning", 2);
            return false;
        }
        return true;
    }
    
    private class ImageRenderer extends DefaultTableCellRenderer{
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
            JLabel jL = new JLabel();
            byte[] bytes = (byte[]) value;
            ImageIcon imageicon = new ImageIcon(new ImageIcon(bytes).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            jL.setIcon(imageicon);
            return jL;
        }
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
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JAdd;
    private javax.swing.JTextField JID;
    private javax.swing.JLabel JImage;
    private javax.swing.JTextField JName;
    private javax.swing.JTextField JPrice;
    private javax.swing.JTextField JQuantity;
    private javax.swing.JButton JRemove;
    private javax.swing.JTable JTableProduct;
    private javax.swing.JTextField JType;
    private javax.swing.JButton JUdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jFile;
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
