package testes;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;

public class TesteArrayList {
	public static void main (String [] args) {
        ArrayList<Integer> numerosList = new ArrayList<Integer>();
		numerosList.add(1);
		numerosList.add(2);
		numerosList.add(3);
		numerosList.add(4);
		numerosList.add(5);
		
		Iterator<Integer> lerIterator = numerosList.iterator();
		while (lerIterator.hasNext()) {
			System.out.print(lerIterator.next() + " ");
		}
		
		System.out.println("\n");
		
		ListIterator<Integer> lerListIterator = numerosList.listIterator();
		while (lerListIterator.hasNext()) {
			System.out.print(lerListIterator.next() + " ");
		}
		
		System.out.println("\n");
		
		while (lerListIterator.hasPrevious()) {
			System.out.print(lerListIterator.previous() + " ");
		}
	}
}
