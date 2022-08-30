/*Write a Java program to print an array after changing the rows and columns of a given twodimensional array.
Original Array:
20 60 50
50 90 10
After changing the rows and columns of the said array:
20 50
60 90
50 10*/

public class Q5 {
    public static void main(String args[]) {

        int a[][] = {{20,60,50}, {50,90,10}};
        System.out.println("Original Array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(a[i][j]+" ");;;
            }
            System.out.println();
        }

        int b[][]=new int[3][2]; ;
        System.out.println("After changing the rows and columns of the said array");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <2; j++) {
                 b[i][j] =a [j][i];;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <2; j++) {
                System.out.print(b[i][j]+" ");;;
            }
            System.out.println();
        }
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        }
        System.out.println();
    }
}

