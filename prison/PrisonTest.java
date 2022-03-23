package projetos;

public class PrisonTest {
	public static void main(String[] args) {
		Cell firstCell = new Cell("A1", true, 1234);
		Cell secondCell = new Cell("A2", false, 5678);
		Cell thirdCell = new Cell("A3", true, 9012);
		Cell fourthCell = new Cell("A4", false, 3456);

		Prisoner bubba = new Prisoner("Bubba", 2.08, 4, firstCell);
		System.out.println("Total prisoners with getter method instead: " + Prisoner.getPrisonerCount());
		Prisoner.displayPrisonerCount();
		bubba.display(true);
		firstCell.setIsOpen(0, false);

		Prisoner caio = new Prisoner("Caio", 1.65, 5, secondCell);
		System.out.println("Total prisoners with getter method instead: " + Prisoner.getPrisonerCount());
		Prisoner.displayPrisonerCount();
		caio.display(true);
		secondCell.setIsOpen(0, false);

		Prisoner sif = new Prisoner("Sif", 3.0, 6, thirdCell);
		System.out.println("Total prisoners with getter method instead: " + Prisoner.getPrisonerCount());
		Prisoner.displayPrisonerCount();
		sif.display(true);
		thirdCell.setIsOpen(0, false);

		Prisoner leone = new Prisoner("Leone", 1.70, 7, fourthCell);
		System.out.println("Total prisoners with getter method instead: " + Prisoner.getPrisonerCount());
		Prisoner.displayPrisonerCount();
		leone.display(true);
		fourthCell.setIsOpen(0, false);

		/*
		 * System.out.println("Name: " + bubba.getName()); System.out.println("Height: "
		 * + bubba.getHeight()); System.out.println("Sentence: " + bubba.getSentence());
		 * 
		 * System.out.println("Cell: " + firstCell.getName());
		 * System.out.println("Is Open? " + firstCell.getIsOpen());
		 */
	}
}
