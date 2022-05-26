package lesson3;

public class Task6 {
    public static void main(String[] args) {

        //6
        System.out.println();
        System.out.println("N6");

        int[] arr = {0, -1, 4, 40, 65, 11, 14, 20, 28, 32,100, 35, 41};

        System.out.println(findMaxValue(arr));
        System.out.println( findMinValue(arr));
    }
    static int findMaxValue (int arr[] ){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    static int findMinValue (int arr[] ){
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }

}

