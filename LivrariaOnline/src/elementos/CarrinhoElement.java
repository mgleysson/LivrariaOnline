package elementos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CarrinhoElement {

	private int codigo;
	private Date dataCompra;
	private float valorTotal;
	private List<Livro> livros;

	public void addItem(Livro i) {
		livros.add(i);
	}

	public String listaItens() {
		return (Arrays.toString(livros.toArray()));
	}

	public Item pegarItem(int indice) {
		return (livros.get(indice));
	}

	public void removerItem(int indice) {
		livros.remove(indice);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Livro> getItens() {
		return livros;
	}

	public void setItens(ArrayList<Livro> itens) {
		this.livros = itens;
	}

}
