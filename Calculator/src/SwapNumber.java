import java.util.Scanner;

public class SwapNumber
{
    public static void main(String args[])
    {
        int num1, num2, swap;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Two Number : ");

        System.out.println("First Number : ");
        num1 = scan.nextInt();
        System.out.println("Second Number : ");
        num2 = scan.nextInt();

        swap = num1;
        num1 = num2;
        num2 = swap;

        System.out.println("The Value of the First and Second Number after Swapping is ");

        System.out.println("First Number = " +num1);
        System.out.println("Second Number = " +num2);
    }
}
