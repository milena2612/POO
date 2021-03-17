package aula02_poo;

import java.util.Scanner;

public class Exercicio {
	
	public static class Livro {
		String titulo;
		String autor;
		int quantidadePaginas;
		
		public Livro (String titulo, String autor, int quantidadePaginas) {
			this.titulo = titulo;
			this.autor = autor;
			this.quantidadePaginas = quantidadePaginas;
		
	}
		public static class Triangulo {
			
			double ladoA, ladoB, ladoC;
			
			public Triangulo(double ladoA, double ladoB, double ladoC) {
				this.ladoA = ladoA;
				this.ladoB = ladoB;
				this.ladoC = ladoC;
			}
			
			public double calcularPerimetro() {
				return this.ladoA + this.ladoB + this.ladoC;
			}
		}
		public static class Televisao {
			
			int canal = 0;
			int volume = 0;
			
		}

	public static void main(String[] args) {
		
		Livro livro01 = new Livro("Título 01", "Milena", 500);
		Livro livro02 = new Livro("Título 02", "José de Alencar", 150);
		
		Scanner entrada = new Scanner(System.in);
		double a, b, c;
		
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		
		Triangulo t = new Triangulo(a, b, c);
		System.out.println("Perímetro: " + t.calcularPerimetro());

	}

}
}
