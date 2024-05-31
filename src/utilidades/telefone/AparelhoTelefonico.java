package utilidades.telefone;

public class AparelhoTelefonico implements Telefone {
	
	
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
	
	
	
}
