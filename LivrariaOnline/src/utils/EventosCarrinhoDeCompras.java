package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventosCarrinhoDeCompras implements ActionListener {

	private JButton continuar, adicionar;

	public EventosCarrinhoDeCompras(JFrame carrinho) {
		// TODO Auto-generated constructor stub
	}

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == adicionar) {

		} else if (event.getSource() == continuar) {
			
		}

	}

	public void setContinuar(JButton continuar) {
		this.continuar = continuar;
	}

	public void setAdicionar(JButton adicionar) {
		this.adicionar = adicionar;
	}
	
	

}
