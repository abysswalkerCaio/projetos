package projetos;

import java.util.Scanner;

public class Calculadora {

	Scanner valores = new Scanner(System.in);
	double numero, primeiro, segundo, resultado;
	String operacao;

	public static void main(String[] args) {
		Calculadora instanciar = new Calculadora();
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
			instanciar.adicao();
			break;
		case "Subtração":
			instanciar.subtracao();
			break;
		case "Divisão":
			instanciar.divisao();
			break;
		case "Multiplicação":
			instanciar.multiplicacao();
			break;
		case "Raiz Quadrada":
			instanciar.raizquadrada();
			break;
		case "Resto":
			instanciar.resto();
			break;
		case "Quadrado":
			instanciar.quadrado();
			break;
		case "Módulo":
			instanciar.modulo();
			break;
		default:
			System.out.println("Uma operação inválida foi requesitada, finalizando programa...");
			System.exit(0);
		}
		instanciar.valores.close();
		System.out.println("Obrigado por utilizar!");
	}

	public void adicao() {
		System.out.print("Digite o primeiro número: ");
		primeiro = Double.parseDouble(valores.nextLine());
		System.out.print("Digite o segundo número: ");
		segundo = Double.parseDouble(valores.nextLine());
		resultado = primeiro + segundo;
		System.out.println("O resultado é: " + resultado);
	}

	public void subtracao() {
		System.out.print("Digite o primeiro número: ");
		primeiro = Double.parseDouble(valores.nextLine());
		System.out.print("Digite o segundo número: ");
		segundo = Double.parseDouble(valores.nextLine());
		resultado = primeiro - segundo;
		valores.close();
		System.out.println("O resultado é: " + resultado);
	}

	public void divisao() {
		System.out.print("Digite o primeiro número: ");
		primeiro = Double.parseDouble(valores.nextLine());
		System.out.print("Digite o segundo número: ");
		segundo = Double.parseDouble(valores.nextLine());
		resultado = primeiro / segundo;
		System.out.println("O resultado é: " + resultado);
	}

	public void multiplicacao() {
		System.out.print("Digite o primeiro número: ");
		primeiro = Double.parseDouble(valores.nextLine());
		System.out.print("Digite o segundo número: ");
		segundo = Double.parseDouble(valores.nextLine());
		resultado = primeiro * segundo;
		valores.close();
		System.out.println("O resultado é: " + resultado);
	}

	public void raizquadrada() {
		System.out.print("Digite um numero: ");
		numero = Double.parseDouble(valores.nextLine());
		resultado = Math.sqrt(numero);
		System.out.print("A raiz quadrado do valor:  " + resultado);
	}

	public void resto() {
		System.out.print("Digite o primeiro número: ");
		primeiro = Double.parseDouble(valores.nextLine());
		System.out.print("Digite o segundo número: ");
		segundo = Double.parseDouble(valores.nextLine());
		resultado = primeiro % segundo;
		System.out.println("O resto da divisão é: " + resultado);
	}

	public void quadrado() {
		System.out.print("Digite um número: ");
		numero = Double.parseDouble(valores.nextLine());
		resultado = Math.pow(numero, 2);
		System.out.println("O resto da divisão é: " + resultado);
	}

	public void modulo() {
		System.out.print("Digite um número: ");
		numero = Double.parseDouble(valores.nextLine());
		if (numero > 0) {
			System.out.println("O módulo do valor: " + numero);
		} else {
			resultado = numero * -1;
			System.out.println("O módulo do valor: " + resultado);
		}
	}
}
