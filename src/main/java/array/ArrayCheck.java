package array;

public class ArrayCheck {

    public static void main(String[] args)
    {
        /*
        // 1. 1D - Java Dimension Arrays
        int[] arrA; // Declaration

        // Proper initialization after declaration
        arrA = new int[]{1, 2, 3, 4, 5};

        // Declare abd Initialize in one step
        String[] arrB = {"Hi", "Hello", "Halo"};

        double[] arrC = {10.1, 20.2, 30.3};

        System.out.println("------Array A-------");
        for (int i = 0; i < arrA.length; i++)
        {
            System.out.println(arrA[i]);
        }

        System.out.println("------Array B-------");
        for (int i = 0; i < arrA.length; i++)
        {
            System.out.println(arrB[i]);
        }

         */

        /*

        // 2D Arrays
        int[][] xArr = new int[3][3]; // columns / rows
        xArr[0][0] = 1;
        xArr[0][1] = 2;
        xArr[0][2] = 3;

        xArr[1][0] = 4;
        xArr[1][1] = 5;
        xArr[1][2] = 6;

        xArr[2][0] = 7;
        xArr[2][1] = 8;
        xArr[2][2] = 9;

        System.out.println("--- xArr ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(xArr[i][j]);
            }
            System.out.println();
        }


        int[][] yArr = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        System.out.println("--- yArr ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(yArr[i][j]);
            }
            System.out.println();
        }

        // Clone 1D array --> 2 arrays did not point in one address >> change original did not affect another
         */

        /*
        int[] originalArray = {1, 2, 3, 4, 5};

        // Clone mảng
        int[] clonedArray = originalArray.clone();

        // In cả hai mảng
        System.out.println("Mảng gốc: ");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nMảng clone: ");
        for (int i : clonedArray) {
            System.out.print(i + " ");
        }

        // Thay đổi giá trị trong mảng gốc và kiểm tra mảng clone
        originalArray[0] = 100;

        System.out.println("\n\nSau khi thay đổi mảng gốc:");
        System.out.println("Mảng gốc: ");
        for (int i : originalArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nMảng clone: ");
        for (int i : clonedArray) {
            System.out.print(i + " ");
        }
         */

        // Clone 1D array --> need to deep copy each array
        int[][] originalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Clone mảng
        // int[][] clonedArray = originalArray.clone();
        int[][] clonedArray = new int[originalArray.length][];
        for (int i = 0; i < originalArray.length; i++) {
            clonedArray[i] = originalArray[i].clone();
        }

        // In mảng gốc
        System.out.println("Mảng gốc: ");
        for (int[] row : originalArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Thay đổi giá trị trong mảng gốc
        originalArray[0][0] = 100;

        System.out.println("\nSau khi thay đổi mảng gốc:");
        System.out.println("Mảng gốc: ");
        for (int[] row : originalArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("Mảng clone: ");
        for (int[] row : clonedArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


    }
}
