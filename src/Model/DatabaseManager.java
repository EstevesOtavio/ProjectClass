
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DatabaseManager {
    
    //A alternative version of class "conexao".
    
    static DatabaseManager instance;
    
    private Connection connection;
    
    String DB_URL = "jdbc:mysql://localhost/POOII_ListProjects";
    String DB_USER = "root";
    String DB_PASSWORD = "Y_7hcg8_r4kMeWV";
    
    private DatabaseManager(){
        try{
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Conexão Falhou.");
        }
    }
    
    
    public static synchronized DatabaseManager getInstance(){
        if(instance == null){
            instance = new DatabaseManager();
        }
        return instance;
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void closeConnection(){
        if(connection != null){
            try{
                connection.close();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Conection unclosed.");
            }
        }
    }
}
