package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int appetite) {
        System.out.println("plate: " + food + " left");
        if (food >= appetite) {
            food -= appetite;
            return true;
        } else {
            return false;
        }
    }
    public void appendFood(int amountFood){
        food = food + amountFood;
        System.out.println("Amount of food increased by " + amountFood);
    }
}

