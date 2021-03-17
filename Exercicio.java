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
			//Método01:
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
		
		Livro livro01 = new Livro("Título 01", "Milena", 500);
		Livro livro02 = new Livro("Título 02", "José de Alencar", 150);
		
		Scanner entrada = new Scanner(System.in);
		double a, b, c;
		
		System.out.print("Informe os lados do triângulo:");
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		
		//Criação do objeto triângulo:
		Triangulo t = new Triangulo(a, b, c);
		System.out.println("Perímetro: " + t.calcularPerimetro());
		
		Televisao tv = new Televisao();
		tv.alterarCanal(5);
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.diminuirVolume();
		System.out.println("A tv está no canal " + tv.canal);   // A tv está no canal 5
		System.out.println("A tv está no volume " + tv.volume); // A tv está no volume 2


	}

}
}
