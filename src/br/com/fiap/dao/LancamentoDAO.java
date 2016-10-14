/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.conexao.Conexao;
import br.com.fiap.modelo.Grupo;
import br.com.fiap.modelo.Lancamento;

/**
 *
 * @author Renan
 */
public class LancamentoDAO {

    private Connection connection;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;

    public void inserirLancamento(Lancamento lancamento){
        sql = "INSERT INTO USUARIO VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        connection = Conexao.getConnection();

     try {

    	 //FALTA INSERIR O GRUPO?
         ps = connection.prepareStatement(sql);
         //ps.setDate(1, lancamento.getDataLancamento());
         ps.setDouble(2, lancamento.getDistancia());
         ps.setDouble(3, lancamento.getAngulo());
         ps.setDouble(4, lancamento.getVelocidade());
         ps.setDouble(5, lancamento.getPeso());
         ps.setDouble(6, lancamento.getAltitudeMaxima());
         ps.setDouble(7, lancamento.getVelocidadeMaxima());
         //ps.setDate(8, x);
         ps.setDouble(9, lancamento.getPicoAceleracao());
         ps.setDouble(10, lancamento.getAceleracaoMedia());
         //ps.setDate();
         //ps.setDate();
         ps.setDouble(13, lancamento.getAltitudeEjecao());
         ps.setDouble(14, lancamento.getTaxaDescida());
         //ps.setDate(0, x);
         ps.execute();

     }  catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Erro ao inserir Lancamento\n"+e);
        }
    }

    public Lancamento pesquisarLancamento(Grupo grupo){
    	sql =  "SELECT * FROM TABLE WHERE GRUPOID = ?";
    	connection = Conexao.getConnection();
    	Lancamento lancamento = null;

    	try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			//Falta o id do lancamento
			Date dataLancamento = rs.getDate("DATALANCAMENTO");
	        double distancia = rs.getDouble("DISTANCIA");
	        double angulo = rs.getDouble("ANGULO");
	        double velocidade = rs.getDouble("VELOCIDADE");
	        double peso = rs.getDouble("PESO");
	        double altitudeMaxima = rs.getDouble("ALTITUDEMAXIMA");
	        double velocidadeMaxima = rs.getDouble("VELOCIDADEMAXIMA");
	        Date tempoPropulsao = rs.getDate("");
	        double picoAceleracao = rs.getDouble("PICOACELERACAO");
	        double aceleracaoMedia = rs.getDouble("ACELERACAOMEDIA");
	        Date tempoSD = rs.getDate("");
	        Date tempoEjecao = rs.getDate("");
	        double altitudeEjecao = rs.getDouble("ALTITUDEDEEJECAO");
	        double taxaDescida = rs.getDouble("TAXADESCIDA");
	        Date duracao = rs.getDate("");

	        lancamento = new Lancamento(dataLancamento, distancia, angulo,
	        							velocidade, peso, altitudeMaxima,
	        							velocidadeMaxima, tempoPropulsao,
	        							picoAceleracao, aceleracaoMedia,
	        							tempoSD, tempoEjecao, altitudeEjecao,
	        							taxaDescida, duracao);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "O Lançamento não pôde ser cadastrado!");
		}


    return lancamento;}

    public void excluirLancamento(int idLancamento){
    	sql = "DELETE FROM TABLE WHERE IDLANCAMENTO = ?";
    	connection = Conexao.getConnection();
    	try {
			ps = connection.prepareStatement(sql);
			ps.execute();
			JOptionPane.showMessageDialog(null, "Os dados foram exlcuídos com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a exclusão dos dados.");
		}
    }

    public void alterarLancamento(Lancamento lancamento){
    	sql = "UPDATE TABLE SET DATALANCAMENTO = ?, "
    			+ "DISTANCIA = ?, "
    			+ "ANGULO = ?, "
    			+ "VELOCIDADE = ?, "
    			+ "PESO = ?, "
    			+ "ALTITUDEMAXIMA = ?, "
    			+ "VELOCIDADEMAXIMA = ?, "
    			+ "TEMPOPROPULSAO = ?, "
    			+ "PICOACELERACAO = ?, "
    			+ "ACELERACAOMEDIA = ?, "
    			+ "TEMPOSD = ?, "
    			+ "TEMPOEJECAO = ?, "
    			+ "ALTITUDEEJECAO = ?, "
    			+ "TAXADESCIDA = ?, "
    			+ "DURACAO = ?"
    			+ "WHERE IDLANCAMENTO = ?";

    	connection = Conexao.getConnection();
    	try {
			ps = connection.prepareStatement(sql);
			//ps.setDate(1, lancamento.getDataLancamento());
	         ps.setDouble(2, lancamento.getDistancia());
	         ps.setDouble(3, lancamento.getAngulo());
	         ps.setDouble(4, lancamento.getVelocidade());
	         ps.setDouble(5, lancamento.getPeso());
	         ps.setDouble(6, lancamento.getAltitudeMaxima());
	         ps.setDouble(7, lancamento.getVelocidadeMaxima());
	         //ps.setDate(8, x);
	         ps.setDouble(9, lancamento.getPicoAceleracao());
	         ps.setDouble(10, lancamento.getAceleracaoMedia());
	         //ps.setDate();
	         //ps.setDate();
	         ps.setDouble(13, lancamento.getAltitudeEjecao());
	         ps.setDouble(14, lancamento.getTaxaDescida());
	         //ps.setDate(0, x);
	         ps.execute();
	         JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a atualização dos dados:\n"+e);
		}
    }
}
