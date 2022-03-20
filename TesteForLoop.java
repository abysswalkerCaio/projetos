package projetos;

public class TesteForLoop {
	public static void main(String[] args) {
		System.out.println("Loop repetido duas vezes:" + "\n");

		for (int w = 0; w <= 10; w++) {
			System.out.print(w + " ");
			if (w == 10) {
				System.out.println("\n");
				for (int w2 = 0; w2 <= 10; w2++) {
					System.out.print(w2 + " ");
				}
			}
		}
		
        System.out.println("\n");
		System.out.println("Loop ao contrário:" + '\n');

		for (int x = 10; x >= 0; x--) {
			System.out.print(x + " ");
		}
		
		System.out.println("\n");
		System.out.println("Contando pares de 0 até 10:" + '\n');
		
		for (int y = 0; y <= 10 ; y+= 2) {
			System.out.print(y + " ");
		}
		
		System.out.println("\n");
		System.out.println("Contando ímpares de 0 até 10:" + '\n');
		
		for (int z = 1; z <= 9 ; z+= 2) {
			System.out.print(z + " ");
		}
		
		/*
		System.out.println("\n");
		System.out.println("Loop infinito: " + '\n');
		
		for (;;) {
			System.out.print("Infinidade!");
		}
		*/
		
		System.out.println("\n");
		System.out.println("Duas instruções em um único loop:" + '\n');
		
		for (int duas = 0; duas < 6 ; duas++) {
			System.out.print(duas + " ");
			System.out.println("Caio!");
		}
	}
}
