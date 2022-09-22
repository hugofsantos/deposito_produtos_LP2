package br.ufrn.imd.dominio;

import java.util.ArrayList;

public class Deposito {
	private ArrayList<Produto> produtos;
	
	public Deposito() {
		this.produtos = new ArrayList<Produto>();
	}
	
	public boolean adicionarProduto(Produto produto) {
		if(produto == null || this.produtos.contains(produto)) return false;
		
		this.produtos.add(produto);
		return true;
	}
	
	public boolean removerProduto(Produto produto) {
		if(!this.produtos.contains(produto)) return false;
		
		this.produtos.remove(produto);
		return true;
	}
	
	public int qntProdutos() {
		return this.produtos.size();
	}
	
	public boolean estaVazio() {
		return this.produtos.isEmpty();
	}
	
	public Produto maisCaro() {
		if(this.estaVazio()) return null;
		
 		Produto maisCaro = this.produtos.get(0);
		
		for(int i = 1; i < this.qntProdutos(); i++) {
			Produto atual = this.produtos.get(i);
			
			if(atual.getPreco() > maisCaro.getPreco()) maisCaro = atual;
		}
		
		return maisCaro;
	}
}
