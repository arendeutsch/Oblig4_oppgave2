package oblig4;

import java.util.Scanner;

public class Oppgave2{	

	public static void main(String[] args) {			

	    Scanner input = new Scanner(System.in);
	    System.out.print("Skriv antall disker: ");
	    int n = input.nextInt();  
	    
	    System.out.println("Flytning:");
	    flytDisk(n, 'A', 'B', 'C');
		    
	    input.close();
	}
	
	public static void flytDisk(int n, char fraTarn, char tilTarn, char hjelpTarn) {		
	    if (n == 1){ // Stopping condition

	    	System.out.println("Flyt disk " + n + " fra " + fraTarn + " til " + tilTarn);
	    	
	    }	    
	    else {
	    	flytDisk(n - 1, fraTarn, hjelpTarn, tilTarn);
	    	System.out.println("Flyt disk " + n + " fra " + fraTarn + " til " + tilTarn);
	    	flytDisk(n - 1, hjelpTarn, tilTarn, fraTarn);

	    }
	 }
}
