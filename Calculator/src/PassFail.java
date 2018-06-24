

import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        int num;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Score =");
        num=reader.nextInt();


        if (num >=35) { System.out.println("Pass!");}
            else { System.out.println("Fail!"); }
    }
}