/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.dao;

import br.com.fiap.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.fiap.modelo.Grupo;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class GrupoDAO {
    
    private Connection connection;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    
    public void inserirGrupo(Grupo grupo){
        sql = "INSERT INTO MEMBRO VALUES (?,?)";
        connection = Conexao.getConnection();

     try {
         ps = connection.prepareStatement(sql);
         ps.setString(1, grupo.getNomeGrupo());
         ps.setInt(2, grupo.getIdGrupo());
         ps.execute();

     }  catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Erro ao inserir Usuario\n"+e);
        }
    }

    public Grupo pesquisarGrupo(int idGrupo){
    sql = "SELECT * FROM GRUPO WHERE ID_GRUPO = ?";
    connection = Conexao.getConnection();
    Grupo grupo = null;
    
    try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            //int idGrupo = rs.getInt("ID_GRUPO");
            //nomeMembro = rs.getString("NOME_MEMBRO");
            String nomeGrupo = rs.getString("NOME_GRUPO");
            
            grupo = new Grupo(idGrupo, nomeGrupo);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    return grupo;}

    public void excluirGrupo(int idGrupo){
    	sql = "DELETE FROM TABLE WHERE ID_GRUPO = ?";
    	connection = Conexao.getConnection();
    	try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, idGrupo);
			JOptionPane.showMessageDialog(null, "Membro excluído com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o grupo");
		}
    }

    public void alterarGrupo(Grupo grupo){
    	sql = "UPDATE GRUPO SET NOME_GRUPO = ? "
    			+ "WHERE ID_GRUPO = ?";
    	connection = Conexao.getConnection();

    	try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, grupo.getNomeGrupo());
			ps.setInt(2, grupo.getIdGrupo());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
