package lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите целое положительное или отрицательное число: ");
        int a = scanner.nextInt();
        check(a);

    }

    static void check(int a){
        if (a >= 0) {
            System.out.println("Введенное число положительное");
        }
        else{
            System.out.println("Введенное число отрицательное");
        }
    }

}
