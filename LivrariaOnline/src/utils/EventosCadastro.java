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
	private double Itens;

	public EventosCadastro(Cadastro cadastroScreen, boolean b,Usuario u,boolean l,double i) {

		if (b == true) {
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

			if (admin == true) {
				user = cadastroAdm.getUserInfo();
				Cadastrar.setListaAdmin(user);
				PaginaInicial pgi = new PaginaInicial(0, user,login,0," ");
				cadastroAdm.setVisible(false);
			} else {
				user = cadastroCliente.getUserInfo();
				Cadastrar.cadastrarCliente(user);
				PaginaInicial pgi = new PaginaInicial(0, user,login,0," ");
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
