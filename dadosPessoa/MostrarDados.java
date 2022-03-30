package dadosPessoa;

public class MostrarDados {
	public static void main(String [] args) {
		PanelVisualEditor.mudarPainel();
		AdicionarDados pessoa = new AdicionarDados();
		pessoa.inserirDados(null, 0, 0);
		pessoa.validarDados();
		pessoa.alterarDados(null, 0, 0);
	}
}
