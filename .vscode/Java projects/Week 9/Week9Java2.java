import java.util.Scanner;

public class Week9Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Asking for two string user inputs
		
	    Scanner timesTable = new Scanner(System.in);

	    System.out.println("What two numbers would you like for the times table? : ");
	    String Number1 = timesTable.nextLine();
	    
	    String[] Number2 = Number1.split(" ");
	    
	    
	    //Changing the string inputs to integers
	    
	    int Answer1 = Integer.parseInt(Number2[0]);  
	    int Answer2 = Integer.parseInt(Number2[1]); 
	    
	    //loop to do the times table.  
	    
	    for (int i = 0; i < Answer1*Answer2+1; i+= Answer1) {
	    	System.out.println(i);
	    	
	    	/*STRETCH CHALLENGE: Change the program so that the user enters both values from the previous stretch

	    	challenge in one input. You will need to use .nextLine() instead of .nextInt(), a .split() on the inputted values, and

	    	you will need to cast the strings into numerical values too.*/
	    }
	   
	}

}
