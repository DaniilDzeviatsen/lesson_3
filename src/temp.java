import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if (t>-5){
            System.out.println("warm");
        }else if(t<-5 && t>-20){
            System.out.println("normal");
        }else if(t<-20){
            System.out.println("coldy");
        }
    }
}
