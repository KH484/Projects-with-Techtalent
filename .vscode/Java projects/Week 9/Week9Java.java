import java.util.Scanner;

public class Week9Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Multiplication = new Scanner(System.in);
	    String Number;
	    
	    System.out.println("What number would you like for the times table? : "); 
	    Number = Multiplication.nextLine();   
	    
	    int Answer = Integer.parseInt(Number); 
	    
	    
	    
	    for (int i = 0; i < Answer*13; i+= Answer) {
	    	System.out.println(i);
	    }
	   
	}

}
