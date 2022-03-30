package projetos;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class TabuadaForLoop {

	JFrame modelos = new JFrame();

	public static void main(String[] args) {
		TabuadaForLoop instanciar = new TabuadaForLoop();
		instanciar.mudarCor();
		instanciar.calcularTabuada(0, 0);
	}

	public void calcularTabuada(int valor, int valortabuada) {
		String resultado = "";
		valor = Integer.parseInt(JOptionPane.showInputDialog(modelos, "Insira um valor a ser calculado: ",
				"Informe um valor", JOptionPane.QUESTION_MESSAGE));
		valortabuada = Integer.parseInt(JOptionPane.showInputDialog(modelos, "Insira o valor da tabuada : ",
				"Informe outro valor", JOptionPane.QUESTION_MESSAGE));
		if (valortabuada <= 0) {
			JOptionPane.showMessageDialog(modelos, "Um valor inválido foi inserido!", "Erro no inserção",
					JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		} else {
			for (int x = 1; x <= valortabuada; x++) {
				if (x < valortabuada) {
					resultado += String.valueOf(valor * x + ", ");
				} else {
					resultado += String.valueOf(valor * x + ".");
				}

			}
			JOptionPane.showMessageDialog(modelos, "Resultados: " + resultado, "Resultado da Tabuada",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void mudarCor() {
		UIManager.put("OptionPane.background", new ColorUIResource(220, 220, 220));
		UIManager.put("Panel.background", new ColorUIResource(220, 220, 220));
		JDialog.setDefaultLookAndFeelDecorated(true);
	}
}
