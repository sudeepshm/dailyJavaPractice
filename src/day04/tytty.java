package day04;
class ne{
    private int age;
    private String name;
    public void setAge(int a){
        age=a;
    }
    public void setName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }
}

public class tytty {
    public static void main(String[] args) {
        ne hu=new ne();
        hu.setAge(20);
        hu.setName("sudeepHalehalli");
        System.out.println(hu.getAge()+":"+hu.getName());
    }
}
