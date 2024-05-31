package apps;

import utilidades.musica.Reprodutor;
import utilidades.navegador.Navegador;
import utilidades.telefone.Telefone;

public class Aparelho implements Reprodutor, Telefone, Navegador{

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Musica escolhida foi " + musica);
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Então vamos tocar! " );
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Música pausada");
	}
	
	
	@Override
	public void ligar(String numero) {
		System.out.println("Você está ligando para o número: " + numero);
	}
	
	@Override
	public void atender() {
		System.out.println("atendendo...");
		
	}
	
	@Override
	public void correioVoz() {
		System.out.println("Você está acessando o correio de voz");
	}
	
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("A página " + url + " será exibida em breve ");
	}
	
	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba está sendo adicionada");
	}
	
	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina ");
	}

	
		
		
		
		
}

	

