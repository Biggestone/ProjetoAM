
package br.com.fiap.dao;

import br.com.fiap.conexao.Conexao;
import br.com.fiap.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UsuarioDAO {
    private Connection connection;


    public void inserirUsuario(Usuario usuario){
    	JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
    }

    public boolean pesquisarUsuario(Usuario usuario){
        boolean achou = false;
        try{
            connection = Conexao.getConnection();
            String sql = "SELECT * FROM USUARIO WHERE RM_LOGIN = ? and senha = ?";
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, usuario.getRmUsuario());
            p.setString(2, usuario.getSenhaUsuario());
            ResultSet rs = p.executeQuery();
            achou = rs.next();
        }
        catch(SQLException e ){
            JOptionPane.showMessageDialog(null,"Erro ao pesquisar usuário\n"+e);
        }
      return achou;
    }


}