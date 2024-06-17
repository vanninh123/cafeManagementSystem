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

/**
 *
 * @author MY PC
 */
public class PaymentDao {
    Connection c = MyConnection.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public boolean insertPayment(Payment payment){ 

            String sql = "INSERT INTO payment(pid, cName, proid, pName, total, pdate) VALUES(?,?,?,?,?,?)";
            try {
                ps = c.prepareStatement(sql);
                ps.setInt(1, payment.getPid());
                ps.setString(2, payment.getcName());
                ps.setString(3, payment.getProId());
                ps.setString(4, payment.getProName());
                ps.setInt(5, payment.getTotal());
                ps.setString(6, payment.getDate());
                return ps.executeUpdate() > 0;
            } catch (SQLException ex) {
                return false;
            }
        }
}
