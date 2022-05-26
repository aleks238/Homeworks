package lesson3;

public class Task1_5 {

    public static void main(String[] args) {

        //1

        System.out.println("N1");

        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");

        }
        //2
        System.out.println();
        System.out.println("N2");

        int arr1[] = new int[100];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
            System.out.print(i + " ");
        }

        //3

        System.out.println();
        System.out.println("N3");

        int arr2[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr2.length; i++) {


            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
            System.out.print(arr2[i] + " ");

        }

        //4
        System.out.println();
        System.out.println("N4");

        int[][] arr3 = new int[4][4];


        for (int i = 0; i < arr3.length; i++) {
            System.out.println();
            for (int j = 0; j < arr3[i].length; j++) {
                if (i == j) {
                    arr3[i][j] = 1;
                    System.out.print(arr3[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
        }


        //5
        System.out.println();
        System.out.println("N5");

        int initialValue = 1;
        int len = 4;

        int [] result = returnMassive(initialValue, len);
        for (int j = 0; j < result.length; j++) {
            System.out.print(result[j] + " ");
        }
    }
    static int []  returnMassive (int initialValue, int len){
        int[] arr4 = new int[len];
        int i;
        for (i =0; i < arr4.length; i++) {
            arr4[i] = initialValue;}
        return arr4 ;
    }
}








