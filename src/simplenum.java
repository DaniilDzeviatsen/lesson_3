import java.util.Scanner;

public class simplenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (; m > 0; m--) {
            for (int i = 2; i < m; i++) {
                if (m % i != 0){
                    if ((m-1)==i)
                        System.out.println(m);
                }


                else {
                    break;
                }

            }

        }
        System.out.println(1);
    }
}
