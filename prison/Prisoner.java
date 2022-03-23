package projetos;

public class Prisoner {
	private String name;
	private double height;
	private int sentence;
	private Cell cell;
	private static int prisonerCount = 0;

	// Constructor;
	public Prisoner(String name, double height, int sentence, Cell cell) {
		/*
		 * name = "Bubba"; height = 2.08; sentence = 4;
		 */
		this.name = name;
		this.height = height;
		this.sentence = sentence;
		this.cell = cell;
		
		Prisoner.prisonerCount++;
	}

	public void display(boolean b) {
		System.out.println("Name: " + name);
		System.out.println("Height: " + height);
		System.out.println("Sentence: " + sentence);
		System.out.println("Cell: " + getCell().getName());
		if (getCell().getIsOpen() == false) {
			System.out.println("Is Open? " + getCell().getIsOpen() + " or No");
		} else {
			System.out.println("Is Open? " + getCell().getIsOpen() + " or Yes");
		}
	}
	
	public static void displayPrisonerCount() {
		System.out.println("Total prisoners: " + prisonerCount);
	}

	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return this.height;
	}

	public int getSentence() {
		return this.sentence;
	}

	public Cell getCell() {
		return this.cell;
	}

	public Cell getIsOpen() {
		return this.cell;
	}
	
	public static int getPrisonerCount() {
		return Prisoner.prisonerCount;
	}
}
