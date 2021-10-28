import java.util.Scanner;
public class Nim{
	public static void main(String[] args){
		System.out.println("***************");
		System.out.println("*NIMATRON 1000*");
		System.out.println("***************");
		System.out.println();
		System.out.println("Nim Misere:");
		System.out.println("There are 10 rocks in the pile, you can take 1 or 2 rocks, try to beat the computer.");
		System.out.println("You start. The person who takes the last rock loses");
		System.out.println();
		Scanner in = new Scanner(System.in);
		int total = 10;
		int move = 1;
		int round = 0;

		while(total >= 0){
			System.out.println();
			System.out.println("********************************");
			round++;
			System.out.println("Round " + round + "\n");
			System.out.print("Enter 1 or 2: ");
			int i = in.nextInt();
			while(i > 2){
				System.out.println("Please enter either a 1 or 2");
				i = in.nextInt();
			}
			total -= i;
			if(total == 0){
				System.out.println("You lost");
				return;
			}
			System.out.println("Rocks left: " + total);
			move = 3 - i;	
			total -= move;
			System.out.println();
			System.out.println("Computers turn, it takes: " + move);
			System.out.println("Rocks left: " + total);
		}
	}
}
