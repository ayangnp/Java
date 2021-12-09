package Test2;

public class Example15 {
	public static void main (String [] args)
	{
		int i,j;
		itcast:for(i=1;i<=9;i++)
		{
			for (j=1;j<=i;j++)
			{
				if (i>4)
				{
				break itcast;
			}
			System.out.println("*");
		}
		System.out.println("\n");
	}

}
}
