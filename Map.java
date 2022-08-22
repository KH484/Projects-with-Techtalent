
	
	import java.util.Random;
	import java.util.Scanner;

	public class Map {

		//variables set to private
		
		private int X = 10;  // map size
		private int Y = 10;
		
		private int currentX;  //current location
		private int currentY;
		
		private String direction;  

		public Map(int X, int Y, int currentX, int currentY) {
			
			this.currentX = currentX;
			this.currentY = currentY;
			
			this.X = X;
			this.Y = Y;
		}

		//public variables which can be used
		
		public int getCurrentX() {
			
			return currentX;
		}


		public void setCurrentX(int currentX) {
			
			this.currentX = currentX;
		}


		public int getCurrentY() {
			
			return currentY;
		}


		public void setCurrentY(int currentY) {
			
			this.currentY = currentY;
		}

		public int getX() {
			
			return X;
		}
		public void setX(int x) {
			
			X = x;
		}
		public int getY() {
			
			return Y;
		}
		public void setY(int y) {
			
			Y = y;
		}
		
		public String getDirection() {
			
			return direction;
		}

		public void setDirection(String direction) {
			
			this.direction = direction;
		}
		
		//setting the random start location for the player
		

		public void playerStart() {
			
			int min = 1;
			int max = 10;

			Random random = new Random();
			
			currentX = random.nextInt(max + min);  //random start location is now the current location
			currentY = random.nextInt(max + min);
		}
		
		//method to get the user to chose the direction
		
		public void chooseDirection() {
		
			Scanner sc = new Scanner(System.in); 
			
			System.out.println ("Your current location is " + currentX + " by " + currentY + "\n"    
					
				+ " In what direction would you like to travel? N, S, E, W?: ");

			String directionInput = sc.nextLine().toUpperCase();  //making sure user input changes to uppercase
			
			this.direction = directionInput;  //use the user input as the direction for the move method
			
			move();
			
		}
		
		
		
		//method to move the player
		
		public void move() {
			
			//if direction chosen by user == N 
			
			if (this.direction.equals("N")){
					
					if (this.currentX < this.X) { //bug fix can't go above 10
						
						this.currentX = this.currentX + 1; //move position X by 1
						
					} else {
						
						System.out.println("You cannot move outside of the map!");
				}
				
			//if direction chosen by user == S
				
			} else if (this.direction.equals("S")){
					
					if (this.currentX != 0) { //bug fix can't go below 0
						
						this.currentX = this.currentX - 1; //move position X by 1
						
					} else {
						
						System.out.println("You cannot move outside of the map!");
					
					}
			
			//if direction chosen by user == E
				
			} else if (this.direction.equals("E")){
					
					if (this.currentY < this.Y) { //bug fix can't go above 10
						
						this.currentY = this.currentY + 1; //move position Y by 1
						
					} else {
						
						System.out.println("You cannot move outside of the map!");
					
					}
				
			//if direction chosen by user == W
				
			} else if (this.direction.equals("W")){
					
					if (this.currentY != 0) { //bug fix can't go below 0
						
						this.currentY = this.currentY - 1; //move position Y by 1
						
					} else {
						
						System.out.println("You cannot move outside of the map!");
					
					}
				
			//bug fixing
				
			} else {
				
				System.out.println("Please enter a valid direection");
			}
		}
	}
