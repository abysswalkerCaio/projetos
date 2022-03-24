package charactersBuild;

import javax.swing.JOptionPane;
import java.util.Random;

public class CharactersFight {
	// Methods;
	public void showCharactersFight(CharacterData leone, CharacterData sheele) {
		JOptionPane.showMessageDialog(null,
				"Primeiro Lutador: " + leone.getNome() + "\n" + "Vida: " + leone.getVida() + "\n\n" + "V.S." + "\n\n"
						+ "Segundo Lutador: " + sheele.getNome() + "\n" + "Vida: " + sheele.getVida(),
				"Grande Luta!", JOptionPane.WARNING_MESSAGE, CharacterImage.battle);
	}

	public void randomFightersAttacks(CharacterPowers leonePoderes, CharacterPowers sheelePoderes, CharacterData leone,
			CharacterData sheele) {
		int ataqueLeone, ataqueSheele;
		Random gerarAtaque = new Random();
		do {
			ataqueLeone = gerarAtaque.nextInt(1, 4);
			ataqueSheele = gerarAtaque.nextInt(1, 4);

			// Leone's Attacks;
			if (leone.getVida() == 0 || sheele.getVida() == 0) {
				break;
			} else {
				if (ataqueLeone == 1) {
					sheele.setVida(sheele.getVida() - leonePoderes.getDanoPoderUm());
					if (leone.getVida() < 0) {
						leone.setVida(0);
					} else if (sheele.getVida() < 0) {
						sheele.setVida(0);
					}
					JOptionPane.showMessageDialog(null,
							"Leone utilizou: " + leonePoderes.getPoderUm() + "\n" + "Vida de Leone: " + leone.getVida()
									+ "\n" + "Vida de Sheele: " + sheele.getVida(),
							"Combate ocorrendo...", JOptionPane.ERROR_MESSAGE, CharacterImage.leoneAttack);
				} else if (ataqueLeone == 2) {
					sheele.setVida(sheele.getVida() - leonePoderes.getDanoPoderDois());
					if (leone.getVida() < 0) {
						leone.setVida(0);
					} else if (sheele.getVida() < 0) {
						sheele.setVida(0);
					}
					JOptionPane.showMessageDialog(null,
							"Leone utilizou: " + leonePoderes.getPoderDois() + "\n" + "Vida de Leone: "
									+ leone.getVida() + "\n" + "Vida de Sheele: " + sheele.getVida(),
							"Combate ocorrendo...", JOptionPane.ERROR_MESSAGE, CharacterImage.leoneAttack);
				} else {
					sheele.setVida(sheele.getVida() - leonePoderes.getDanoPoderTres());
					if (leone.getVida() < 0) {
						leone.setVida(0);
					} else if (sheele.getVida() < 0) {
						sheele.setVida(0);
					}
					JOptionPane.showMessageDialog(null,
							"Leone utilizou: " + leonePoderes.getPoderTres() + "\n" + "Vida de Leone: "
									+ leone.getVida() + "\n" + "Vida de Sheele: " + sheele.getVida(),
							"Combate ocorrendo...", JOptionPane.ERROR_MESSAGE, CharacterImage.leoneAttack);
				}
			}

			// Sheele's Attacks;
			if (leone.getVida() == 0 || sheele.getVida() == 0) {
				break;
			} else {
				if (ataqueSheele == 1) {
					leone.setVida(leone.getVida() - sheelePoderes.getDanoPoderUm());
					if (leone.getVida() < 0) {
						leone.setVida(0);
					} else if (sheele.getVida() < 0) {
						sheele.setVida(0);
					}
					JOptionPane.showMessageDialog(null,
							"Sheele utilizou: " + sheelePoderes.getPoderUm() + "\n" + "Vida de Leone: "
									+ leone.getVida() + "\n" + "Vida de Sheele: " + sheele.getVida(),
							"Combate ocorrendo...", JOptionPane.ERROR_MESSAGE, CharacterImage.sheeleAttack);
				} else if (ataqueSheele == 2) {
					leone.setVida(leone.getVida() - sheelePoderes.getDanoPoderDois());
					if (leone.getVida() < 0) {
						leone.setVida(0);
					} else if (sheele.getVida() < 0) {
						sheele.setVida(0);
					}
					JOptionPane.showMessageDialog(null,
							"Sheele utilizou: " + sheelePoderes.getPoderDois() + "\n" + "Vida de Leone: "
									+ leone.getVida() + "\n" + "Vida de Sheele: " + sheele.getVida(),
							"Combate ocorrendo...", JOptionPane.ERROR_MESSAGE, CharacterImage.sheeleAttack);
				} else {
					leone.setVida(leone.getVida() - sheelePoderes.getDanoPoderTres());
					if (leone.getVida() < 0) {
						leone.setVida(0);
					} else if (sheele.getVida() < 0) {
						sheele.setVida(0);
					}
					JOptionPane.showMessageDialog(null,
							"Sheele utilizou: " + sheelePoderes.getPoderTres() + "\n" + "Vida de Leone: "
									+ leone.getVida() + "\n" + "Vida de Sheele: " + sheele.getVida(),
							"Combate ocorrendo...", JOptionPane.ERROR_MESSAGE, CharacterImage.sheeleAttack);
				}
			}
		} while (leone.getVida() > 0 && sheele.getVida() > 0);

		if (leone.getVida() > sheele.getVida()) {
			JOptionPane.showMessageDialog(null,
					leone.getNome() + " é o(a) vencedor(a)!" + "\n" + "Vida de Leone: " + leone.getVida() + "\n"
							+ "Vida de Sheele: " + sheele.getVida(),
					"Temos um Vencedor(a) da Grande Luta!", JOptionPane.INFORMATION_MESSAGE, CharacterImage.leoneWin);
		} else {
			JOptionPane.showMessageDialog(null,
					sheele.getNome() + " é o(a) vencedor(a)!" + "\n" + "Vida de Sheele: " + sheele.getVida() + "\n"
							+ "Vida de Leone: " + leone.getVida(),
					"Temos um Vencedor(a) da Grande Luta!", JOptionPane.INFORMATION_MESSAGE, CharacterImage.sheeleWin);
		}
	}
}
