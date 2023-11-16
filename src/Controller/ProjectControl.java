package Controller;

import Model.Conexao;
import Model.ProjectDAO;
import Screens.Register;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class ProjectControl {

    ProjectDAO projectDAO = new ProjectDAO();

    public ResultSet takeProjectsNames() {
        ResultSet resultSet = projectDAO.selectAllProjects();

        return resultSet;
    }

    public ResultSet selectProject(String nameProject) {

        ResultSet resultSet = projectDAO.selectProject(nameProject);

        return resultSet;
    }

    public void insertIntoDatabase(String coordenador, String agencia, String banco, String cpf, String campus, String celular,
            String conta, String email, String estudante, String evento, String matricula, String titulo) {

        projectDAO.insertInDatabase(coordenador, agencia, banco, cpf, campus, celular, conta, email, estudante, evento, matricula, titulo);
    }

    public int removeProject(String nameProject) {
        ResultSet resultSet = selectProject(nameProject);

        try {
            int idProject = resultSet.getInt("id");
            projectDAO.deleteProject(idProject);
            return idProject;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Project not deleted.\nError: "+ex);
            return -1;
        }

    }
    
    public void alterProject(int idProject, String coordenador, String agencia, String banco, String cpf, String campus, String celular,
            String conta, String email, String estudante, String evento, String matricula, String titulo){
        
        boolean valid = projectDAO.alterProjectDatabase(idProject, coordenador, agencia, 
                banco, cpf, campus, celular, conta, email, estudante, evento, matricula, titulo);
        
        if(valid){
            JOptionPane.showMessageDialog(null, "Project changed successfully");
        }else{
            JOptionPane.showMessageDialog(null, "Unchanged project.");
        }
    }

}
