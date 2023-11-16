/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UserDAO {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public ResultSet validarResultSet(String login, String key) {
        conn = Conexao.getConnection();
        try {
            pst = conn.prepareStatement("select * from users where " + "user=? and password=?");

            pst.setString(1, login);
            pst.setString(2, key);

            rs = pst.executeQuery();

            if (rs.next()) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        return null;
    }

    /*public boolean validar(String login, String key){
        conn = Conexao.getConnection();
        try{
            pst = conn.prepareStatement("select * from users where "+"user=? and password=?");
            
            pst.setString(1, login);
            pst.setString(2, key);
            
            rs = pst.executeQuery();
            
            if (rs.next()){
                return true;
            }else{
                return false;
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
        }
        return false;
    }*/
}
