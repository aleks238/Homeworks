package lesson6;

public class Cat extends Animal{
    private int maxCatRun = 200;
    public static int countCat = 0;

    public void run(int distance) {
        if (distance <= maxCatRun) {
            System.out.println("Cat runned " + distance + " m");
        } else {
            System.out.println("The distance very big for cat");
        }
    }
    public void swim(int distance) {
            System.out.println("Cats can't swim");
        }
    public Cat(){
        countCat++;
    }
}

