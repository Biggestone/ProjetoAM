/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.modelo;

/**
 *
 * @author Renan
 */
public class Turma {
    private String idTurma;
    private String periodo;

    public Turma(String idTurma, String periodo) {
        this.idTurma = idTurma;
        this.periodo = periodo;
    }

    public String getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

}
