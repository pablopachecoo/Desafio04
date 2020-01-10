package br.com.gft.model;

public class Livro extends Produto {
	String Autor;
	String Tema;
	int qntPag;

// CONTRUTORES \\	
	public Livro() {

	}

	public Livro(String nome, double preco, int qnt, String autor, String tema, int qntPag) {
		super(nome, preco, qnt);
		Autor = autor;
		Tema = tema;
		this.qntPag = qntPag;
	}

//GETTERS E SETTERS\\
	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getTema() {
		return Tema;
	}

	public void setTema(String tema) {
		Tema = tema;
	}

	public int getQntPag() {
		return qntPag;
	}

	public void setQntPag(int qntPag) {
		this.qntPag = qntPag;
	}

	public int getImposto() {
		return qntPag;
	}
// Calculo de Imposto
	public double calculaImposto() {
		double valor = 0;
		if (Tema == "educativo") {
			System.out.println("O livro (" + getNome() +  ") Não tem imposto, " + " Tema: " + getTema());
			return 0;
		} else {
			valor = getPreco() * 0.10;
			System.out.println("O valor do imposto sobre o livro (" + getNome() +  ") é de  " + valor + " Reais");
			return valor;

		}

	}

}
