
package br.com.fiap.modelo;

public class CadastrarUsuario {
    private String nomeUsuario;
    private String rmUsuario;
    private String senhaUsuario; 

    public CadastrarUsuario(String nomeUsuario, String rmUsuario, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.rmUsuario = rmUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getRmUsuario() {
        return rmUsuario;
    }

    public void setRmUsuario(String rmUsuario) {
        this.rmUsuario = rmUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    
}
