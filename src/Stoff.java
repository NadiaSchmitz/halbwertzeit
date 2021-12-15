// Aufgabe 30 java_3

import java.text.DecimalFormat;

public class Stoff {

	public static void main(String[] args) {
		
		int halbwertzeit = 0, i, j = 0;
		double masse = 250, masse_anf = masse, masse_ab = 0.08;
		
		DecimalFormat df = new DecimalFormat("###");
		
		for (i = 0; i < 14; i++) {
			
			masse = masse - masse * masse_ab;
			
		}
		
		while (masse_anf >= 125) {
			
			masse_anf = masse_anf - masse_anf * masse_ab;
			j++;
			halbwertzeit = j - 1;
		}
		
		System.out.println("Masse nach 14 Tage: " + df.format(masse) + "g");
		System.out.println("Die Halbwertzeit beträgt " + df.format(halbwertzeit) + " Tage");
		
	}

}
