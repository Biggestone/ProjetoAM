package br.com.fiap.controller;

import javax.swing.JOptionPane;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.form.FormLogin;
import br.com.fiap.form.FormMenu;
import br.com.fiap.modelo.Usuario;

public class EfetuarLogin {
	Usuario usuario;
	UsuarioDAO usuarioDAO;
	boolean achou = false;
	FormLogin formLogin;
	public EfetuarLogin(Usuario usuario, FormLogin formLogin){
		this.usuario = usuario;
		this.formLogin = formLogin;
		validarLoginESenha();

		}
	private void validarLoginESenha(){
		if(usuario.getRmUsuario()==null || usuario.getRmUsuario().equals("")
				||usuario.getSenhaUsuario()==null|| usuario.getSenhaUsuario().equals("")){
			JOptionPane.showMessageDialog(null, "Há campos vazios! Preencha-os");
		}else{
			//achou = usuarioDAO.pesquisarUsuario(usuario);
			efetuarLogin();
		}
	}

	private void efetuarLogin(){
		FormMenu formMenu = new FormMenu();
		formMenu.setVisible(true);
		this.formLogin.dispose();

	}
}
