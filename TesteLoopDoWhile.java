package projetos;

public class TesteLoopDoWhile {
	public static void main(String[] args) {
		int numero = 10;

		do {
			System.out.println("Número: " + numero);
			numero--;
		} while (numero >= 0);
		
		/* Loop do-while infinito:
		do {
			System.out.println("Número: " + numero);
		} while (numero >= 0);
		*/
	}
}
