package br.edu.fatecpg.progabstracao.model;

public class Carro {

		public String cor;
		public String modelo;
		public String capacidadeTanque;
		
		public boolean acelerador;
		public boolean ligado;
		
		public void ligar() {
			if(ligado == false) {
				ligado = true;
				System.out.println("Carro Ligado!");
			}
			else {
				System.out.println("O Carro já está ligado.");
			}
			
		}
		public void acelerar() {
			if(ligado == false) {
				System.out.println("O carro está desligado.");
			}
			else {
				System.out.println("Carro Andando...");
				acelerador = true;
			}
		}
		public void frear() {
			if(ligado == false) {
				System.out.println("O carro está desligado.");
			}
			else {
				if(acelerador == false) {
				System.out.println("Carro está parado.");
				}
				else {
					System.out.println("Freiando...");
					acelerador = false;
				}
			}
		}
		public void buzinar() {
			if(ligado == false) {
				System.out.println("O carro está desligado.");
			}
			else {
				System.out.println("Buzinando..(bi-bi)");
			}
		}
		public void desligar() {
			if(ligado == true) {
				ligado = false;
				acelerador = false;
				System.out.println("Carro Desligado!");
			}
			else {
				System.out.println("O carro já está desligado.");
			}
		}
	}
