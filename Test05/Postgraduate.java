package homework;



public class Postgraduate extends Student{
	String degree;
	public Postgraduate (int id,String name,String degree) {
		this.id=id;
		this.name=name;
		this.degree=degree;
	}
			public void show () {
				System.out.println("�ҵ�������"+name+",�ҵ�ѧλ��"+degree);
			}
				public void study () {
					System.out.println("�о�����ѧϰ");
				}
				public static void main (String [] args)
				{
					Postgraduate p=new Postgraduate(001, "����", "��ѧ˶ʿ");
					p.study();
				
					Student [] students=new Student[] {
						p,new Undergraduate(002, "����", "��ѧѧʿ"),
						new Undergraduate(003, "����", "��ѧѧʿ"),
						new Postgraduate(001, "����", "��ѧ˶ʿ")
					};
					for (int i=0;i<students.length;i++)
					{
						students [i] .study();
						
						
					
				
			}
				}
		
	

}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

