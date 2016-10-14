/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.modelo;

import java.util.Date;

/**
 *
 * @author Renan
 */
public class Lancamento {
	private int idLancamento;
    private Date dataLancamento;
    private double distancia;
    private double angulo;
    private double velocidade;
    private double peso;
    private double altitudeMaxima;
    private double velocidadeMaxima;
    private Date tempoPropulsao;
    private double picoAceleracao;
    private double aceleracaoMedia;
    private Date tempoSD;
    private Date tempoEjecao;
    private double altitudeEjecao;
    private double taxaDescida;
    private Date duracao;



    public Lancamento(Date dataLancamento, double distancia, double angulo,
			double velocidade, double peso, double altitudeMaxima,
			double velocidadeMaxima, Date tempoPropulsao,
			double picoAceleracao, double aceleracaoMedia, Date tempoSD,
			Date tempoEjecao, double altitudeEjecao, double taxaDescida,
			Date duracao) {
		super();
		this.dataLancamento = dataLancamento;
		this.distancia = distancia;
		this.angulo = angulo;
		this.velocidade = velocidade;
		this.peso = peso;
		this.altitudeMaxima = altitudeMaxima;
		this.velocidadeMaxima = velocidadeMaxima;
		this.tempoPropulsao = tempoPropulsao;
		this.picoAceleracao = picoAceleracao;
		this.aceleracaoMedia = aceleracaoMedia;
		this.tempoSD = tempoSD;
		this.tempoEjecao = tempoEjecao;
		this.altitudeEjecao = altitudeEjecao;
		this.taxaDescida = taxaDescida;
		this.duracao = duracao;
	}

    public int getIdLancamento(){
    	return idLancamento;
    }

    public void setIdLancamento(int idLancamento){
    	this.idLancamento = idLancamento;
    }

	public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltitudeMaxima() {
        return altitudeMaxima;
    }

    public void setAltitudeMaxima(double altitudeMaxima) {
        this.altitudeMaxima = altitudeMaxima;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Date getTempoPropulsao() {
        return tempoPropulsao;
    }

    public void setTempoPropulsao(Date tempoPropulsao) {
        this.tempoPropulsao = tempoPropulsao;
    }

    public double getPicoAceleracao() {
        return picoAceleracao;
    }

    public void setPicoAceleracao(double picoAceleracao) {
        this.picoAceleracao = picoAceleracao;
    }

    public double getAceleracaoMedia() {
        return aceleracaoMedia;
    }

    public void setAceleracaoMedia(double aceleracaoMedia) {
        this.aceleracaoMedia = aceleracaoMedia;
    }

    public Date getTempoSD() {
        return tempoSD;
    }

    public void setTempoSD(Date tempoSD) {
        this.tempoSD = tempoSD;
    }

    public Date getTempoEjecao() {
        return tempoEjecao;
    }

    public void setTempoEjecao(Date tempoEjecao) {
        this.tempoEjecao = tempoEjecao;
    }

    public double getAltitudeEjecao() {
        return altitudeEjecao;
    }

    public void setAltitudeEjecao(double altitudeEjecao) {
        this.altitudeEjecao = altitudeEjecao;
    }

    public double getTaxaDescida() {
        return taxaDescida;
    }

    public void setTaxaDescida(double taxaDescida) {
        this.taxaDescida = taxaDescida;
    }

    public Date getDuracao() {
        return duracao;
    }

    public void setDuracao(Date duracao) {
        this.duracao = duracao;
    }



}
