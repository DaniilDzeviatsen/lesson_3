import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите год вашего рождения");
        Scanner m = new Scanner (System.in);
        int year=m.nextInt();
        int n=2022-year;
        if (n<18 || n>100){
            System.out.println("Forbid to get drunk");
        }

        System.out.println("Ваш возраст равен "+(2022-year)+" годам");

    }
}