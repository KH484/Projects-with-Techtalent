
public class Week9JavaPt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
	    int Num1 = 0;
	    int Num2 = 1;
	    int Num3;
	    int Fib = 0;
	    
	    while (Fib < 10) {
	    	
	    	Num3 = Num1 + Num2;
            Num1 = Num2;  //increasing the number each time
            Num2 = Num3;  //increasing the number each time
            Fib+=1; //add 1 to the iterator so that it stops at 1 million times
 
	      System.out.println(Num1);  //print Num1 variable each time 
		}
	   
	}
}

	
		
		
		
		
	



