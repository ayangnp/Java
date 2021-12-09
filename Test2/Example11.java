package Test2;
import java.util.Scanner;
public class Example11 {
	public static void main (String [] args)
	{
		int number=17, guess;
		Scanner sc =new Scanner (System.in);
		System.out.print("你猜测的数：");
		guess = sc.nextInt();
		while (guess!=number)
		{
			if (guess > number);
			    System.out.println("大了！");
			if (guess < number)
				System.out.println("小了!");
			System.out.print("你猜测的数");
			guess=sc.nextInt();
			
		}
		System.out.println("恭喜你，猜对了");
		
	}

}
