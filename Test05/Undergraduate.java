package homework;


public class Undergraduate extends Student{
	String degree;
	long id;
	public Undergraduate (long id,String name,String degree) {
		this.id=id;
		this.name=name;
		this.degree=degree;
	}
	public void show () {
		System.out.println("�ҵ�������"+name+",�ҵ�ѧλ��"+degree);
		
	}
	public static void main (String [] args)
	{
		Undergraduate u=new Undergraduate(001,"����","��ѧѧʿ");
		System.out.println(u.id);
	
	

}
}
