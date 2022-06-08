package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fedUp = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)) {
            fedUp = true;
            System.out.println(this.name + " is fed up");
            System.out.println(this.name + " eat " + appetite + " of food");
            System.out.println();
        }else {
            fedUp = false;
            System.out.println(this.name + " isn't fed up");
            System.out.println("Not enough food for " + this.name);
            System.out.println();
            plate.appendFood(100);
            System.out.println();
        }
    }
}
