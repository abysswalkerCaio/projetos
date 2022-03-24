package charactersBuild;

import javax.swing.JOptionPane;

public class CharacterData {

	private String nome;
	private int idade, vida;
	private double altura;
	private static int characterCount = 0;
	private CharacterPowers powers;
	private CharacterImage imagens;

	// Constructor;
	public CharacterData(String nome, int vida, int idade, double altura, CharacterPowers poderUm,
			CharacterPowers poderDois, CharacterPowers poderTres, CharacterImage imagens) {
		this.nome = nome;
		this.vida = vida;
		this.idade = idade;
		this.altura = altura;
		this.powers = poderUm;
		this.powers = poderDois;
		this.powers = poderTres;
		this.imagens = imagens;
		characterCount++;
	}

	// Methods;
	public void showCharacterStatus() {
		if (characterCount == 1) {
			JOptionPane.showMessageDialog(null,
					"(Dados do Personagem)" + "\n\n" + "Nome: " + getNome() + "\n" + "Vida Total: " + getVida() + "\n"
							+ "Idade: " + getIdade() + "\n" + "Altura: " + getAltura() + "\n\n"
							+ "(Poderes do Personagem)" + "\n\n" + "Primeiro Poder: " + getPowers().getPoderUm() + " / "
							+ getPowersDamage().getDanoPoderUm() + "\n" + "Segundo Poder: " + getPowers().getPoderDois()
							+ " / " + getPowersDamage().getDanoPoderDois() + "\n" + "Terceiro Poder: "
							+ getPowers().getPoderTres() + " / " + getPowersDamage().getDanoPoderUm(),
					"Personagem número: " + CharacterData.getCharacterCount(), JOptionPane.INFORMATION_MESSAGE, getLeoneImage().getImagemLeone());
		}
		else if (characterCount == 2) {
			JOptionPane.showMessageDialog(null,
					"(Dados do Personagem)" + "\n\n" + "Nome: " + getNome() + "\n" + "Vida Total: " + getVida() + "\n"
							+ "Idade: " + getIdade() + "\n" + "Altura: " + getAltura() + "\n\n" + "(Poderes do Personagem)"
							+ "\n\n" + "Primeiro Poder: " + getPowers().getPoderUm() + " / "
							+ getPowersDamage().getDanoPoderUm() + "\n" + "Segundo Poder: " + getPowers().getPoderDois()
							+ " / " + getPowersDamage().getDanoPoderDois() + "\n" + "Terceiro Poder: "
							+ getPowers().getPoderTres() + " / " + getPowersDamage().getDanoPoderUm(),
					"Personagem número: " + CharacterData.getCharacterCount(), JOptionPane.INFORMATION_MESSAGE, getSheeleImage().getImagemSheele());
		}
	}

	// Getters;
	public String getNome() {
		return this.nome;
	}

	public int getVida() {
		return this.vida;
	}

	public int getIdade() {
		return this.idade;
	}

	public double getAltura() {
		return this.altura;
	}

	static public int getCharacterCount() {
		return CharacterData.characterCount;
	}

	public CharacterPowers getPowers() {
		return this.powers;
	}

	public CharacterPowers getPowersDamage() {
		return this.powers;
	}
	
	public CharacterImage getLeoneImage() {
		return this.imagens;
	}

	public CharacterImage getSheeleImage() {
		return this.imagens;
	}

	// Setters;
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
