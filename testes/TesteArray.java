package projetos;

public class TesteArray {
	public static void main(String[] args) {
		/*
		 * Declarando um Array do tipo int com 5 índices de 0 até 4: int[] numeros = new
		 * int[5];
		 */
		int[] numeros = { 1, 2, 3, 4, 5 };

		System.out.println("Valores dentro de cada índice: " + numeros[0] + " -> [0], " + numeros[1] + " -> [1], "
				+ numeros[2] + " -> [2], " + numeros[3] + " -> [3], " + numeros[4] + " -> [4].");

		// Usando for each para leitura dos valores do Array;
		System.out.print("Valores dentro de cada índice utilizando for each para leitura: ");
		for (int mostrarNumeros : numeros) {
			System.out.print(mostrarNumeros + " ");
		}
	}
}
