import java.util.Scanner;

public class Month_number {
    public static void main(String[] args) {
        System.out.println("Enter month number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        switch (num){
            case 1,2,12:
                System.out.println("winter");
                break;
            case 3,4,5:
                System.out.println("spring");
                break;
            case 6,7,8:
                System.out.println("summer");
                break;
            case 9,10,11:
                System.out.println("autumn");
                break;
        }
    }
}
