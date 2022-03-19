package projetos;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JDialog;
import java.util.Random;

public class PainelAleatorizador {

	int valoraleatoriotexto;

	Random gerar = new Random();
	JFrame modelos = new JFrame();

	public static void main(String[] args) {
		PainelAleatorizador instanciar = new PainelAleatorizador();
		instanciar.mudarCor();
		instanciar.gerarAleatorio(0);
		instanciar.numeroParaTexto(null);
	}

	public void gerarAleatorio(int valoraleatorio) {
		int valor;
		valor = Integer.parseInt(JOptionPane.showInputDialog(modelos, "Insira um valor inteiro: ", "Informe um valor",
				JOptionPane.QUESTION_MESSAGE));
		if (valor < -999) {
			JOptionPane.showMessageDialog(modelos, "Você inseriu um valor inválido!", "Erro de entrada",
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} else {
			valoraleatorio = gerar.nextInt(valor, 101);
			valoraleatoriotexto = valoraleatorio;
			boolean tamanho = valoraleatorio >= 50;
			JOptionPane
					.showMessageDialog(modelos,
							"Seu número foi aleatorizado!" + "\n" + "Será gerado um valor entre \"Seu número até 100!\""
									+ "\n" + "Número aleatório: " + valoraleatorio,
							"Resultados", JOptionPane.INFORMATION_MESSAGE);
			if (tamanho) {
				JOptionPane.showMessageDialog(modelos, "O número aleatório gerado é maior ou igual a 50!",
						"Tamanho do número", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(modelos, "O número aleatório gerado é menor do que 50!",
						"Tamanho do número", JOptionPane.INFORMATION_MESSAGE);
				tamanho = false;
			}
		}
	}

	public void numeroParaTexto(String conversao) {
		conversao = String.valueOf(valoraleatoriotexto);
		if (conversao.length() < 4) {
			if (conversao.length() == 1) {
				JOptionPane.showMessageDialog(modelos,
						"Seu número é uma Unidade!" + "\n" + "Quantidade de números: " + conversao.length() + "\n"
								+ "Números encontrados: " + "\n" + "Primeiro número: " + conversao.charAt(0),
						"Unidade, Dezena ou Centena?", JOptionPane.INFORMATION_MESSAGE);
			} else if (conversao.length() == 2) {
				JOptionPane.showMessageDialog(modelos,
						"Seu número é uma Dezena!" + "\n" + "Quantidade de números: " + conversao.length() + "\n"
								+ "Números encontrados: " + "\n" + "Primeiro número: " + conversao.charAt(0) + "\n"
								+ "Segundo número: " + conversao.charAt(1),
						"Unidade, Dezena ou Centena?", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(modelos,
						"Seu número é uma Centena!" + "\n" + "Quantidade de números: " + conversao.length() + "\n"
								+ "Números encontrados: " + "\n" + "Primeiro número: " + conversao.charAt(0) + "\n"
								+ "Segundo número: " + conversao.charAt(1) + "\n" + "Terceiro número: "
								+ conversao.charAt(2),
						"Unidade, Dezena ou Centena?", JOptionPane.INFORMATION_MESSAGE);
			}
		} else {
			int conversaointeiro;
			if (conversao.length() == 2) {
				conversaointeiro = conversao.length() - 1;
				JOptionPane.showMessageDialog(modelos,
						"Seu número é uma Unidade!" + "\n" + "Quantidade de números: " + conversaointeiro + "\n"
								+ "Números encontrados: " + "\n" + "Primeiro número: " + conversao.charAt(1),
						"Unidade, Dezena ou Centena?", JOptionPane.INFORMATION_MESSAGE);
			} else if (conversao.length() == 3) {
				conversaointeiro = conversao.length() - 1;
				JOptionPane.showMessageDialog(modelos,
						"Seu número é uma Dezena!" + "\n" + "Quantidade de números: " + conversaointeiro + "\n"
								+ "Números encontrados: " + "\n" + "Primeiro número: " + conversao.charAt(1) + "\n"
								+ "Segundo número: " + conversao.charAt(2),
						"Unidade, Dezena ou Centena?", JOptionPane.INFORMATION_MESSAGE);
			} else {
				conversaointeiro = conversao.length() - 1;
				JOptionPane.showMessageDialog(modelos,
						"Seu número é uma Centena!" + "\n" + "Quantidade de números: " + conversaointeiro + "\n"
								+ "Números encontrados: " + "\n" + "Primeiro número: " + conversao.charAt(1) + "\n"
								+ "Segundo número: " + conversao.charAt(2) + "\n" + "Terceiro número: "
								+ conversao.charAt(3),
						"Unidade, Dezena ou Centena?", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public void mudarCor() {
		UIManager.put("OptionPane.background", new ColorUIResource(220, 220, 220));
		UIManager.put("Panel.background", new ColorUIResource(220, 220, 220));
		JDialog.setDefaultLookAndFeelDecorated(true);
	}
}
