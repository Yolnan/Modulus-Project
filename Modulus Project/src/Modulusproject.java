import java.util.Scanner;
import java.util.Random;
public class Modulusproject
	{

		public static void main(String[] args)
			{
				int x;
				int y;
				int Qnum;
				int MyAns;
				int UserAns;
				int count = 0;
				int correctNum = 0;
				Scanner input = new Scanner(System.in);
				Random num = new Random();
				
				//Ask for number of questions				
				while(true) {
					System.out.println("How many modulus questions to do you want to solve? (minimum of 3 questions)");
					Qnum = input.nextInt();
					if (Qnum >= 3) {
						break;
					} else {
						System.out.println("You must answer a minimum of 3 questions");
					}
				}
				while(true) {
					//Generate Question y%x 
					x = num.nextInt(10) + 1;
					y = num.nextInt(1000)+ 11;
					MyAns = y%x;
					System.out.println("What is the answer to " + y + "%" + x + "?");
					UserAns = input.nextInt();
					
					//Check Answer y%x
					if(MyAns == UserAns) {
						System.out.println("Correct");
						correctNum++;
					} else {
						System.out.println("Incorrect.  Correct Answer = " + MyAns);
					}
					count++;
					if(count >= Qnum) {
						break;
					}
					
					//Generate Question x%y
					MyAns = x%y;
					System.out.println("What is the answer to " + x + "%" + y + "?");
					UserAns = input.nextInt();
					
					//Check Answer x%y
					if(MyAns == UserAns) {
						System.out.println("Correct");
						correctNum++;
					} else {
						System.out.println("Incorrect.  Correct Answer = " + MyAns);
					}
					count++;
					if(count >= Qnum) {
						break;
					}
					//Generate Question y%y
					MyAns = y%y;
					System.out.println("What is the answer to " + y + "%" + y + "?");
					UserAns = input.nextInt();
					
					//Check Answer y%y
					if(MyAns == UserAns) {
						System.out.println("Correct");
						correctNum++;
					} else {
						System.out.println("Incorrect.  Correct Answer = " + MyAns);
					}
					count++;
					if(count >= Qnum) {
						break;
					}
					System.out.println("Qnum = " + Qnum + " count = " + count);
				}
				//Score
				if(correctNum == 1) {
					System.out.println("You answered " + correctNum + " question correct out of " + Qnum);
				} else {
					System.out.println("You answered " + correctNum + " questions correct out of " + Qnum);
				}
			}
	}	
