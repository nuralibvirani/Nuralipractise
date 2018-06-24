
import java.util.Scanner;

public class EligibleForVote {

    public static void main(String[] args){
        int age ;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Valid Age for Vote : ");
        age = scanner.nextInt();

        if(age>=18){
            System.out.println("This Person is Eligible for Vote ");}
            else
            {
                System.out.println("This Person is not eligible for Vote ");

        }
    }
}
