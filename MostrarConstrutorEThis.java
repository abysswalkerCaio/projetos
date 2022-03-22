package projetos;

public class MostrarConstrutorEThis {

	public static void main(String[] args) {
		UsarConstrutorEThis caio = new UsarConstrutorEThis("Leone", "Feminino", 20, 1.70);
		UsarConstrutorEThis leone = new UsarConstrutorEThis("Caio", "Masculino", 17, 1.65);

		System.out.println(caio.nome);
		System.out.println(caio.genero);
		System.out.println(caio.idade);
		System.out.println(caio.altura + "\n");

		System.out.println(leone.nome);
		System.out.println(leone.genero);
		System.out.println(leone.idade);
		System.out.println(leone.altura);
	}
}
