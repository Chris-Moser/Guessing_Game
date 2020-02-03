import java.util.Scanner;

public class Oldngg
	{

		public static void main(String[] args)
			{
//				Scanner userStringInput1 = new Scanner(System.in);
//				System.out.println("What is your name?");
//				String name1 = userStringInput1.nextLine();
//				System.out.println("hello " + name1);

				int secretNumber = +1;
				// int secretNumber = 3;

				
					{

						Scanner userIntInput = new Scanner(System.in);
						System.out.println("Guess a number from one to five");
						int guess = userIntInput.nextInt();
						boolean stillGuessing = true;
						while (stillGuessing)
						if (guess == secretNumber)
							{
								System.out.println("Y0U GOT IT");
								stillGuessing = false;
							}
						else if (guess < secretNumber)
							{
							
								System.out.println(secretNumber+1);
							}
						else if (guess > secretNumber)
							{
								System.out.println("TO HIGH");
							}

					}
			}
	}
