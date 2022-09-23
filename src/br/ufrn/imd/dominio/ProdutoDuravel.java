package br.ufrn.imd.dominio;

import java.util.Date;

public class ProdutoDuravel extends Produto{
	private int durabilidade;

	/**
	 * Criar um produto durável
	 * @param codigo : Código do produto
	 * @param nome : Nome do produto
	 * @param preco : Preço (Em reais R$) do produto
	 * @param marca : Marca do produto
	 * @param descricao : Descrição do produto
	 * @param dataFabricacao : Data de fabricação do produto
	 * @param durabilidade: Durabilidade do produto (Em anos)
	 */
	public ProdutoDuravel(int codigo, String nome, double preco, String marca, String descricao, Date dataFabricacao, int durabilidade) {
		super(codigo, nome, preco, marca, descricao, dataFabricacao);
		this.durabilidade = durabilidade;
	}

	/**
	 * Obter durabilidade do produto
	 * @return {@code int} referente a durabilidade do produto (Em anos)
	 */
	public int getDurabilidade() {
		return durabilidade;
	}

	/**
	 * Alterar durabilidade do produto
	 * @param durabilidade : Nova durabilidade
	 */
	public void setDurabilidade(int durabilidade) {
		this.durabilidade = durabilidade;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" - %d anos", this.durabilidade);
	}
}
