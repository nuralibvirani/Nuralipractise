import java.util.Scanner;

public class InterChange {

    public static void main(String[] args){
        String a,b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Value : ");
        a=scanner.next();

        System.out.println("Enter Second Value : " );
        b=scanner.next();

        StringBuffer sf = new StringBuffer(a);
        System.out.println("Tnterchange value is : "+sf.reverse() );

        StringBuffer s = new StringBuffer(b);
        System.out.println("Tnterchange value is : "+s.reverse() );

    }



}
