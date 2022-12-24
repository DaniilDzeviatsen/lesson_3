import java.util.Scanner;

public class creditcalc {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите сумму кредита");
                        float dep=sc.nextFloat();
        System.out.println("Введите срок в месяцах");
        int mon=sc.nextInt();
       float sum=0;
        for (int i=1; i<=mon; i++){
            if (i<4){
                System.out.println("сумма к выплате за месяц "+i+" равна "+dep/mon );
                sum=(float)(sum+dep/mon);
            }
            else if (i==4){
                System.out.println("сумма к выплате по долгу за 4 месяц равна "+dep/mon+" сумма по процентам равна "+
                        ((dep-3*dep/mon)*0.07)+" итого к выплате "+((dep/mon)+(dep-3*dep/mon)*0.07));
                sum=(float)(sum+(dep/mon)+(dep-3*dep/mon)*0.07);

            }else if (i>4 && i<mon){
                System.out.println("сумма к выплате за месяц "+i+" равна "+dep/mon+" сумма по процентам равна "+
                        ((dep-(i-1)*dep/mon)*0.07)+" итого к выплате "+(dep/mon+((dep-(i-1)*dep/mon)*0.07)));
                sum=(float)(sum+(dep/mon)+(dep-(i-1)*dep/mon)*0.07);
            }
            else if (i==mon){
                System.out.println("сумма к выплате за месяц "+i+" равна "+dep/mon+" сумма по процентам равна "+
                        ((dep-(i-1)*dep/mon)*0.07)+" итого к выплате "+(dep/mon+((dep-(i-1)*dep/mon)*0.07)));
                sum=(float)(sum+(dep/mon)+(dep-(i-1)*dep/mon)*0.07);
            }
        }
        System.out.println("Общая выплаченная сумма равна "+sum);
    }
}
