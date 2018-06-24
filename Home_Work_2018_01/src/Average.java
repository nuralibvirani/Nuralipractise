
import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num1 = scanner.nextInt();

        System.out.println("Enter Second Number");
        int num2 = scanner.nextInt();

        System.out.println("Enter Third Number");
        int num3 = scanner.nextInt();

        System.out.println("Enter Fourth Number");
        int num4 = scanner.nextInt();

        System.out.println("Enter Fifth Number");
        int num5 = scanner.nextInt();

        System.out.println("Average of Five Number is : "
        +(num1+num2+num3+num4+num5)/5);




    }




}
