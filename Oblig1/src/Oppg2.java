import java.util.Scanner;

public class Oppg2 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int poeng = 0;
		int elever = 10;
		
		
		System.out.println("Skriv inn poengsum for elevene ");
		
		
		for (int i=0; i<elever; i++) {
			
			poeng = input.nextInt();
		{
			
		
		if(poeng>0 && poeng<40) {
			System.out.println("Poengene tilsvarer karakteren F.");
		}
		else if (poeng<50 && poeng>=40) {
			System.out.println("Poengene tilsvarer karakteren E.");
		}
		else if (poeng<60 && poeng>=50) {
			System.out.println("Poengene tilsvarer karakteren D.");
		}
		else if (poeng<80 && poeng>=60) {
			System.out.println("Poengene tilsvarer karakteren C.");
		}
		else if (poeng<90 && poeng>=80) {
			System.out.println("Poengene tilsvarer karakteren B.");
		}
		else if (poeng<=100 && poeng>=90) {
			System.out.println("Poengene tilsvarer karakteren A.");
		}
		else
		{
			System.out.println("Ugyldig poengsum. skriv inn poengsum på nytt: ");
			i--;
		}
	}
		
  }

		
 }

	}


