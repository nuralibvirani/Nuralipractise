
import java.util.Scanner;

public class Vowel_Or_Consonant {

    public static void main(String[] args){
        boolean isVowel = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char ch=scanner.next().charAt(0);
        scanner.close();
        switch (ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                isVowel = true;
                }
                if(isVowel == true){
                    System.out.println(ch+ " is a Vowel ");
                }
                else{
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
                System.out.println(ch+ " is a consonant ");
            else
                System.out.println("Input is not a alphabet");

                }

    }

}
