// Sort an array of Strings in Java alphabetically. [Avoid using Java's built-in soring techniques]

import java.util.Scanner;
public class Q2
{
    public static void main(String[] args)
    {
        String[] names = {"Harry","Hermione","Draco","Ginny","Albus"};
        String temp;
        Scanner scan = new Scanner(System.in);
        //Sorting the strings
        for (int i = 0; i < 5; i++)
        {
            for (int j = i + 1; j < 5; j++) {
                if (names[i].compareTo(names[j])>0)
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        //Displaying the strings after sorting them based on alphabetical order
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= 5 - 1; i++)
        {
            System.out.print(names[i] + ", ");
        }
    }
}