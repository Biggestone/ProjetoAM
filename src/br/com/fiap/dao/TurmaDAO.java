/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.conexao.Conexao;
import br.com.fiap.modelo.Turma;

class TurmaDAO {
    private Connection connection;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;

    public void inserirTurma(Turma turma){
        sql = "INSERT INTO TURMA VALUES (?,?)";
        connection = Conexao.getConnection();

     try {
         ps = connection.prepareStatement(sql);
         ps.setString(1, turma.getIdTurma());
         ps.setString(2, turma.getPeriodo());
         ps.execute();

     }  catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Erro ao inserir Turma\n"+e);
        }
    }

    public Turma pesquisarTurma(String idTurma){
    sql = "SELECT * FROM TURMA WHERE ID_TURMA = ?";
    connection = Conexao.getConnection();
    Turma turma = null;

    try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            //int idGrupo = rs.getInt("ID_GRUPO");
            //nomeMembro = rs.getString("NOME_MEMBRO");
            String periodo = rs.getString("PERIODO");

            turma = new Turma(idTurma, periodo);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    return turma;}

    public void excluirTurma(int idTurma){
    	sql = "DELETE FROM TURMA WHERE ID_TURMA = ?";
    	connection = Conexao.getConnection();
    	try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, idTurma);
			JOptionPane.showMessageDialog(null, "Turma excluido com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir a turma");
		}
    }

    public void alterarTurma(Turma turma){
    	sql = "UPDATE TURMA SET PERIODO = ? "
    			+ "WHERE ID_GRUPO = ?";
    	connection = Conexao.getConnection();

    	try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, turma.getPeriodo());
			ps.setString(2, turma.getIdTurma());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
