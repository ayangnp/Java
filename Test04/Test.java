public class Test {
    public static void main (String [] args)
    {
        Student s=new Student(001,"张三");
        s.study();
        System.out.println(s.name);
        System.out.println(s.getName());
        System.out.println(s.age);
    }
}
