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

/**
 *
 * @author MY PC
 */
public class AdminDao {
    Connection c = MyConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public int getMaxRowAdminTable(){
        int row = 0;
        try {
            st = c.createStatement();
            rs = st.executeQuery("SELECT MAX(id) from admin");
            while(rs.next()){
                row = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return row + 1;
    }
    public boolean isAdminExist(String username){
        try {
            ps = c.prepareStatement("SELECT * FROM admin WHERE username = ?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean insert(Admin admin){ 
 
        String sql = "INSERT into admin(id, username, password, emailAdress) VALUES(?,?,?,?)";
        try {
            ps = c.prepareStatement(sql);
            ps.setString(1, String.valueOf(admin.getId()));
            ps.setString(2, admin.getUsername());
            String hashedPassword = Admin.hashPassword(admin.getPassword());
            ps.setString(3, hashedPassword);
            ps.setString(4, admin.getEmail());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
    }
    public boolean checkUsername(String username){
        try {
            ps = c.prepareStatement("SELECT * FROM admin WHERE username = ?");
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
        public boolean checkPassword(String username, String password){
        try {
            ps = c.prepareStatement("SELECT * FROM admin WHERE username = ? and password = ?");
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
