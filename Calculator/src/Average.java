import java.util.Scanner;

public class Average{

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter first number");
        int num1 = scanner.nextInt();


        System.out.println("Enter Second number");
        int num2 = scanner.nextInt();


        System.out.println("Enter Third number");
        int num3 = scanner.nextInt();


        System.out.println("Enter Fourth number");
        int num4 = scanner.nextInt();


        System.out.println("Enter fifth number");
        int num5 = scanner.nextInt();

        System.out.println("Average of five number is :" +(num1+num2+num3+num4+num5)/5);
    }


}
