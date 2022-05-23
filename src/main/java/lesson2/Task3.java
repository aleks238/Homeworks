package lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите целое положительное или отрицательное число: ");
        int a = scanner.nextInt();
        System.out.println(check(a));

    }

    static boolean check(int a){
        if (a>=0){
            return false;
        }
        else {
            return true;
        }
    }
}
