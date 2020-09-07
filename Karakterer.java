import static javax.swing.JOptionPane.*;

public class Karakterer {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 9; i++) {
			int poeng = Integer .parseInt(showInputDialog("Tast inn poengsum"));
			char  karakter = ' '; 
		if (poeng >= 90 && poeng <= 100) {
			karakter ='A';
			showMessageDialog(null, "Eleven fikk karakteren: " + karakter);
		}
		else if (poeng >= 80 && poeng <= 89) {
			karakter ='B';
			showMessageDialog(null, "Eleven fikk karakteren: " + karakter);
		}
		else if (poeng >= 60 && poeng <= 79) {
			karakter ='C';
			showMessageDialog(null, "Eleven fikk karakteren: " + karakter);
		}
		else if (poeng >= 50 && poeng <= 59) {
			karakter ='D';
			showMessageDialog(null, "Eleven fikk karakteren: " + karakter);
		
		}
		else if (poeng >= 40 && poeng <= 49) {
			karakter ='E';
			showMessageDialog(null, "Elven fikk karakteren: " + karakter);
		}
		else if (poeng >= 0 && poeng <= 39 ) {
			karakter ='F';
			showMessageDialog(null, "Eleven fikk karakteren: " + karakter);
		
		}
		else if (poeng >= 100 || poeng < 0) {
			if (i > 0) {
				i--; 
			}
			showMessageDialog(null, "Ugyldig poengsum");
			
				
			}
			karakter = 0;
			
	}}

	
}

