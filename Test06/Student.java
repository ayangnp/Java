public abstract class Student {
    private int id;
    private String name;
    public String getName ()
    {
        return name;
    }
    public Student (int id,String name)
    {
        this.id=id;
        this.name=name;

    }
    public abstract void study ();
}
