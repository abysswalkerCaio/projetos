package projetos;

import java.util.Scanner;

public class AlterarNome {
	public static void main(String[] args) {
		Scanner nomes = new Scanner(System.in);
		String primeiro, ultimo;
		System.out.println("Digite o primeiro nome: ");
		primeiro = nomes.nextLine();
		System.out.println("Informe o último nome: ");
		ultimo = nomes.nextLine();
		nomes.close();
		System.out.println(primeiroalterado.charAt(0) + ". " + ultimo);
	}
}
