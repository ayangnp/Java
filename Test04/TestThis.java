package test01;


public class TestThis {
	int a, b, c;
	TestThis() 
	{
		System.out.println("��Ҫnewһ��Hello����");
		
		
	}
	TestThis (int a,int b)
	{
		this();
		a=a;
		this.a=a;
		this.b=b;
	}
	TestThis (int a,int b,int c)
	{
		this (a,b);
		this.c=c;
	}
	void sing () {}
	void chifan () 
	{
		this.sing();
		System.out.println("�����躰��ؼҳԷ���");
	}
	public static void main (String [] args) 
	{
		TestThis hi = new TestThis (2,3);
		hi.chifan();
	
		
	}

}
