package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {
      
    private static Connection conn = null;
      
    public static Connection getConnection(){
        if (conn == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/POOII_ListProjects", "root", "Y_7hcg8_r4kMeWV");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: "+e);
            }
        }
        return conn;
    }
}
