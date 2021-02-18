/*****************************************************************************************************************
* Prova Técnica Java --> Projeto 2 --> By Jefferson Itajahy
*****************************************************************************************************************/
package br.com.fatura.informatica;

public class Fatura {

	private String numero;
	private String descricao;
	private int qtdeItemCompra;
	private double precoItem;

	public Fatura() {
		super();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdeItemCompra() {
		if (qtdeItemCompra < 0) {
			System.out.println("Quantidade não poderá ser menor que 0!");
			return qtdeItemCompra = 0;
		}else {
			return qtdeItemCompra;
		}
	}

	public void setQtdeItemCompra(int qtdeItemCompra) {
		this.qtdeItemCompra = qtdeItemCompra;
	}

	public double getPrecoItem() {
		if (precoItem < 0.0) {
			System.out.println("Preço não poderá ser menor que 0!");
			return precoItem = 0.0;
		}else {
			return precoItem;
		}
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}

	public double getTotalFatura() {

		double total = qtdeItemCompra * precoItem;
		return total;
	}
}
