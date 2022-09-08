package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
    //calls the scanner
	Scanner in = new Scanner(System.in);
	
	//creates n1 ,,, tells it that the input will be scanned
	//prompts the user to input n1
	
	System.out.println("Input value n1: ");
	int n1 = in.nextInt(); 
	
	//creates n2
	//prompts user to input2
	
	System.out.println("Input value n2");
	int n2 = in.nextInt();
	
	//generate average
	//cast double to the average
	
	double average = (double)(n1  + n2)/2;
	
	//print average
	System.out.println("Average of " + n1 + " and " + n2 + " is " + average);
	}
}	
