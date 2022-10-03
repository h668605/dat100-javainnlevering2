
package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
			if (tabell.length - 1 != i) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		System.out.println("");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String svar = "[";
		for (int i = 0; i < tabell.length; i++) {
			svar = svar + (tabell[i]);
			if (tabell.length - 1 != i) {
				svar = svar + (",");
			}
		}
		svar = svar + "]";
		return svar;
	}

	//  c)
	public static int summer(int[] tabell) {
		/* int sum = 0;
		for (int i = 0;i<tabell.length;i++) {
			sum += tabell[i];
		}
		return sum;
	} */
		
		/*int sum = 0;
		int counter = 0;
		while (counter != tabell.length) {
			sum += tabell[counter];
			counter++;
		}
		return sum;
	} */
		
		int sum = 0;
		for (int element : tabell) {
			sum += element;
		}
		return sum;
	}
		
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean svar = false;
		int teller = 0;
		while (!svar && teller < tabell.length) {
			if (tabell[teller] == tall) {
				svar = true;
			}
			teller++;
		}
		return svar;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int svar = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				svar = i;
			}
		}
		return svar;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int [] reversTabell = new int[tabell.length];
		
		for (int i = 0; i < tabell.length; i++) {
			reversTabell[i] = tabell[tabell.length-1-i];
			}
		
		return reversTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean svar = true;
		int teller = 0;
		if (tabell.length > 1) {
			while (svar && teller < tabell.length-1) {
				if (tabell[teller] > tabell[teller + 1]) {
					svar = false;
				}
				teller++;
			}
		}
		return svar;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int [] nytabell = new int [tabell1.length + tabell2.length];
		for(int i = 0; i<tabell1.length;i++) {
			nytabell[i] = tabell1[i];
		}
		for(int i = 0; i<tabell2.length;i++) {
			nytabell[i+tabell1.length] = tabell2[i];
	}
		return nytabell;
}
}