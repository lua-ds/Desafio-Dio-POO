package utilidades.musica;

public class ReprodutorMusical implements Reprodutor{


	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Musica escolhida foi" + musica);
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Então vamos tocar!");
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Música pausada");
	}
	
	
	
}
