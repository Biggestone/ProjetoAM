package br.com.fiap.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renan
 */
public class Membro {
        
    private String nomeMembro;
    private int rmMembro;
    private Grupo grupo;
    private Turma turma;
    
    public Membro(String nomeMembro, int rmMembro,Grupo grupo, Turma turma){
    this.nomeMembro = nomeMembro;
    this.rmMembro = rmMembro;
    this.grupo = grupo;
    this.turma = turma;
    }

    public String getNomeMembro() {
        return nomeMembro;
    }

    public void setNomeMembro(String nomeMembro) {
        this.nomeMembro = nomeMembro;
    }

    public int getRmMembro() {
        return rmMembro;
    }

    public void setRmMembro(int rmMembro) {
        this.rmMembro = rmMembro;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    
}
