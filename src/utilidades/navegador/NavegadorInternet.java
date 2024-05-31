package utilidades.navegador;

public class NavegadorInternet implements Navegador{
	
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
