package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 50);
        Cat cat2 = new Cat("Boris", 60);
        Plate plate = new Plate(100);
        Plate plateArray = new Plate(150);

        cat1.eat(plate);
        cat2.eat(plate);

        Cat[] arrayCats = new Cat[5];
        arrayCats[0] = new Cat("cat1", 40);
        arrayCats[1] = new Cat("cat2", 25);
        arrayCats[2] = new Cat("cat3", 25);
        arrayCats[3] = new Cat("cat4", 20);
        arrayCats[4] = new Cat("cat5", 60);

        for (int i = 0; i < arrayCats.length; i++) {
            arrayCats[i].eat(plateArray);
        }
    }
}



