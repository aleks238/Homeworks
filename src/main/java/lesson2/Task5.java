package lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();

        System.out.println(isLeapYear(year));
    }

    static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 400 != 0){
            return false;
        } else {
            System.out.println("Некорректный ввод");
            return false;
        }

    }

}

