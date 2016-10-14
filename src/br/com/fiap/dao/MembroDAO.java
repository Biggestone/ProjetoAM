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
import br.com.fiap.modelo.Membro;
import br.com.fiap.modelo.Grupo;
import br.com.fiap.modelo.Turma;

/**
 *
 * @author Renan
 */
public class MembroDAO {

    private Connection connection;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;

    public void inserirMembro(Membro membro){
        sql = "INSERT INTO MEMBRO VALUES (?,?,?,?)";
        connection = Conexao.getConnection();

     try {
         ps = connection.prepareStatement(sql);
         ps.setString(1, membro.getNomeMembro());
         ps.setInt(2, membro.getRmMembro());
         ps.setInt(3, membro.getGrupo().getIdGrupo());
         ps.setString(4, membro.getTurma().getIdTurma());
         ps.execute();

     }  catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Erro ao inserir Usuario\n"+e);
        }
    }

    public Membro pesquisarMembro(String nomeMembro){
    sql = "SELECT * FROM MEMBRO WHERE NOME=?";
    connection = Conexao.getConnection();
    Membro membro = null;
    Grupo grupo = null;
    Turma turma = null;
    try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            int rm = rs.getInt("RM_MEMBRO");
            //nomeMembro = rs.getString("NOME_MEMBRO");
            int idGrupo = rs.getInt("GRUPO_ID_GRUPO");
            GrupoDAO grupoDao = new GrupoDAO();
            grupo = grupoDao.pesquisarGrupo(idGrupo);
            String idTurma = rs.getString("TURMA_ID_TURMA");
            TurmaDAO turmaDao = new TurmaDAO();
            turma = turmaDao.pesquisarTurma(idTurma);
            membro = new Membro(nomeMembro, rm, grupo, turma);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    return membro;}

    public void excluirMembro(int rmMembro){
    	sql = "DELETE FROM TABLE WHERE RMMEMBRO = ?";
    	connection = Conexao.getConnection();
    	try {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, rmMembro);
			JOptionPane.showMessageDialog(null, "Membro excluído com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void alterarMembro(Membro membro){
    	sql = "UPDATE TABLE SET COLUMN = ? "
    			+ "WHERE RM = ?";
    	connection = Conexao.getConnection();

    	try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, membro.getNomeMembro());
			ps.setInt(2, membro.getRmMembro());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
