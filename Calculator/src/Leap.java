import java.util.Scanner;
public class Leap{
public static void main(String args[]){

    Scanner s = new Scanner(System.in);
    System.out.println("Enter any year:");
    int year = s.nextInt();
    boolean leap = false;
    if (year%4 ==0) {leap = true;}
    else if (year%100 ==0) {leap=false;}
    else if(year%400 ==0){leap=true;}
    else {leap = false;}
    if(leap) {System.out.println("year "+year+" is a  Leap Year");}
          else {System.out.println("year "+year + " is not a Leap Year");}


}



}
