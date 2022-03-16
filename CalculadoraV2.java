package projetos;

import java.util.Scanner;

public class CalculadoraV2 {

	Scanner valores = new Scanner(System.in);
	String operacao;

	public static void main(String[] args) {
		CalculadoraV2 instanciar = new CalculadoraV2();
		System.out.println("Bem-vindo a Calculadora-505-Funções, escolha a operação que deseja realizar no momento.");
		System.out
				.println("Observação: Escreva o método exatamente do jeito como ele é descrito dentro dos parênteses.");
		System.out.println("(Adição) - A adição entre dois números;");
		System.out.println("(Subtração) - A subtração entre dois números;");
		System.out.println("(Divisão) - A divisão entre dois números;");
		System.out.println("(Multiplicação) - A multiplicação entre dois números;");
		System.out.println("(Raiz Quadrada) - A raiz quadrada de um número;");
		System.out.println("(Resto) - O resto de uma divisão;");
		System.out.println("(Quadrado) - O quadrado de um número;");
		System.out.println("(Módulo) - O módulo de um número.");
		System.out.print("Método de operação: ");
		instanciar.operacao = instanciar.valores.nextLine();
		switch (instanciar.operacao) {
		case "Adição":                 
			instanciar.adicao(0, 0); //Classe Scanner possuí prioridade, sendo ambos os 0 utilizados somente
			break;                   //para referência aos argumentos citados no método adicao().  
		case "Subtração":               
			instanciar.subtracao(0, 0);
			break;
		case "Divisão":
			instanciar.divisao(0, 0);
			break;
		case "Multiplicação":
			instanciar.multiplicacao(0, 0);
			break;
		case "Raiz Quadrada":
			instanciar.raizquadrada(0);
			break;
		case "Resto":
			instanciar.resto(0, 0);
			break;
		case "Quadrado":
			instanciar.quadrado(0);
			break;
		case "Módulo":
			instanciar.modulo(0);
			break;
		default:
			System.out.println("Uma operação inválida foi requesitada, finalizando programa...");
			System.exit(0);
		}
		instanciar.valores.close();
		System.out.println("Obrigado por utilizar!");
	}

	public void adicao(double primeiro, double segundo) {
		System.out.print("Digite o primeiro número: ");
		primeiro = Double.parseDouble(valores.nextLine());
		System.out.print("Digite o segundo número: ");
		segundo = Double.parseDouble(valores.nextLine());
		System.out.println("O resultado é: " + (primeiro + segundo));
	}

	public void subtracao(double primeiro, double segundo) {
		System.out.print("Digite o primeiro número: ");
		primeiro = Double.parseDouble(valores.nextLine());
		System.out.print("Digite o segundo número: ");
		segundo = Double.parseDouble(valores.nextLine());
		System.out.println("O resultado é: " + (primeiro - segundo));
	}

	public void divisao(double primeiro, double segundo) {
		System.out.print("Digite o primeiro número: ");
		primeiro = Double.parseDouble(valores.nextLine());
		System.out.print("Digite o segundo número: ");
		segundo = Double.parseDouble(valores.nextLine());
		System.out.println("O resultado é: " + (primeiro / segundo));
	}

	public void multiplicacao(double primeiro, double segundo) {
		System.out.print("Digite o primeiro número: ");
		primeiro = Double.parseDouble(valores.nextLine());
		System.out.print("Digite o segundo número: ");
		segundo = Double.parseDouble(valores.nextLine());
		System.out.println("O resultado é: " + (primeiro * segundo));
	}

	public void raizquadrada(double numero) {
		System.out.print("Digite um número: ");
		numero = Double.parseDouble(valores.nextLine());
		System.out.println("A raiz quadrado do valor:  " + Math.sqrt(numero));
	}

	public void resto(double primeiro, double segundo) {
		System.out.print("Digite o primeiro número: ");
		primeiro = Double.parseDouble(valores.nextLine());
		System.out.print("Digite o segundo número: ");
		segundo = Double.parseDouble(valores.nextLine());
		System.out.println("O resto da divisão é: " + (primeiro % segundo));
	}

	public void quadrado(double numero) {
		System.out.print("Digite um número: ");
		numero = Double.parseDouble(valores.nextLine());
		System.out.println("O resto da divisão é: " + (Math.pow(numero, 2)));
	}

	public void modulo(double numero) {
		System.out.print("Digite um número: ");
		numero = Double.parseDouble(valores.nextLine());
		if (numero > 0) {
			System.out.println("O módulo do valor: " + numero);
		} else {
			System.out.println("O módulo do valor: " + (numero * -1));
		}
	}
}
