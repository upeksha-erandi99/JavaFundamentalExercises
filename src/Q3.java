//Use the previously created String array and verify that the user-input value “Draco” is there.
import java.util.Scanner;
public class Q3
{
    public static void main(String[] args)
    {
        String[] names = {"Harry","Hermione","Draco","Ginny","Albus"};
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a name to be checked whether it is included in the above array");
        String userInput = scan.next();

        for(int i = 0; i < 5; i++)
        {
            if(userInput.equals(names[i])){
                System.out.println("Name : "+names[i]+" includes in the array");
            }
            else{
                System.out.println();
            }
        }
    }
}