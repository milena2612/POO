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
	}//----------------------------------------------------------------------------------------------------
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
		}//------------------------------------------------------------------------------------------------
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
		}//------------------------------------------------------------------------------------------------
		
		public static class Funcionario {
			//Atributos:
			String nome;
			double salario;
			
			public Funcionario(String nome, double salario) {
				this.nome = nome;
				this.salario = salario;
			}
			
			public double aumentarSalario(double percentual) {
				return this.salario = salario + (salario * percentual);
			}
			
		}//------------------------------------------------------------------------------------------------
	
		public static class Aluno {
			
			String nome;
			int horasSemDormir;
			
			public Aluno(String nome) {
				this.horasSemDormir = 0;
				this.nome = nome;
			}
			
			public void estudar(int horasDeEstudo) {
				this.horasSemDormir += horasDeEstudo;
			}
			
			public void dormir(int horasDeSono) {
				this.horasSemDormir -= horasDeSono;
			}
		}//------------------------------------------------------------------------------------------------
		
		public static class Carro {
			
			int quantidadeCombustivel;
			
			public Carro() {
				this.quantidadeCombustivel = 0;
			}
			
			public void adicionarCombustivel(int litros) {
				this.quantidadeCombustivel += litros;
			}
			
			public int obterCombustivel() {
				return quantidadeCombustivel;
			}
			
			public void andar(int distancia) {
				this.quantidadeCombustivel -= (distancia * 0.2); 
			}
		}//------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
		//Exercício01
		Livro livro01 = new Livro("Título 01", "Milena", 500);
		System.out.println(livro01);
		Livro livro02 = new Livro("Título 02", "José de Alencar", 150);
		System.out.println(livro02);
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		//Exercício02
		Scanner entrada = new Scanner(System.in);
	    double a, b, c;
		
		System.out.print("Informe os lados do triângulo:");
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();
		
		//Criação do objeto triângulo:
		Triangulo t = new Triangulo(a, b, c);
		System.out.println("Perímetro: " + t.calcularPerimetro());
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		//Exercício03
		Televisao tv = new Televisao();
		tv.alterarCanal(5);
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.diminuirVolume();
		System.out.println("A tv está no canal " + tv.canal);   // A tv está no canal 5
		System.out.println("A tv está no volume " + tv.volume); // A tv está no volume 2
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		//Exercício04
		String nome;
		double salario;
		double aumento;
		
		System.out.println("Informe o nome do funcionário: ");
		nome = entrada.next();
		System.out.println("Informe o salário do funcionário: ");
		salario = entrada.nextDouble();
		Funcionario funcionario01 = new Funcionario(nome, salario);
		
		System.out.println("Informe o percentual de aumento: ");
		aumento = entrada.nextDouble();
		System.out.println(funcionario01.aumentarSalario(aumento));
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		//Exercício05
		Aluno aluno1 = new Aluno("Luizinho");
		aluno1.estudar(3);
		aluno1.dormir(2);
		aluno1.estudar(4);
		aluno1.dormir(2);
		System.out.println("O aluno " + aluno1.nome + " está " + aluno1.horasSemDormir + " horas sem dormir");
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		//Exercício06
		Carro meuCarro = new Carro();				
		meuCarro.adicionarCombustivel(20);			
		meuCarro.andar(80);						
		System.out.println("Quantidade de Litros de combustível no tanque: " + meuCarro.obterCombustivel());

		entrada.close();
	}
}
