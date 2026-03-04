package day04;
class computer{
    public void musicPlay(){
        System.out.println("music is palying....");
    }
    public String getMeAPen(int n1){
        if (n1>=10)
            return "pen";
      return "nothing";
    }
}

public class methods {
    public static void main(String[] args) {
        computer obj=new computer();
        obj.musicPlay();
        String str= obj.getMeAPen(89);
        System.out.println(str);
    }
}
