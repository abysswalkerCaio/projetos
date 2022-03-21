package projetos;

import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class ColetarChars {

	JFrame modelos = new JFrame();

	public static void main(String[] args) {
		ColetarChars instanciar = new ColetarChars();
		instanciar.mudarCor();
		instanciar.coletarLetras(null, 0);
	}

	public void coletarLetras(String frase, int tamanho) {
		frase = JOptionPane.showInputDialog(modelos, "Insira sua frase: ", "Sua Frase", JOptionPane.QUESTION_MESSAGE);
		String coletar = JOptionPane.showInputDialog(modelos,
				"Insira o texto que será encontrado na frase: " + "\n"
						+ "Observações: (1) Qualquer letra ou número depois do primeiro caractere será desconsiderado;"
						+ "\n" + "(2) Tenha em mente que: A, Á, À, a, á, à são considerados diferentes por exemplo.",
				"Encontrar", JOptionPane.QUESTION_MESSAGE);
		char texto = coletar.charAt(0);
		tamanho = frase.length();
		int contar = 0, leitura = 0;
		while (leitura < tamanho) {
			if (frase.charAt(leitura) != texto) {
				leitura++;
				continue;
			} else {
				leitura++;
				contar++;
			}
		}
		JOptionPane.showMessageDialog(modelos, "Quantas vezes a letra ou número convertido em texto \"" + texto
				+ "\" apareceu na frase: " + contar + " veze(s).", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

	public void mudarCor() {
		UIManager.put("OptionPane.background", new ColorUIResource(220, 220, 220));
		UIManager.put("Panel.background", new ColorUIResource(220, 220, 220));
		JDialog.setDefaultLookAndFeelDecorated(true);
	}
}
