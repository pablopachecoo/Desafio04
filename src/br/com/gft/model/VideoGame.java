package br.com.gft.model;
// Atributos do VideoGame
public class VideoGame extends Produto {
	String Marca;
	String Modelo;
	boolean isUsado = false;

	public VideoGame() {

	}

	public VideoGame(String nome, double preco, int qnt, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qnt);
		Marca = marca;
		Modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	public double calculaImposto() {
		double valor = 0;
		if (isUsado = true && getNome() == "ps4usado") {
			valor = getPreco() * 0.25;
			System.out.println("O valor do imposto no " + getNome() + " é de " + valor + " Reais");
		} else {
			valor = getPreco() * 0.45;
			System.out.println("O valor do imposto no " + getNome() + " é de " + valor + " Reais" + "\n" + "  _____________________________________________________");
		}
		return valor;

			
		}
	
		
	}


