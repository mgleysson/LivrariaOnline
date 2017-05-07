package interfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.LayoutManager;

import javax.swing.*;

import elementos.Background;

public class Entrega extends JFrame {

	private JPanel panel;
	Background construtorImage = null;

	public Entrega() {
		super("Entrega - Livraria Online");
		ImageIcon icone = new ImageIcon("icone.png");
		setIconImage(icone.getImage());
		construtorImage = new Background("fundoPrincipal.png");
		construtorImage.setSize(2000, 1500);

		panel = new JPanel(new GridBagLayout());
		panel.setLayout(null);

		ImageIcon logomarca = new ImageIcon("logomarca.png");
		JLabel label = new JLabel(logomarca);
		label.setBounds(20, 10, 650, 65);

		panel.add(label);
		panel.add(construtorImage);

		this.setContentPane(panel);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
