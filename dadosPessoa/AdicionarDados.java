package dadosPessoa;

import java.util.Scanner;
import java.util.regex.*;
import javax.swing.JOptionPane;

public class AdicionarDados {
	String nome;
	int idade;
	double altura;

	Scanner leitura = new Scanner(System.in);

	//Methods;
	public void inserirDados(String nome, int idade, double altura) {
		System.out.print("Digite seu nome: ");
		nome = leitura.nextLine();
		if (rejeitarEntradasIndevidasLetras(nome) == false) {
			JOptionPane.showMessageDialog(null, "Somente são permitidas letras!", "Ocorreu um erro",
					JOptionPane.ERROR_MESSAGE);
		} else {
			this.nome = nome;
		}

		try {
			System.out.print("Informe sua idade: ");
			idade = Integer.parseInt(leitura.nextLine());
			this.idade = idade;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e + "\n\n" + "Somente são permitidos números inteiros!",
					"Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
		}

		try {
			System.out.print("Informe sua altura: ");
			altura = Double.parseDouble(leitura.nextLine());
			this.altura = altura;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e + "\n\n" + "Somentes são permitidos números inteiros ou decimais!",
					"Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
		}
	}

	public boolean rejeitarEntradasIndevidasLetras(String nome) throws PatternSyntaxException {
		Pattern pattern = Pattern.compile("[A-Za-zÀ-ÿ '-][A-Za-zÀ-ÿ\s '-]*");
		Matcher matcher = pattern.matcher(nome);
		boolean result = matcher.matches();
		return result;
	}

	public void validarDados() {
		if (getNome() == null) {
			System.out.println("\nNenhum nome inserido!");
		} else {
			System.out.println("\nSeu nome: " + getNome());
		}
		if (getIdade() == 0) {
			System.out.println("Nenhuma idade inserida!");
		} else {
			System.out.println("Sua idade: " + getIdade());
		}
		if (getAltura() == 0.0) {
			System.out.println("Nenhuma altura inserida!");
		} else {
			System.out.println("Sua altura: " + getAltura());
		}
	}

	public void alterarDados(String nome, int idade, double altura) {
		
	}

	//Getters;
	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public double getAltura() {
		return this.altura;
	}
	
	//Setters;
	
}
