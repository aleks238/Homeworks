package lesson6;

public class Dog extends Animal {
     private int maxDogRun = 500;
     private int maxDogSwim = 10;
     public static int countDog = 0;

     public void run(int distance) {
          if (distance <= maxDogRun) {
               System.out.println("Dog runned " + distance + " m");
          } else {
               System.out.println("Distance of run very big for dog");
          }
     }
     public void swim(int distance) {
          if (distance <= maxDogSwim){
               System.out.println("Dog swimed " + distance + " m");
          }else {
               System.out.println("Distance of swim very big for dog");
          }
     }
     public Dog(){
          countDog++;
     }
}
