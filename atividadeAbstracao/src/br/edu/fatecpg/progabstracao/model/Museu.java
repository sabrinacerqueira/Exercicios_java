package br.edu.fatecpg.progabstracao.model;

public class Museu {

	public String nomeMuseu;
	public String endereco;
	public String colecaoExposicao;
	public String guiaResponsavel;
	public int horarioFuncionamento;
	
	public void exibirExposicao(){
		System.out.println(nomeMuseu + " está exibindo a exposição : " + colecaoExposicao );
	}
	public void venderIngresso(){
		System.out.println(nomeMuseu + " vendeu um ingresso.");
	}
	public void agendarVisita(){
		System.out.println(nomeMuseu + " agendou uma visita.");
	}
    public void realizarEventoCultural(){
        System.out.println(guiaResponsavel + " realizou um evento cultural no " + nomeMuseu );
    }
}
