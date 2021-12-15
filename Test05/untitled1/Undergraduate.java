public class Undergraduate extends Student{
    String degree;
    public Undergraduate (int id,String name,String degree)
    {
        super (id,name);
        this.degree=degree;
    }
    public void show ()
    {
        System.out.println("我的名字是" +name+",我的学位是"+degree);
    }
    public static void main (String [] args)
    {
    Undergraduate u=new Undergraduate(001,"张三","工学硕士");
    u.study ();
    u.show();
    }
}
