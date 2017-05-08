package utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import elementos.Usuario;
import enums.CategoriaLivro;
import interfaces.PaginaInicial;

public class EventosCategorias implements ActionListener {

	private JButton arte, ajuda, biografia, exatas, humanas, comidas, direito;
	private JButton educacao, historia, estrangeiro, infantil, nacional, negocios, hq, saude, tecnologia, turismo;
	private Usuario usuario;
	private JFrame paginaInicial;
	private Usuario use;
	private boolean login;
	private int item;

	public EventosCategorias(JFrame paginaInicial, Usuario user,boolean UsuarioLogado, double itensCarrinho) {
		// TODO Auto-generated constructor stub
		this.usuario = user;
		this.paginaInicial = paginaInicial;
	}

	public void actionPerformed(ActionEvent event) {

		CategoriaLivro categoriaLivro = CategoriaLivro.TUDO;

		if (event.getSource() == arte) {
			categoriaLivro = CategoriaLivro.ARTE;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == ajuda) {
			categoriaLivro = CategoriaLivro.AJUDA;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == biografia) {
			categoriaLivro = CategoriaLivro.BIOGRAFIA;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == exatas) {
			categoriaLivro = CategoriaLivro.EXATAS;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == humanas) {
			categoriaLivro = CategoriaLivro.HUMANAS;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == comidas) {
			categoriaLivro = CategoriaLivro.COMIDAS;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == direito) {
			categoriaLivro = CategoriaLivro.DIREITO;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == educacao) {
			categoriaLivro = CategoriaLivro.EDUCA��O;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == historia) {
			categoriaLivro = CategoriaLivro.HISTORIA;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == estrangeiro) {
			categoriaLivro = CategoriaLivro.ESTRANGEIRO;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == infantil) {
			categoriaLivro = CategoriaLivro.INFANTIL;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == nacional) {
			categoriaLivro = CategoriaLivro.NACIONAL;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == negocios) {
			categoriaLivro = CategoriaLivro.NEGOCIOS;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == hq) {
			categoriaLivro = CategoriaLivro.HQ;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == saude) {
			categoriaLivro = CategoriaLivro.SAUDE;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == tecnologia) {
			categoriaLivro = CategoriaLivro.TECNOLOGIA;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else if (event.getSource() == turismo) {
			categoriaLivro = CategoriaLivro.TURISMO;
			PaginaInicial pgi = new PaginaInicial(0,this.use,this.login,this.item,event.getSource().toString());
			paginaInicial.setVisible(false);
		} else {
			return;
		}
		
		paginaInicial.setVisible(false);
	}

	public void setArte(JButton arte) {
		this.arte = arte;
	}

	public void setAjuda(JButton ajuda) {
		this.ajuda = ajuda;
	}

	public void setBiografia(JButton biografia) {
		this.biografia = biografia;
	}

	public void setExatas(JButton exatas) {
		this.exatas = exatas;
	}

	public void setHumanas(JButton humanas) {
		this.humanas = humanas;
	}

	public void setComidas(JButton comidas) {
		this.comidas = comidas;
	}

	public void setDireito(JButton direito) {
		this.direito = direito;
	}

	public void setEducacao(JButton educacao) {
		this.educacao = educacao;
	}

	public void setHistoria(JButton historia) {
		this.historia = historia;
	}

	public void setEstrangeiro(JButton estrangeiro) {
		this.estrangeiro = estrangeiro;
	}

	public void setInfantil(JButton infantil) {
		this.infantil = infantil;
	}

	public void setNacional(JButton nacional) {
		this.nacional = nacional;
	}

	public void setNegocios(JButton negocios) {
		this.negocios = negocios;
	}

	public void setHq(JButton hq) {
		this.hq = hq;
	}

	public void setSaude(JButton saude) {
		this.saude = saude;
	}

	public void setTecnologia(JButton tecnologia) {
		this.tecnologia = tecnologia;
	}

	public void setTurismo(JButton turismo) {
		this.turismo = turismo;
	}

}
