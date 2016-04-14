package oblig4;

import java.util.Scanner;

public class Oppgave2{	
	static int teller=0;
	static int metodekall = 0;

	public static void main(String[] args) {			

	    Scanner input = new Scanner(System.in);
	    System.out.print("Skriv antall disker: ");
	    int n = input.nextInt();  
	    
	    System.out.println("Flytning:");
	    flytDisk(n, 'A', 'B', 'C');
	    
	    System.out.println("Total antall flyttinger : " + teller);
	    System.out.println("Metode ble kalt " + metodekall + " ganger");
		    
	    input.close();
	}
	
	public static void flytDisk(int n, char fraTarn, char tilTarn, char hjelpTarn) {
		metodekall++;
	    if (n == 1){ // Stopping condition
	    	teller++;	    	
	    	System.out.println("Flyt disk " + n + " fra " + fraTarn + " til " + tilTarn);
	    	
	    }	    
	    else {
	    	flytDisk(n - 1, fraTarn, hjelpTarn, tilTarn);
	    	System.out.println("Flyt disk " + n + " fra " + fraTarn + " til " + tilTarn);
	    	flytDisk(n - 1, hjelpTarn, tilTarn, fraTarn);
	    	teller++;
	    }
	 }
}
