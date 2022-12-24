import java.util.Scanner;

public class mod5num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (n+=1;n>0;n++){
            if (n%5==0){
                System.out.println(n);
                break;
            }
        }
    }
}
