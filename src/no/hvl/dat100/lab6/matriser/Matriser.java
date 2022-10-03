
package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[]liste:matrise) {
			System.out.println("");
			for(int tall:liste) {
				System.out.print(tall);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String svar = ("");
		for(int []liste:matrise) {
			for(int tall:liste) {
				svar += tall;
				svar += " ";
			}
			svar += "\n";
		}
		return svar;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int [][] nyTabell = new int[matrise.length][matrise[0].length];
		
		for(int i = 0;i<matrise.length;i++) {
			for(int j = 0;j<matrise[i].length;j++) {
				nyTabell[i][j] = tall*(matrise[i][j]);
			}
		}
		return nyTabell;
	}
	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean svar = true;
		int teller = 0;
		
		if(a.length != b.length) {
			svar = false;
		}
		while(svar && teller<a.length) {
			for(int i = 0;i<a[teller].length;i++) {
				if(a[teller][i]!=b[teller][i]) {
					svar = false;
				}
			}
			teller++;
		}
		return svar;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int [][]speiletTabell = new int [matrise.length][matrise.length];
		
		for(int i = 0;i<matrise.length;i++) {
			
			for(int j = 0;j<matrise[i].length;j++) {
				speiletTabell[i][j] = matrise[j][i];
			}
		}
		return speiletTabell;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] multiplisertTabell = new int[a.length][b.length];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < b[0].length; k++) {
					sum += a[i][k] * b[k][j];
				}
				multiplisertTabell[i][j] = sum;
				sum = 0;
			}
		}
		return multiplisertTabell;
	}
}
