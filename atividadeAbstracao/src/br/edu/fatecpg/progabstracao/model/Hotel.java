package br.edu.fatecpg.progabstracao.model;

public class Hotel {
	
	    public String nomeHotel;
	    public String enderecoHotel;
	    public int quantidadeQuarto;
	    public String recepcionistaResponsavel;
	    public String classificacaoEstrela;

	    public void reservarQuarto(){
	        System.out.println(nomeHotel + " está reservando um quarto.");
	    }

	    public void realizarCheckIn(){
	        System.out.println(nomeHotel + " realizou check-in.");
	    }

	    public void realizarCheckOut(){
	        System.out.println(nomeHotel + " realizou check-out.");
	    }

	    public void fornecerServicoQuarto(){
	        System.out.println(nomeHotel + " forneceu serviço de quarto.");
	    }
}
