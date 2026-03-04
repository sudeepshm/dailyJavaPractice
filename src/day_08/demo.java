package day_08;
class Human{
    private String name="sudeepHalehalli";
    private int age=20;


    public int getAge()
        {
        return age;

    }
    public String getName(){
        return name;
    }
}

public class demo {
    public static void main(String[] args) {
        Human obj=new Human();
        System.out.println(obj.getAge()+":"+obj.getName());
    }
}
