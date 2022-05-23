package lesson2;

public class Task4 {
    public static void main(String[] args) {

        String text = "Hello, world";
        int a = 10;
        print(text, a);
    }

    static void print(String text, int a){
        for (int i = 1; i <= a; i++) {
            System.out.println(text);
        }
    }


}




