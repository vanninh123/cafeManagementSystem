/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MY PC
 */
public class ProductDao {
    Connection c = MyConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    
    public boolean isProductExist(String id){
        try {
            ps = c.prepareStatement("SELECT * FROM product WHERE id = ?");
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean insertProduct(Product product){ 

            String sql = "INSERT INTO product(id, name, quantity, price, type, image) VALUES(?,?,?,?,?,?)";
            try {
                ps = c.prepareStatement(sql);
                ps.setString(1, product.getId());
                ps.setString(2, product.getName());
                ps.setInt(3, product.getQuantity());
                ps.setInt(4, product.getPrice());
                ps.setString(5, product.getType());
                ps.setBytes(6, product.getImage());
                return ps.executeUpdate() > 0;
            } catch (SQLException ex) {
                return false;
            }
        }
    public void getAllProducts(JTable table){
        String sql = "SELECT * FROM product ORDER BY id DESC";
        try{
            ps = c.prepareStatement(sql);
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object [] row;
            while(rs.next()){
                row = new Object[6];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getInt(3);
                row[3] = rs.getInt(4);
                row[4] = rs.getString(5);
                row[5] = rs.getBytes(6);
                model.addRow(row);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Can not connect to database", "Warning", 2);
        }
    }
    
    public boolean update(Product product){
        String sql = "UPDATE product set name = ?, quantity = ?, price = ?, type = ?, image = ? WHERE id = ?";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setInt(2, product.getQuantity());
            ps.setInt(3, product.getPrice());
            ps.setString(4, product.getType());
            ps.setBytes(5, product.getImage());
            ps.setString(6, product.getId());
            return ps.executeUpdate() > 0;
        }
        catch (SQLException e){
            return false;
        }
    }
    public boolean delete(String id){
        try {
            ps = c.prepareStatement("DELETE FROM product WHERE id = ?");
            ps.setString(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
           return false;
        }
    }
    
}
