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
public class CartDao {
    Connection c = MyConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public boolean isProductExist(int cid, String pid){
        try {
            ps = c.prepareStatement("SELECT * FROM cart WHERE cID = ? and pID = ?");
            ps.setInt(1, cid);
            ps.setString(2, pid);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
        public int getMaxCart(){
        int row = 0;
        try {
            st = c.createStatement();
            rs = st.executeQuery("SELECT max(cID) from cart");
            while(rs.next()){
                row = rs.getInt(1);
            }
        }
        catch(Exception e){
            
        }
        return row + 1;
    }
        
    public int subTotal(){
        int subTotal = 0;
        int cID = getMaxCart() - 1;
        try{
            st = c.createStatement();
            rs = st.executeQuery("SELECT sum(total) as 'total' FROM cart WHERE cID = '" + cID + "'");
            if (rs.next()){
                subTotal = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CartDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return subTotal;
    }   
    
    
        public void getAllCarts(JTable table){
            int cID = getMaxCart() - 1;
            String sql = "SELECT * FROM cart WHERE cID = ?";
            try{
                ps = c.prepareStatement(sql);
                ps.setInt(1, cID);
                rs = ps.executeQuery();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                Object [] row;
                while(rs.next()){
                    row = new Object[6];
                    row[0] = rs.getInt(1);
                    row[1] = rs.getString(2);
                    row[2] = rs.getString(3);
                    row[3] = rs.getInt(4);
                    row[4] = rs.getInt(5);
                    row[5] = rs.getInt(6);
                    model.addRow(row);
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Can not connect to database", "Warning", 2);
            }
    }
    
    public boolean insertCart(Cart cart){ 
            String sql = "INSERT INTO cart(cId, pId, pName, pQuantity , price, total) VALUES(?,?,?,?,?,?)";
            try {
                ps = c.prepareStatement(sql);
                ps.setInt(1, cart.getCid());
                ps.setString(2, cart.getPid());
                ps.setString(3, cart.getpName());
                ps.setInt(4, cart.getpQuantity());
                ps.setInt(5, cart.getPrice());
                ps.setInt(6, cart.getTotal());
                return ps.executeUpdate() > 0;
            } catch (SQLException ex) {
                return false;
            }
        }
    
    public boolean deleteCart(int cid){
        try {
            ps = c.prepareStatement("DELETE FROM cart WHERE cID = ?");
            ps.setInt(1, cid);
            return ps.executeUpdate() > 0;
        } catch(Exception ex){
            return false;
        }
    }
}
