package interfaces;

import javax.swing.JFrame;

import elementos.Categoria;
import elementos.Usuario;
import enums.CategoriaLivro;
import funcionalidades.Cadastrar;

public class Inicializador extends JFrame {

	public static void main(String[] args) {
		
		//Inicializando as categorias
		Usuario admin1 = new Usuario("Lauren","camz","lauren@5h.com");
		Cadastrar.setListaAdmin(admin1);
		
		//CadastroAdm cda = new CadastroAdm();
		//CadastroCliente cc = new CadastroCliente();
		PaginaInicial pgi = new PaginaInicial(0, null,false,0,"");
		//Carrinho car = new Carrinho(0);
		// Entrega ent = new Entrega();
		// Cartao ctc = new Cartao(3,40.80);
		// CadastroLivro cdl = new CadastroLivro();
	}

}
