import java.util.Scanner;

public class arrfer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int [] arr=new int [i];
        for (int m=0;m<i;m++){
            arr [m]=(int) (Math.random()*100);
            System.out.println(arr[m]);
        }
        System.out.println("массив заполнен случайными целыми числами от 0 до 100");
    }
}
