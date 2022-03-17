package projetos;

import java.util.Random;

public class gerarNumeroAleatorio {
	public void createRandomNumber(int qualquernumero, int demonstracao) {
		Random gerar = new Random();
		qualquernumero = gerar.nextInt(1, 51); //Começa de 1, vai até 50.
		/* Outra forma de se utilizar a classe Random:
		 * gerar.nextInt(50) + 1;
		 */
		System.out.println(demonstracao + " - Um número aleatório de 1 até 50: " + qualquernumero);
	}
}
