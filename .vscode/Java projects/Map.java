import java.util.Random;
import java.util.Scanner;

public class Map {

	String direction;
	
	
	private int X = 10;
	private int Y = 10;
	int currentX;
	int currentY;
	
	public void playerStart() {
		
		int min = 1;
		int max = 11;

		Random random = new Random();
		
		currentX = random.nextInt(max + min);
		currentY = random.nextInt(max + min);
	}
		
		
	public void Map1(int X, int Y, int currentX, int currentY) {
		this.currentX = currentX;
		this.currentY = currentY;
		this.X = X;
		this.Y = Y;
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
	
	
	
	public void move() {
		
		
		if (direction.equals("N")){
			if (this.currentX == this.X) {
				this.currentX = 0;
			}else {
				this.currentX = this.currentX + 1;
				System.out.println("Your new position is " + currentX + " by " + currentY);
			}
			
		}else if (direction.equals("S")){
			if (this.currentX == this.X) {
				this.currentX = 0;
			}else {
				this.currentX = this.currentX - 1;
				System.out.println("Your new position is " + currentX + " by " + currentY);
			}
			
		}else if (direction.equals("E")){
			if (this.currentY == this.Y) {
				this.currentY = 0;
			}else {
				this.currentY = this.currentY + 1;
				System.out.println("Your new position is " + currentX + " by " + currentY);
			}
			
		}else if (direction.equals("W")){
			if (this.currentY == this.Y) {
					this.currentY = 0;
			}else {
				this.currentY = this.currentY - 1;
				System.out.println("Your new position is " + currentX + " by " + currentY);
			}
			
		}
	
	}
	public void movement() { 
		
		while (this.currentY != 5 || this.currentX != 5) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Where would you like to travel: N, E, S or W?");
			String inputValue = sc.nextLine();
			direction = inputValue;
			move();
			if (this.currentY == 5 && this.currentX == 5) {
				System.out.println("You have found the exit!");
			}else {
				movement();
			}
			
		}
		
	}
	
}

