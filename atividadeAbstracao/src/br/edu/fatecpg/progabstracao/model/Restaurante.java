package br.edu.fatecpg.progabstracao.model;

public class Restaurante {
	
	 	public String nomeRestaurante;
	    public String enderecoRestaurante;
	    public String cardapio;
	    public String horarioFuncionamento;
	    public String capacidadeAtendimento;

	    public void receberCliente(){
	        System.out.println(nomeRestaurante + " está recebendo clientes.");
	    }

	    public void servirPrato(){
	        System.out.println(nomeRestaurante + " está servindo o prato.");
	    }

	    public void calcularConta(){
	        System.out.println(nomeRestaurante + " está calculando a conta.");
	    }

	    public void reservarMesa(){
	        System.out.println(nomeRestaurante + " reservou uma mesa.");
	    }
}
