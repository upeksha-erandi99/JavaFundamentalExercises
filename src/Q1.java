//In Java, sort an int array in decreasing order. That is, the largest will appear first, followed by the smallest.

import java.util.Scanner;
public class Q1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {

        int sizeOfArr=0;

        System.out.print("Enter the size of the Array : ");
        sizeOfArr = scanner.nextInt();
        int[] myIntArray1 = getIntegers(sizeOfArr);
        System.out.println("Array elements before sorting");
        printArray(myIntArray1);
        sortingArray(myIntArray1);

        int[] myIntArray2 = sortingArray(myIntArray1);
        System.out.println("Array elements after sorting");
        printArray(myIntArray2);
    }
    public static int[] getIntegers(int number) {
        System.out.println("Please Enter " + number + " integer values");
        int intArray[] = new int[number];
        for (int i = 0; i < number; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }
    public static int[] sortingArray(int[] intArray) {
        int temp;
        //int sortedIntArray[] = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {

            for (int j=i+1; j<intArray.length; j++){
                if (intArray[i]>intArray[j])
                {
                    //intArray[i]= intArray[i];
                }
                else
                {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j]= temp;
                }
            }

        }
        return intArray;
    }
    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i]+" ");
        }
        System.out.println();
    }
}
