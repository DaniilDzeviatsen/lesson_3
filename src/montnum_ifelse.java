import java.util.Scanner;

public class montnum_ifelse {
    public static void main(String[] args) {
        System.out.println("Enter month number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num>0 && num<13) {

             if (num>2 && num<6) {
                System.out.println("spring");
            } else if (num>5 && num<9) {
                System.out.println("summer");
            } else if (num>8 && num<12) {
                System.out.println("autumn");
            }
             else {
                 System.out.println("winter");
             }

        }
        }
}
