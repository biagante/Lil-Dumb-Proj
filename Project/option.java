import java.util.*;

public class option {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		while(true)
		{
				System.out.println("your dreams are incompatible with reality");
				System.out.println("Choose one option: ");
				System.out.println("1 - force things");
				System.out.println("2 - accept reality");
				System.out.println("3 - kill myself");
				System.out.print("Option -> ");
				int a = sc.nextInt();
			
				if (a < 1 || a > 3)
				{
					System.out.println("I said one option. Try again");
					continue;
				}
				
				if (a == 1)
				{
					System.out.println("Do you really wanna go that way?");
					System.out.println("1 - yes, 2 - no");
					System.out.print("Option -> ");
					int b = sc.nextInt();
					if (b < 1 || b > 2)
					{
						System.out.println("Again, I said one option. Try again");
						continue;
					}
					
					if (b == 1)
					{
						System.out.println("No can do");
						System.exit(0);
					}
					else
					{
						System.out.println("Reconsider it then");
						continue;
					}
				}
				
				if (a == 2)
				{
					System.out.println("If you agree with this, you can't go back");
					System.out.println("1 - yes, 2 - no");
					System.out.print("Option -> ");
					int b = sc.nextInt();
					if (b < 1 || b > 2)
					{
						System.out.println("Again, I said one option. Try again");
						continue;
					}
					
					if (b == 1)
					{
						System.out.println("Error 500: Connection lost");
						System.exit(0);
					}
					else
					{
						System.out.println("Good. Choose something else.");
						continue;
					}
				}
				
				if (a == 3)
				{
					System.out.println("Letś do it! Suicide Pact!!!!!");
					System.exit(0);
						
				}
		}
	}
}		

