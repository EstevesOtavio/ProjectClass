package Controller;

import Model.UserDAO;
import Screens.PrincipalScreen;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UserControl {
    
    UserDAO userDAO = new UserDAO();
     
    public boolean authenticateUser(String name, String key){
        
        ResultSet rsLogin = userDAO.validarResultSet(name, key);
        
        try{
            if(rsLogin != null){
                JOptionPane.showMessageDialog(null, "User: "+rsLogin.getString("user"));
                
                PrincipalScreen ps = new PrincipalScreen();
            
                ps.setVisible(true);
                ps.nameLabel.setText("Welcome, "+rsLogin.getString("user"));
                
                return true;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex);
            return false;
        }
        
        return false;
    }
             
}
