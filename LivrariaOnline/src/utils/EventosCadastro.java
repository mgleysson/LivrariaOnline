package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import elementos.Cadastro;
import elementos.Usuario;
import funcionalidades.Cadastrar;
import interfaces.CadastroAdm;
import interfaces.CadastroCliente;
import interfaces.PaginaInicial;

public class EventosCadastro implements ActionListener {

	private CadastroAdm cadastroAdm;
	private CadastroCliente cadastroCliente;
	private boolean admin,login;
	private JButton finalizar;
	private JButton voltar;
	private Usuario user;
	private int Itens;

	public EventosCadastro(Cadastro cadastroScreen, boolean b,Usuario u,boolean l,int i) {

		if (b) {
			cadastroAdm = (CadastroAdm) cadastroScreen;
		} else {
			cadastroCliente = (CadastroCliente) cadastroScreen;
		}

		this.admin = b;
		this.user = u;
		this.login = l;
		this.Itens = i;
	}

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == finalizar) {

			if (admin) {
				user = cadastroAdm.getUserInfo();
			} else {
				user = cadastroCliente.getUserInfo();
				Cadastrar.cadastrarCliente(user);
			}

			PaginaInicial pgi = new PaginaInicial(0, user,login,0," ");

			if (admin) {
				cadastroAdm.setVisible(false);
			} else {
				cadastroCliente.setVisible(false);
			}

		} else if (event.getSource() == voltar) {

			PaginaInicial pgi = new PaginaInicial(0, user,login,0," ");

			if (admin) {
				cadastroAdm.setVisible(false);
			} else {
				cadastroCliente.setVisible(false);
			}

		}

	}


	public void setFinalizar(JButton finalizar) {
		this.finalizar = finalizar;
	}

	public void setVoltar(JButton voltar) {
		this.voltar = voltar;
	}

	
}
