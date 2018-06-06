import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {


    public static void main (String [] args){


        Scanner scan = new Scanner(System.in);
        ChangeToChar changeToChar = new ChangeToChar();

        System.out.println("Podaj jakiś wyraz: ");
        changeToChar.setWord(scan.next());

        System.out.println("Podaj którą literę wyświetlić: ");
        changeToChar.setNumeral(scan.nextInt());



        while (changeToChar.getNumeral() < 1 || changeToChar.getNumeral() > changeToChar.getWord().length()) {
            System.out.println("Wartość z poza zakresu");
            System.out.println("Podaj jeszcze raz ");
        }


        scan.close();
        System.out.println(changeToChar.getNumeral() + " litera w wyrazie " + changeToChar.getWord() + " to: \"" + changeToChar.change()+"\"" );

    }
}
