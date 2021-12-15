public class Undergraduate extends Student{
    String degree;
    public Undergraduate (int id,String name,String degree)
    {
        this.id=id;
        this.name=name;
        this.degree=degree;
    }
    public void show ( ) {
        System.out.println("我的名字是" +name+",我的学位是" +degree);

    }
}
