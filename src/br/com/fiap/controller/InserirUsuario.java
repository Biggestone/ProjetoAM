package br.com.fiap.controller;

import javax.swing.JOptionPane;

import br.com.fiap.dao.UsuarioDAO;
import br.com.fiap.form.FormCadastrarUsuario;
import br.com.fiap.form.FormLogin;
import br.com.fiap.modelo.Usuario;

public class InserirUsuario {
	Usuario usuario;
	FormCadastrarUsuario formCadastrarUsuario;

	public InserirUsuario(Usuario usuario, FormCadastrarUsuario formCadastrarUsuario){
		this.usuario = usuario;
		this.formCadastrarUsuario = formCadastrarUsuario;
		validarLoginESenha();
	}

	private void validarLoginESenha() {
		if(usuario.getRmUsuario()==null || usuario.getRmUsuario().equals("")
				||usuario.getSenhaUsuario()==null|| usuario.getSenhaUsuario().equals("")){
			JOptionPane.showMessageDialog(null, "Há campos vazios! Preencha-os");
		}else{
			//achou = usuarioDAO.pesquisarUsuario(usuario);
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			usuarioDAO.inserirUsuario(usuario);
			FormLogin formLogin = new FormLogin();
			formLogin.setVisible(true);
			this.formCadastrarUsuario.dispose();
		}
	}
}
