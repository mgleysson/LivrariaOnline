package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import interfaces.Carrinho;
import interfaces.PaginaInicial;

public class EventoCarrinho implements ActionListener {

	private JButton carrinho;

	public EventoCarrinho(PaginaInicial paginaInicial,int nItens) {
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == carrinho) {
		}
	}

	public void setCarrinho(JButton carrinho) {
		this.carrinho = carrinho;
	}

}
