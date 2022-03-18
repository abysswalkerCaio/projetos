package projetos;

import java.util.Scanner;

public class TesteBoolean {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		TesteBoolean instanciar = new TesteBoolean();
		boolean primeiroteste = 25 == 20, segundoteste = 25 > 20, terceiroteste = 25 < 20, quartoteste = 25 != 20;
		boolean quintoteste = 25 >= 20, sextoteste = 25 <= 20;
		System.out.println(primeiroteste);
		System.out.println(segundoteste);
		System.out.println(terceiroteste);
		System.out.println(quartoteste);
		System.out.println(quintoteste);
		System.out.println(sextoteste);
		
		instanciar.metodoValores(0, 0);
		instanciar.verificarIdade(0);
	}

	public void metodoValores(int primeiro, int segundo) {
		System.out.print("Digite um valor: ");
		primeiro = input.nextInt();
		System.out.print("Digite outro valor: ");
		segundo = input.nextInt();
		boolean compararInput = primeiro == segundo;
		System.out.println(compararInput);
	}
	
	public void verificarIdade(int idade) {
		System.out.print("Insira sua idade: ");
		idade = input.nextInt();
		
		boolean permissaoidade = idade >= 18;
		
		if (permissaoidade == true) {
			System.out.println("Você tem idade suficiente parar tirar a carteira de motorista!");
		}
		else {
			System.out.println("Você não tem idade suficiente para tirar carteira de motorista!");
		}
		input.close();
	}
}
