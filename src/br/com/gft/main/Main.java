package br.com.gft.main;

import java.util.List;

import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.VideoGame;

import java.util.ArrayList;

public class Main {
// Criando livros \\
	public static void main(String[] args) {
		Livro l1 = new Livro("Harry Potter", 40, 5, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("O Senhor dos Aneis", 30, 3, "Tolkien", "Fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 30, "GFT", "educativo", 500);
// Criando VideoGames \\
		VideoGame ps4 = new VideoGame("ps4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("ps4usado", 1000, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("Xbox", 1500, 500, "Microsoft", "One", false);
// Adicionando os Livros ao Array \\
		ArrayList<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
// Adicioando os Livros ao Array \\
		List<VideoGame> VideoGame = new ArrayList<>();
		VideoGame.add(ps4);
		VideoGame.add(ps4Usado);
		VideoGame.add(xbox);

		Loja americanas = new Loja("Americanas", "12345678", livros, VideoGame);

		l2.calculaImposto();
		l3.calculaImposto();

		ps4Usado.calculaImposto();
		ps4.calculaImposto();

		americanas.listaLivros();
		americanas.listaVideoGames();
		americanas.calculaPatrimonio();

	}

}
