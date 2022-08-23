import java.util.Scanner;

public class Week9JavaPt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //setting minimum and maximum
		
		  int min = 0;
	      int max = 100;
	        
	      //Generate random integer value from 0 to 100 
	      
	      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

	      int i;
	      
	      //for loop using the max value as the condition
	      
	      for (i=0; i<max; i++) {
	    	  
	    	//taking input from the user
	    	  
	  	    Scanner timesTable = new Scanner(System.in);

		    System.out.println("What number would you like to guess? : ");
		    
		    String Number1 = timesTable.nextLine();
		    
		    //Changing the string input to an integer
		    
		    int Answer1 = Integer.parseInt(Number1);  
		    
			  
		    //if statement to check user input against the random number generated.
		    
			if (Answer1 > random_int) {
				  System.out.println("Your guess is too high");
				  
	      	}else if (Answer1 < random_int) {
				  System.out.println("Your guess is too low");
			
			}else {
				System.out.println("You've guessed correctly!");
				break;
			}
				    
	      }
	}
}

		  
		  
		  
	      
	      
	      

