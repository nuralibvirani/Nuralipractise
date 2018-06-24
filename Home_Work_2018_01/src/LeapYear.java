import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Year : ");
        int year = scanner.nextInt();

        boolean leapyear = false;

        if(year%4==0) {leapyear = true;}
                else if(year%100 ==0) {leapyear=false;}
        else if (year%400 ==0) {leapyear=true;}
        else{leapyear = false;}
        if(leapyear) {
        System.out.println("year "+year+" is a leap year");}
        else System.out.println("year " + year + " is not a leap year");
}




}
