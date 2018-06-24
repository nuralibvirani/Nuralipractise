
import java.util.Scanner;

    public class OddEven
    {
        public static void main(String[] args)
        { //Enter an integer to check if it is odd or even

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            String EvenOdd = ( num%2 == 0 )  ?  "even" : "odd";

                System.out.println(num + "is" + EvenOdd);


        }
    }



