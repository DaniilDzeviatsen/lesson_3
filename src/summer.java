import java.util.Scanner;

public class summer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        if (m>0){
            int sum=0;
            for (int i=1;i<m;i++){
             sum=sum+i;
            }System.out.println(sum);
        }

    }
}
