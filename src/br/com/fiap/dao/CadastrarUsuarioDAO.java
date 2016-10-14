
package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.conexao.Conexao;
import br.com.fiap.modelo.CadastrarUsuario;

public class CadastrarUsuarioDAO {

     private Connection connection;
     private PreparedStatement p;
     private String sql;
     private ResultSet rs;

   public void inserirUsuario(CadastrarUsuario cadastrarUsuario){
     sql = "INSERT INTO USUARIO VALUES (?,?,?)";
     connection = Conexao.getConnection();

     try {
         p = connection.prepareStatement(sql);
         p.setString(1, cadastrarUsuario.getNomeUsuario());
         p.setString(2, cadastrarUsuario.getRmUsuario());
         p.setString(3, cadastrarUsuario.getSenhaUsuario());
         p.execute();

     }  catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Erro ao inserir Usuario\n"+e);
        }
   }

    public boolean pesquisarUsuario(CadastrarUsuario cadastrarUsuario){
        boolean achou = false;

        try{
            connection = Conexao.getConnection();
            String sql = "SELECT * FROM USUARIO WHERE RM_LOGIN = ?";
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, cadastrarUsuario.getRmUsuario());
            ResultSet rs = p.executeQuery();
            achou = rs.next();
        }
        catch(SQLException e ){
            JOptionPane.showMessageDialog(null,"Usuario já cadastrado\n"+e);
        }
        return achou;
      }
}
