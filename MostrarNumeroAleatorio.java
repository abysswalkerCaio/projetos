package projetos;

public class MostrarNumeroAleatorio {
	public static void main(String[] args) {
		GerarNumeroAleatorio gerar = new GerarNumeroAleatorio();
		System.out.println("Serão gerados 5 cadeias de números aleatórios de 0 até 50!");
	        gerar.createRandomNumber(0, 1);
		gerar.createRandomNumber(0, 2);
		gerar.createRandomNumber(0, 3);
		gerar.createRandomNumber(0, 4);
		gerar.createRandomNumber(0, 5);
	}
}
