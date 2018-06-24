
import java.util.Scanner;

public class UpperLower{

    public static void main(String[] args) {
        String Upper , Lower;

        Scanner s = new Scanner(System.in);

        System.out.println(" Enter any one Alphabet in Upper case : ");

        Upper = s.nextLine();

        Lower = Upper.toLowerCase();

        System.out.println(" Entered Alphabet in Uppercase his lowercase: " + Lower);
    }


}



