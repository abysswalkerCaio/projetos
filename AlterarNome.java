package projetos;

import java.util.Scanner;

public class AlterarNome {
	public static void main(String[] args) {
		Scanner nomes = new Scanner(System.in);
		String primeiro, ultimo, primeiroalterado;
		System.out.println("Digite o primeiro nome: ");
		primeiro = nomes.nextLine();
		System.out.println("Informe o último nome: ");
		ultimo = nomes.nextLine();
		primeiroalterado = primeiro.substring(0, 1);
		nomes.close();
		System.out.println(primeiroalterado + ". " + ultimo);
	}
}
