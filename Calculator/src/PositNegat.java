import java.util.Scanner;

public class PositNegat {

    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        System.out.println("Enter number :");

        int n = s.nextInt();

        if (n>0) {

            System.out.println("Number is Positive");

        }else if (n<0){

            System.out.println("Number is Negative");

        }else

            System.out.println("number is zero");
    }
}
