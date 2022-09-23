package br.ufrn.imd.dominio;

import java.util.Date;

public class ProdutoNaoDuravel extends Produto{
	private Date dataValidade;
	private String genero;
	
	/**
	 * Criar um produto não durável
	 * @param codigo : Código do produto
	 * @param nome : Nome do produto
	 * @param preco : Preço (Em reais R$) do produto
	 * @param marca : Marca do produto
	 * @param descricao : Descrição do produto
	 * @param dataFabricacao : Data de fabricação do produto
	 * @param dataValidade : Data de validade do produto
	 * @param genero : Gênero do produto (Alimentício, limpeza, vestuário, higiene pessoal etc)
	 */
	public ProdutoNaoDuravel(int codigo, String nome, double preco, String marca, String descricao, Date dataFabricacao, 
	Date dataValidade, String genero){
		super(codigo, nome, preco, marca, descricao, dataFabricacao);
		this.dataValidade = dataValidade;
		this.genero = genero;
	}

	/**
	 * Obter a data de validade do produto
	 * @return {@code Date} referente a data de validade
	 */
	public Date getDataValidade() {
		return dataValidade;
	}

	/**
	 * Alterar data de validade do produto
	 * @param dataValidade : Nova data de validade
	 */
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	/**
	 * Obter o gênero do produto
	 * @return {@code String} referente ao gênero do produto
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Alterar o gênero do produto
	 * @param genero : Novo gênero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
