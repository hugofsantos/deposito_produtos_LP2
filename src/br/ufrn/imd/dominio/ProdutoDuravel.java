package br.ufrn.imd.dominio;

import java.util.Date;

public class ProdutoDuravel extends Produto{
	private int durabilidade;

	public ProdutoDuravel(int codigo, String nome, double preco, String marca, String descricao, Date dataFabricacao,
	int durabilidade) {
		super(codigo, nome, preco, marca, descricao, dataFabricacao);
		this.durabilidade = durabilidade;
	}

	public int getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%d", this.durabilidade);
	}
}
