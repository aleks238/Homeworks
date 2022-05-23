package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println(sum(a,b));
    }

    static boolean sum(int a, int b) {
        if (a+b >=10 && a+b<=20){
            return true;
    }
        else {
            return false;
        }
    }

}
