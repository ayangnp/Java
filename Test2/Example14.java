package Test2;

public class Example14 {
	public static void main (String [] args)
	{
		int i=1,n=0;
		while (i<100)
		{
			if (i%3==0)
			{
				System.out.println(i);
				n++;
				
			}
			if (n==5)
				break;
			i++;
		}
	}

}
