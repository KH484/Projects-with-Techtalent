
public class Week9JavaPt56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//making space
		
		String Star  = "     ";
		String Star1 = "    ";
		String Star2 = "   ";
		String Star3 = "  ";
		String Star4 = " ";
		String Star5 = "";
		
		//making star symbols 
		
		String starLight;	
		String Starry  = "1";
		String Starry1 = "212";
		String Starry2 = "32123";
		String Starry3 = "4321234";
		String Starry4 = "543212345";
		String Starry5 = "65432123456";
		
		
		// loops to add each new line with it's corresponding space
		
		for (int i=0; i<6; i++) {
			starLight = Star += Starry;

			System.out.println(starLight);
			
			for (int j=0; j<1; j++) {
				starLight = Star1 += Starry1;

				System.out.println(starLight);
				
				for (int k=0; k<1; k++) {
					starLight = Star2 += Starry2;

					System.out.println(starLight);
					
					for (int l=0; l<1; l++) {
						starLight = Star3 += Starry3;

						System.out.println(starLight);
						
						for (int n=0; n<1; n++) {
							starLight = Star4 += Starry4;

							System.out.println(starLight);
							
							for (int o=0; o<1; o++) {
								starLight = Star5 += Starry5;

								System.out.println(starLight);
						
							}
						}
					}
				}
			}
		}
	}
}









		


		














		
	



