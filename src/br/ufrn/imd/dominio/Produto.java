package br.ufrn.imd.dominio;

import java.util.Date;
import java.util.Objects;

public abstract class Produto {
	protected int codigo;
	protected String nome;
	protected double preco;
	protected String marca;
	protected String descricao;
	protected Date dataFabricacao;
	
	/**
	 * Criar um produto
	 * @param codigo : Código do produto
	 * @param nome : Nome do produto
	 * @param preco : Preço (Em reais R$) do produto
	 * @param marca : Marca do produto
	 * @param descricao : Descrição do produto
	 * @param dataFabricacao : Data de fabricação do produto
	 */
	public Produto(int codigo, String nome, double preco, String marca, String descricao, Date dataFabricacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
		this.dataFabricacao = dataFabricacao;
	}

	/**
	 * Obter o nome do produto
	 * @return {@code String} referente ao nome do produto
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Alterar o nome do produto
	 * @param nome : Novo nome do produto
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obter o preço do produto
	 * @return {@code double} referente ao preço do produto
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 * Alterar o preço do produto
	 * @param preco : Novo preço
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}

	/**
	 * Obter a marca do produto
	 * @return {@code String} referente a marca do produto
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Alterar marca do produto
	 * @param marca : Nova marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Obter descrição do produto
	 * @return {@code String} referente a descrição do produto
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Alterar a descrição do produto
	 * @param descricao : Nova descrição
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Obter data de fabricação do produto
	 * @return {@code Date} referente a data de fabricação 
	 */
	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	/**
	 * Alterar data de fabricação do produto
	 * @param dataFabricacao : Nova data de fabricação
	 */
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return codigo == other.codigo;
	}
	
	@Override
	public String toString() {
		return String.format("%d: %s - R$ %.02f", this.codigo, this.nome, this.preco);
	}
}
