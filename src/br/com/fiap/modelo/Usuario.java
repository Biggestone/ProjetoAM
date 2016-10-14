
package br.com.fiap.modelo;


public class Usuario {
   
    
    private String rmUsuario;
    private String senhaUsuario;

    public Usuario( String rmUsuario, String senhaUsuario) {
        
        this.rmUsuario = rmUsuario;
        this.senhaUsuario = senhaUsuario;
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

    public String nome(){
        String nomeUsuario = null;
        
        return nomeUsuario;
    }
    
    
}
