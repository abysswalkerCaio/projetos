package projetos;

import java.util.Scanner;

public class Cell {
	private String name;
	private boolean isOpen;
	private int cellCode;
	Scanner leitura = new Scanner(System.in);

	// Constructor;
	public Cell(String name, boolean isOpen, int cellCode) {
		/*
		 * name = "A1"; isOpen = false; cellCode = 1234;
		 */
		this.name = name;
		this.isOpen = isOpen;
		this.cellCode = cellCode;
	}

	/*
	 * public void openDoor(String name, boolean isOpen) { this.name = name;
	 * this.isOpen = isOpen; }
	 */

	/*
	 * public void displayCell(boolean b) { System.out.println("Cell: " + name);
	 * System.out.println("Is open? " + isOpen); }
	 */

	public String getName() {
		return this.name;
	}

	public boolean getIsOpen() {
		return this.isOpen;
	}

	public void setIsOpen(int cellCode, boolean IsOpen) {
		System.out.print("Put the code int here: ");
		cellCode = leitura.nextInt();
		if (cellCode != this.cellCode) {
			System.out.println("Invalid code!" + "\n");
		} else {
			if (this.isOpen == false) {
				isOpen = true;
				System.out.println("Cell open!");
				System.out.println("Cell status: " + isOpen + " or Open" + "\n");
			} else {
				isOpen = false;
				System.out.println("Cell closed!");
				System.out.println("Cell status: " + isOpen + " or Closed" + "\n");
			}
		}
	}
}
