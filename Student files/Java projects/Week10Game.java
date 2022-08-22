public class Week10Game {

	public static void main(String[] args) {
		

		
		Character ramblingRosa = new Character ("Rambling Rosa",4, 1,"Thorns");
		Character explorerEric = new Character ("Explorer Eric",4, 1, "Punch");
		
		
		explorerEric.printDetails();
		
		//pick a specific character to play
		// location to have a battles / something to overcome? and lose points accordingly

		Map a = new Map ();
		a.Map1(0, 0, 0, 0);
		a.playerStart();
		a.movement();
        

	}

}