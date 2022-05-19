package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();
    }
    //2
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    //3
    static void checkSumSign() {
        int a = 4;
        int b = 5;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //4
    static void printColor() {
        int value = 120;
        if (value <= 0) {
        System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
        System.out.println("Желтый");
        } else {
        System.out.println("Зеленый");
        }
    }
    //5
    static void compareNumbers() {
        int a = 8;
        int b = 10;
        if(a>=b) {
            System.out.println("a>=b");
        }else {
            System.out.println("a<b");
        }
    }

}






