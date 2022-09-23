package br.ufrn.imd.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.ufrn.imd.dominio.Deposito;
import br.ufrn.imd.dominio.ProdutoDuravel;
import br.ufrn.imd.dominio.ProdutoNaoDuravel;


public class LojaView {
	public static void main(String[] args) {
		Deposito deposito = new Deposito();
		Date data1 = null;
		Date data2 = null;
		Date data3 = null;
		Date data4 = null;
		Date data5 = null;
		Date data6 = null;
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			data1 = df.parse("01/01/2021");
			data2 = df.parse("05/02/2022");
			data3 = df.parse("07/09/2022");
			data4 = df.parse("09/10/2020");
			data5 = df.parse("05/10/2021");
			data6 = df.parse("09/10/2020");			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// Produtos duráveis
		deposito.adicionarProduto(new ProdutoDuravel(1,"Carro", 15500,"Fiat","Fiat UNO", data1, 10));
		deposito.adicionarProduto(new ProdutoDuravel(2,"Livro", 125, "","Capitães de Areia", data2, 15));
		deposito.adicionarProduto(new ProdutoDuravel(3,"Celular", 1200.50, "Xiaomi","Redmi 10", data3, 5));
		
		// Produtos não duráveis
		deposito.adicionarProduto(new ProdutoNaoDuravel(4,"Chocolate", 5, "Garoto","Bombom", data2, data3, "Alimentício"));
		deposito.adicionarProduto(new ProdutoNaoDuravel(5,"Toalha", 30, "","", data3, data4, "Higiene Pessoal"));
		deposito.adicionarProduto(new ProdutoNaoDuravel(6,"Sabonete", 10, "Dove","", data6, data5, "Higiene Pessoal"));
		
		System.out.printf("Quantidade de produtos no depósito: %d\n", deposito.qntProdutos());
		System.out.printf("Depósito vazio: %s\n", (deposito.estaVazio())?"Sim":"Não");
		System.out.printf("Produto com maior preço: %s\n", deposito.maisCaro());
	}
}
