package Test2;

public class Example18 {
	final static double PI = 3.14159;
	public static void main (String [] args)
	{
		double r1= 8.0,r2=5.0;
		System.out.println("圆1的面积=" +area(r1));
		System.out.println("圆2的面积=" +area(r2));
	}
	
		public static double area (double r)
		{
			return PI*r*r;
		}
	}


