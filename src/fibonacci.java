import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter deposit");
        float dep=sc.nextFloat();
        System.out.println("enter month number");
        int mon=sc.nextInt();
        for (int i=1; i<=mon; i++){
            dep=(float)(dep*1.07);
        }
        System.out.println(dep);
    }
}
