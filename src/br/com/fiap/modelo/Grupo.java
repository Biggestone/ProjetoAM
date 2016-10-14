package br.com.fiap.modelo;

public class Grupo {
	private int idGrupo;
	private String nomeGrupo;

	public Grupo(int idGrupo, String nomeGrupo) {

		this.idGrupo = idGrupo;
		this.nomeGrupo = nomeGrupo;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNomeGrupo() {
		return nomeGrupo;
	}

	public void setNomeGrupo(String nomeGrupo) {
		this.nomeGrupo = nomeGrupo;
	}

	//Opção de criar uma classe interna membro e turma
}


