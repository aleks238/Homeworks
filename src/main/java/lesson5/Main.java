package lesson5;

public class Main {

    public static void main(String[] args) {

     Person [] arrayPerson = new Person[5];


     arrayPerson[0] = new Person("Petrov", "Ivan", "Ivanovich", "cook", "cook@mail.ru","89119411123", 80000,41);

     arrayPerson[1] = new Person("Ivanov", "Petr", "Ivanovich", "cook assistant", "cookassistant@mail.ru","89419411124", 60000,20);

     arrayPerson[2] = new Person("Baskov", "Nicolay", "Ivanovich", "cook assistant", "cookassistant@mail.ru","89819411124", 60000,44);

     arrayPerson[3] = new Person("Vladimirov", "Vladimir", "Petrovich", "Chef", "chefcook@mail.ru","89429411124", 100000,52);

     arrayPerson[4] = new Person("Vasilev", "Vasily", "Vladimirovich", "waiter", "waitercook@mail.ru","89581411124", 50000,18);


     for (int i = 0; i < arrayPerson.length; i++) {
        if(arrayPerson[i].age>40){
            arrayPerson[i].printInfo();
            System.out.println();
            }
        }

    }
}
