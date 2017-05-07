package interfaces;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import elementos.Background;
public class Cartao extends JFrame{

	private JPanel panel;
	private JLabel pagamento,numeroCartao,codigoSeguranca,validade,numeroParcelas,nomeCartao,preco;
	private JTextField cartao,seguranca,nome,precoTotal;
	private static final String[] mes = {"Janeiro","Fevereiro","Mar�o","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
	private static final String[] ano ={"2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027"};
	private static final String[] nPar = {"1","2","3","4","5"};
	private JComboBox validadeMes = new JComboBox(mes);
	private JComboBox validadeAno = new JComboBox(ano);
	private JComboBox parcelas = new JComboBox(nPar);
	private JButton voltar, finalizar;
	Background construtorImage = null;
	
	public Cartao(int tipo, double d){
		super("Encerrar Compra - Livraria Online");			
		ImageIcon icone = new ImageIcon("icone.png");
		setIconImage(icone.getImage());
		construtorImage = new Background("fundoPrincipal.png");
		construtorImage.setSize(2000,1500);	
		
		panel = new JPanel();
		panel.setLayout(null);		
		
		ImageIcon logomarca = new ImageIcon("logomarca.png");
		JLabel label = new JLabel(logomarca);
		label.setBounds(20, 10, 650, 65);
		
		pagamento = new JLabel();		
		pagamento.setText("<html><font color = #FFFFFF size = 6>PAGAMENTO</font></html>");
		pagamento.setBounds(125, 160, 250,60);
		
		numeroCartao = new JLabel();
		numeroCartao.setText("<html><font color = #FFFFFF size = 5>N�mero do cart�o</font></html>");
		numeroCartao.setBounds(125,200,250,60);
		
		cartao = new JTextField();
		cartao.setBounds(125,250,350,35);
		
		codigoSeguranca = new JLabel();
		codigoSeguranca.setText("<html><font color = #FFFFFF size = 5>C�digo de seguran�a</font></html>");
		codigoSeguranca.setBounds(625,200,250,60);
		
		seguranca = new JTextField();
		seguranca.setBounds(625,250,150,35);
		
		validade = new JLabel();
		validade.setText("<html><font color = #FFFFFF size = 5>Validade</font></html>");
		validade.setBounds(125,300,250,60);
		
		validadeMes.setBounds(125,355,150,35);
		validadeAno.setBounds(325,355,80,35);
		
		if(tipo ==1){ //Cart�o de cr�dito
			
			numeroParcelas = new JLabel();
			numeroParcelas.setText("<html><font color = #FFFFFF size = 5>N�mero de parcelas</font></html>");
			numeroParcelas.setBounds(625,300,250,60);
			
			parcelas.setBounds(625,355,50,35);	
			
			nomeCartao = new JLabel();
			nomeCartao.setText("<html><font color = #FFFFFF size = 5>Nome como exibido no cart�o</font></html>");
			nomeCartao.setBounds(925,300,350,60);
			
			nome = new JTextField();
			nome.setBounds(925,355,350,35);
			
			panel.add(numeroParcelas);
			panel.add(parcelas);
			panel.add(nomeCartao);
			panel.add(nome);
			
		}else{ //Cart�o de d�bito	
			
			nomeCartao = new JLabel();
			nomeCartao.setText("<html><font color = #FFFFFF size = 5>Nome como exibido no cart�o</font></html>");
			nomeCartao.setBounds(625,300,350,60);
			
			nome = new JTextField();
			nome.setBounds(625,355,350,35);
			
			panel.add(nomeCartao);
			panel.add(nome);		
			
		}
		
		preco = new JLabel();
		preco.setText("<html><font color = #FFFFFF size = 5>Pre�o total</font></html>");
		preco.setBounds(125,520,250,60);
		
		precoTotal = new JTextField();
		precoTotal.setText(Double.toString(d));
		precoTotal.setEditable(false);
		precoTotal.setBounds(125,570,60,35);
		
		voltar = new JButton();
		voltar.setText("<html><font size = 4>Voltar</font></html>");
		voltar.setBounds(125,655,80,40);
		voltar.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		voltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		voltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		voltar.setBackground(Color.white);
		voltar.setBorderPainted(false);
		
		finalizar = new JButton();
		finalizar.setText("<html><font size = 4>Finalizar Compra</font></html>");
		finalizar.setBounds(210,655,180,40);
		finalizar.setAlignmentX(javax.swing.SwingConstants.BOTTOM);
		finalizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		finalizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		finalizar.setBackground(Color.white);
		finalizar.setBorderPainted(false);

		panel.add(pagamento);
		panel.add(numeroCartao);
		panel.add(cartao);
		panel.add(codigoSeguranca);
		panel.add(seguranca);
		panel.add(validade);
		panel.add(validadeMes);
		panel.add(validadeAno);
		panel.add(voltar);
		panel.add(finalizar);
		panel.add(precoTotal);
		panel.add(preco);
		panel.add(label);
		panel.add(construtorImage);
		this.setContentPane(panel);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//Handler para eventos registradores
		voltarEvento handler1 = new voltarEvento();
		voltar.addActionListener(handler1);
		finalizarEvento handler2 = new finalizarEvento();
		finalizar.addActionListener(handler2);
		
	}	
	private class voltarEvento implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource()==voltar){
			
			}
			
		}
		
	}	
	private class finalizarEvento implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource()==finalizar){
			
			}
			
		}
		
	}
	
}
