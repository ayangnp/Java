package Test2;
import java.util.Scanner;
public class Example11 {
	public static void main (String [] args)
	{
		int number=17, guess;
		Scanner sc =new Scanner (System.in);
		System.out.print("��²������");
		guess = sc.nextInt();
		while (guess!=number)
		{
			if (guess > number);
			    System.out.println("���ˣ�");
			if (guess < number)
				System.out.println("С��!");
			System.out.print("��²����");
			guess=sc.nextInt();
			
		}
		System.out.println("��ϲ�㣬�¶���");
		
	}

}
