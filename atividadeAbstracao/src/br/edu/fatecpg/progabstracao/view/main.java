package br.edu.fatecpg.progabstracao.view;
import br.edu.fatecpg.progabstracao.model.Carro;
import br.edu.fatecpg.progabstracao.model.Hotel;
import br.edu.fatecpg.progabstracao.model.Museu;
import br.edu.fatecpg.progabstracao.model.Restaurante;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Exercicio 1 Carro menu interativo
		System.out.println("---Exercício 1 - Carro---");
		
		Scanner ler = new Scanner(System.in);
		Carro meuCarro = new Carro();
		int opcao;
		
		System.out.println("Digite o modelo do seu carro:");
		meuCarro.modelo = ler.nextLine();
		
		System.out.println("Digite a cor do seu carro:");
		meuCarro.cor = ler.nextLine();
		
		System.out.println("Digite a capacidade do tanque do seu carro:");
		meuCarro.capacidadeTanque = ler.nextLine();
		
		System.out.println("\nO modelo do seu carro é: " + meuCarro.modelo);
		System.out.println("A cor do seu carro é: " + meuCarro.cor);
		System.out.println("A capacidade do tanque do seu carro é: " + meuCarro.capacidadeTanque +"\n");
		
		
		System.out.println("---Menu---");
		System.out.println("1 - Ligar o carro");
		System.out.println("2 - Acelerar o carro");
		System.out.println("3 - Frear o carro");
		System.out.println("4 - Buzinar");
		System.out.println("5 - Desligar o carro");
		System.out.println("0 - Sair do menu");
		do {
		System.out.println("\nDigite a opção desejada:");
		opcao = ler.nextInt();
		ler.nextLine();
		
		switch(opcao){
				case 1:
					meuCarro.ligar();
					break;
				case 2:
					meuCarro.acelerar();
					break;
				case 3:
					meuCarro.frear();
					break;
				case 4:
					meuCarro.buzinar();
					break;
				case 5:
					meuCarro.desligar();
					break;
				case 0:
					System.out.println("Fechando menu...\n");
					break;
				default:
					System.out.println("Opção inválida");
			}
		}while(opcao != 0);
		
		//Exercício 2
		System.out.println("\n---Exercício 2 - Hotel---");
		
		Hotel hotel1 = new Hotel();
		
		hotel1.nomeHotel = "Hotel Java";
		hotel1.enderecoHotel = "Praça 19 de janeiro";
		System.out.println("\nO nome do primeiro hotel é "+ hotel1.nomeHotel);
		System.out.println("O endereço do primeiro hotel é "+ hotel1.enderecoHotel + "\n");
		
		hotel1.reservarQuarto(); 
		hotel1.realizarCheckIn();

		
        Hotel hotel2 = new Hotel();
      
        hotel2.nomeHotel = "Pousada Java";
        hotel2.classificacaoEstrela = "5 Estrelas";
        System.out.println("\nO nome do segundo hotel é "+ hotel2.nomeHotel);
        System.out.println("O Hotel "+ hotel2.nomeHotel + " é " + hotel2.classificacaoEstrela +"\n");
        
        hotel2.realizarCheckIn(); 
        hotel2.fornecerServicoQuarto();
        
		//Exercício 3
		System.out.println("\n---Exercício 3 - Restaurante---");
		
		Restaurante restaurante1 = new Restaurante();
		
		restaurante1.nomeRestaurante = "Restaurante Italiano";
		restaurante1.horarioFuncionamento ="16:00h as 22:00h";
		System.out.println("\nO nome do primeiro restaurante é "+ restaurante1.nomeRestaurante);
		System.out.println("O restaurante " + restaurante1.nomeRestaurante + " Funciona das: " + restaurante1.horarioFuncionamento+"\n");
		
        restaurante1.receberCliente();
        restaurante1.servirPrato();

        Restaurante restaurante2 = new Restaurante();
        
        restaurante2.nomeRestaurante = "Restaurante Mexicano";
        restaurante2.capacidadeAtendimento = "60 pessoas";
		System.out.println("\nO nome do segundo restaurante é "+ restaurante2.nomeRestaurante);
		System.out.println("O restaurante "+ restaurante2.nomeRestaurante + " tem capacidade para " + restaurante2.capacidadeAtendimento +"\n");

        restaurante2.receberCliente();
        restaurante2.calcularConta();
        
		//Exercício 4
		System.out.println("\n---Exercício 4 - Museu---");
		
        Museu museu1 = new Museu();
        
        museu1.nomeMuseu = "Museu de Tecnologia"; 
        museu1.colecaoExposicao = "Historia Java";
        System.out.println("\nO nome do primeiro museu é: "+ museu1.nomeMuseu);
        System.out.println("O nome da exposição no primeiro museu é: "+ museu1.colecaoExposicao +"\n");

        
        museu1.exibirExposicao();
        museu1.venderIngresso();

        Museu museu2 = new Museu();
        
        museu2.nomeMuseu = "Museu Histórico";
        museu2.guiaResponsavel ="Gertrudes";
		System.out.println("\nO nome do segundo museu é: "+ museu2.nomeMuseu);
		System.out.println("O nome do guia responsavel no segundo museu é: "+ museu2.guiaResponsavel +"\n");

		
        museu2.agendarVisita();
        museu2.realizarEventoCultural();
        
		ler.close();
	}

}
