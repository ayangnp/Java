public class Student {
    private int id;
    private String name;
    int age;
    public String getName () {
        return name;
    }
    public void setName (String name)
    {
        this.name=name;
    }
    public Student (int id,String name)
    {
        this.id=id;
        this.name=name;

    }
    public void study ()
    {
        System.out.println("学生在学习");
    }
    public static void main (String [] args)
    {
        Student s=new Student (001, "张三");
        System.out.println(s.name);
    }
}
