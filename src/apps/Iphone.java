package apps;

import utilidades.musica.ReprodutorMusical;
import utilidades.telefone.*;
import utilidades.telefone.AparelhoTelefonico;

public class Iphone {
	public static void main(String[] args) {
		Aparelho aparelho = new Aparelho();
		
		System.out.println("MUSICA SELECIONAD: ");
		aparelho.selecionarMusica("The Cure");
		aparelho.tocar();
		System.out.println("*****************************");
		System.out.println("A música será pausada");
		System.out.println("*****************************");
		aparelho.pausar();
		System.out.println("-----------------------------");
		System.out.println("");
		
		System.out.println("VOCÊ ESTÁ LIGANDO PARA: ");
		aparelho.ligar("42569923");
		aparelho.atender();
		System.out.println("*****************************");
		aparelho.correioVoz();
		System.out.println("-----------------------------");
		System.out.println("");
		
		System.out.println("VOCÊ ESTÁ ACESSANDOA PÁGINA: ");
		aparelho.exibirPagina("www.google.com.br");
		aparelho.adicionarNovaAba();
		aparelho.atualizarPagina();
	}
}
				
				
	
