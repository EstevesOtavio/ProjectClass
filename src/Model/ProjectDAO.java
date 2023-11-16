package Model;

import Model.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class ProjectDAO {

    Connection conn;
    PreparedStatement pst;

    public ProjectDAO() {
        pst = null;
        conn = Conexao.getConnection();
    }

    public void insertInDatabase(String coordenador, String agencia, String banco, String cpf, String campus, String celular,
            String conta, String email, String estudante, String evento, String matricula, String titulo) {

        try {
            this.pst = this.conn.prepareStatement(
                    "insert into projects(`coordenador`, `agencia`, `banco`, "
                    + "`cpf`, `campus`, `celular`, `conta`, `email`, `estudante`, `evento`, `matricula`, `titulo`) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

            pst.setString(1, coordenador);
            pst.setString(2, agencia);
            pst.setString(3, banco);
            pst.setString(4, cpf);
            pst.setString(5, campus);
            pst.setString(6, celular);
            pst.setString(7, conta);
            pst.setString(8, email);
            pst.setString(9, estudante);
            pst.setString(10, evento);
            pst.setString(11, matricula);
            pst.setString(12, titulo);

            int line = pst.executeUpdate();
            if (line > 0) {
                System.out.println("SQL executed successfully.");
            } else {
                System.out.println("SQL failed.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }

    public ResultSet selectAllProjects() {
        ResultSet resultSet = null;

        try {
            this.pst = this.conn.prepareStatement("select * from projects");
            resultSet = pst.executeQuery();

            return resultSet;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
            return null;
        }

    }

    public void deleteProject(int id) {
        ResultSet resultSet = null;

        try {
            this.pst = this.conn.prepareStatement("delete from projects where id=?");
            pst.setInt(1, id);
            int line = pst.executeUpdate();

            if (line > 0) {
                System.out.println("SQL executed successfully.");
            } else {
                System.out.println("SQL failed.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }

    }
    
    public ResultSet selectProject(String nameProject){
        ResultSet resultSet = null;
        
        try {
            this.pst = this.conn.prepareStatement("select * from projects where evento=?");
            pst.setString(1, nameProject);
            resultSet = pst.executeQuery();
            
            resultSet.next(); //se não usar esta função, você posiciona o cursor antes da primeira linha e não consegue obter os dados¹
            return resultSet;
            
        } catch (SQLException ex) {
            System.out.println("Error: "+ex);
            return null;
        }
        
    }
    
    public boolean alterProjectDatabase(int idProject, String coordenador, String agencia, String banco, String cpf, String campus, String celular,
            String conta, String email, String estudante, String evento, String matricula, String titulo){
        
        ResultSet resultSet = null;
        
        try{
            this.pst = this.conn.prepareStatement("UPDATE `projects` SET coordenador = ?, agencia = ?, banco = ?, cpf = ? , campus = ?, "
                    + "celular = ?, conta = ?, email = ?, estudante = ?, evento = ?, matricula = ?, titulo = ? WHERE id = ?");
            
            pst.setString(1, coordenador);
            pst.setString(2, agencia);
            pst.setString(3, banco);
            pst.setString(4, cpf);
            pst.setString(5, campus);
            pst.setString(6, celular);
            pst.setString(7, conta);
            pst.setString(8, email);
            pst.setString(9, estudante);
            pst.setString(10, evento);
            pst.setString(11, matricula);
            pst.setString(12, titulo);
            pst.setInt(13, idProject);
            
            int line = pst.executeUpdate();
            if(line > 0){
                System.out.println("SQL executed successfully");
                return true;
            }else{
                System.out.println("SQL failed");
            }
        }catch(SQLException ex){
            System.out.println("Error "+ ex);
            return false;
        }
        return false;
    }

}


//Fonte: ¹(https://stackoverflow.com/questions/2120255/resultset-exception-before-start-of-result-set)