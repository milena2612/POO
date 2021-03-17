package aula02_poo;

import java.util.Scanner;

public class Exercicio {
	
	public static class Livro {
		//Atributos:
		String titulo;
		String autor;
		int quantidadePaginas;
		
		public Livro (String titulo, String autor, int quantidadePaginas) {
			//Construtor:
			this.titulo = titulo;
			this.autor = autor;
			this.quantidadePaginas = quantidadePaginas;
		
	}
		public static class Triangulo {
			//Atributos:
			double ladoA, ladoB, ladoC;
			
			public Triangulo(double ladoA, double ladoB, double ladoC) {
				//Construtor:
				this.ladoA = ladoA;
				this.ladoB = ladoB;
				this.ladoC = ladoC;
			}
			//M�todo01:
			public double calcularPerimetro() {
				return this.ladoA + this.ladoB + this.ladoC;
			}
		}
		public static class Televisao {
			//Atributos:
			int canal;
			int volume;
			
			//Contrutor
			public Televisao() {
				this.canal = 0;
				this.volume = 0;
			}
			
			public void aumentarVolume() {
				this.volume++;
			}
			
			public void diminuirVolume( ) {
				this.volume--;
			}
			
			public void alterarCanal(int canal) {
				this.canal = canal;
			}
			
		}

	public static void main(String[] args) {
		
		Livro livro01 = new Livro("T�tulo 01", "Milena", 500);
		Livro livro02 = new Livro("T�tulo 02", "Jos� de Alencar", 150);
		
		Scanner entrada = new Scanner(System.in);
		double a, b, c;
		
		System.out.print("Informe os lados do tri�ngulo:");
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		
		//Cria��o do objeto tri�ngulo:
		Triangulo t = new Triangulo(a, b, c);
		System.out.println("Per�metro: " + t.calcularPerimetro());
		
		Televisao tv = new Televisao();
		tv.alterarCanal(5);
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.diminuirVolume();
		System.out.println("A tv est� no canal " + tv.canal);   // A tv est� no canal 5
		System.out.println("A tv est� no volume " + tv.volume); // A tv est� no volume 2


	}

}
}
