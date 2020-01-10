package br.com.gft.model;

//Importando a Lista \\
import java.util.List;

// Atributos da Loja \\
public class Loja {
	String Nome;
	String cnpj;

	List<Livro> livros;
	List<VideoGame> VideoGames;

	public Loja() {

	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		Nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		VideoGames = videoGames;
	}

// Getters e Setters 	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return VideoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		VideoGames = videoGames;
	}

// METODO PARA LISTAR OS LIVROS \\
	public void listaLivros() {
		if (livros.size() >= 0) {
			System.out.println(" ¦¦¦¦¦¦¦¦¦¦¦¦ Atualmente temos " + livros.size() + " Livros na Loja ¦¦¦¦¦¦¦¦");
		} else if (livros.size() < 0) {
			System.out.println("A Loja não tem Livros no seu Estoque");
		}
		System.out.println(" ¦_____________________________________________________¦");
		for (int i = 0; i < livros.size(); i++) {
			System.out.println(" Título: " + livros.get(i).getNome() + ", " + "Preço: " + livros.get(i).getPreco() + " "
					+ "Quantidade: " + livros.get(i).getQnt() + ", " + "Em Estoque");

		}

	}
	
// METODO PARA LISTAR VIDEOGAMES \\
	public void listaVideoGames() {
		// Mensagem com o Número de VideoGames
		System.out.println(" ____________________________________________________" + "\n" + " Atualmente temos " + VideoGames.size() + " Videogames No estoque");

		if (VideoGames.size() > 0) {
			for (int i = 0; i < VideoGames.size(); i++) {
				System.out.println(" Nome: " + VideoGames.get(i).getNome() + ", " + "Preço: "
						+ VideoGames.get(i).getPreco() + ", " + "Quantidade: " + VideoGames.get(i).getQnt() + " Em Estoque");

			}
		}

	}
// CALCULAR O PATRIMONIO TOTAL \\
	public double calculaPatrimonio() {
		System.out.println(" ____________________________________________________");

		double patrimonio = 0;
		for (int i = 0; i < livros.size(); i++) {
			patrimonio += livros.get(i).getPreco() * livros.get(i).getQnt();

		}
		for (int i = 0; i < VideoGames.size(); i++) {
			patrimonio += VideoGames.get(i).getPreco() * livros.get(i).getQnt();

		}
		// OUTPUT DO PATRIMONIO \\
		System.out.println("      O patrimonio da loja" + getNome() + "é de " + patrimonio);
		return patrimonio;

	}

}
