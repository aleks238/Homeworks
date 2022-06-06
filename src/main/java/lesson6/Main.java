package lesson6;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        dog1.run(500);
        dog1.swim(10);

        dog2.run(501);
        dog2.swim(11);

        cat1.run(100);
        cat1.swim(10);

        cat2.run(250);

        System.out.println("The number of animals: "+ Animal.count);
        System.out.println("The number of dogs: "+ Dog.countDog);
        System.out.println("The number of cats: "+Cat.countCat);
    }
}
