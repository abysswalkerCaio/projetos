package projetos;

import java.util.Scanner;

public class SomaLoopWhile {

	Scanner valores = new Scanner(System.in);

	public static void main(String[] args) {
		SomaLoopWhile instanciar = new SomaLoopWhile();
		instanciar.adicao(0, 0);
		instanciar.subtracao(0, 0);
		instanciar.divisao(0, 0);
		instanciar.multiplicacao(0, 0);
	}

	public void adicao(int adicao, int resultado) {
		System.out.print(
				"Insira um valor para adição;" + "\n" + "Insira o valor -505 para finalizar o método do adição: ");
		adicao = Integer.parseInt(valores.nextLine());
		while (adicao != -505) {
			resultado += adicao;
			System.out.print("Insira outro valor: ");
			adicao = Integer.parseInt(valores.nextLine());
		}
		System.out.println("O resultado da adição: " + resultado);
		System.out.println("Saindo do modo de adição..." + "\n");
	}

	public void subtracao(int subtracao, int resultado) {
		System.out.print("Insira um valor para ser subtraído: ");
		resultado = Integer.parseInt(valores.nextLine());
		System.out.print("Insira um valor para subtração: ");
		subtracao = Integer.parseInt(valores.nextLine());
		while (subtracao != -505) {
			resultado -= subtracao;
			System.out.print("Insira outro valor: ");
			subtracao = Integer.parseInt(valores.nextLine());
		}
		System.out.println("O resultado da subtração: " + resultado);
		System.out.println("Saindo do modo de subtração..." + "\n");
	}

	public void divisao(int divisao, int resultado) {
		System.out.print("Insira um valor para ser divido: ");
		resultado = Integer.parseInt(valores.nextLine());
		System.out.print("Insira um valor para divisão: ");
		divisao = Integer.parseInt(valores.nextLine());
		while (divisao != -505) {
			resultado /= divisao;
			System.out.print("Insira outro valor: ");
			divisao = Integer.parseInt(valores.nextLine());
		}
		System.out.println("O resultado da divisão: " + resultado);
		System.out.println("Saindo do modo de divisao..." + "\n");
	}

	public void multiplicacao(int multiplicacao, int resultado) {
		System.out.print("Insira um valor para ser multiplicado: ");
		resultado = Integer.parseInt(valores.nextLine());
		System.out.print("Insira um valor para multiplicação: ");
		multiplicacao = Integer.parseInt(valores.nextLine());
		while (multiplicacao != -505) {
			resultado *= multiplicacao;
			System.out.print("Insira outro valor: ");
			multiplicacao = Integer.parseInt(valores.nextLine());
		}
		System.out.println("O resultado da mulitplicação: " + resultado);
		System.out.println("Finalizando programa...");
	}
}
