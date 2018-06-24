import java.util.Scanner;
public class MarkSheet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name =");
        String name = sc.next();

        System.out.println("Enter Roll Number =");
        int rollnumber = sc.nextInt();

        System.out.println("Marks");
        System.out.println("Maths =");
        double p = sc.nextDouble();

        System.out.println("Science =");
        double q = sc.nextDouble();

        System.out.println("History =");
        double r = sc.nextDouble();

        System.out.println("Total marks = " + (p+q+r) );

        double s = p+q+r;
        double t = (s*100)/300;

        System.out.println("Percentage = " + (t) + "%");

        if (t>35) {System.out.println("Pass");}
        else {
            System.out.println("Fail");}

            if(t>=80 && t<=100) { System.out.println("Grade = A+");}
            else if(t>=60 && t<=80) { System.out.println("Grade = A");}
            else if(t>=50 && t<=60) { System.out.println("Grade = B");}
            else if(t>=35 && t<=50) { System.out.println("Grade = C");}




    }

}
