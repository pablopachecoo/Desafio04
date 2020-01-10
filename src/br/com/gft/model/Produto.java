package br.com.gft.model;

public abstract class Produto {
	private String nome;
	private double Preco;
	private int Qnt;

	public Produto() {

	}
	
//  Construtor \\
	
	public Produto(String nome, double preco, int qnt) {
		super();
		this.nome = nome;
		Preco = preco;
		Qnt = qnt;
	}
	
// Setters e Getters \\

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}

	public int getQnt() {
		return Qnt;
	}

	public void setQnt(int qnt) {
		Qnt = qnt;
	}

}
