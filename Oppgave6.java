import static javax.swing.JOptionPane.*;
public class Oppgave6 {

	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("Skriv eit heltall som er over 0:"));
		int svar = 1;
		
		if (n>0) {
			for (int i = 1; i<= n; i++) {
				svar = svar * i; 	
			}
			
			showMessageDialog(null, svar);
		}
		
		else {
            showMessageDialog(null, "Tallet du tastet inn kan ikke være negativt.");
        }
		
	}
	
}
	


