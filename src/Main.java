import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите год вашего рождения");
        Scanner m = new Scanner (System.in);
        int year=m.nextInt();
        System.out.println("Ваш возраст равен "+(2022-year)+" годам");
    }
}