package day04;
class sude{
    private int age=21;
    private String name="sudeepHalehalli";
    public int getAge()
    {

        return age;
    }
    public String getName()
    {
        return name;
    }
}

public class hu {
    public static void main(String[] args) {
      sude objy=new sude();
        System.out.println(objy.getAge()+":"+objy.getName());
    }
}
