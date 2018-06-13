import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Names name = new Names();


        System.out.println("Podaj ilość imion:");
        int number = (scan.nextInt());


        for (int i = 0; i < number; i++ ) {
            System.out.println("Podaj imię (żeby przerwać wpisywanie napisz \"esc\": ");
            String znak = scan.next().toLowerCase();
            while (znak.length() < 3)
            {
                System.out.println("Imię jest za krótkie - musi mieć conajmniej 3 znaki \n podaj imię jeszcze raz \n");
            znak = scan.next().toLowerCase();
            }

            if (znak.equals("esc")) {
                break;
            } else {
                name.listOfNames.add(znak);;
            }
        }

        System.out.println("Wpisane przez Ciebie iminiona to: " + name.listOfNames);

        System.out.println("Najdłuższe imię to: " + name.longestName(name.listOfNames));

        System.out.println("Najkrótsze imię to: " + name.shortestName(name.listOfNames));

        System.out.println("Powtarzające się imiona to: " + name.numberOfRepeatNames(name.repeatName(name.listOfNames)));

        System.out.print("Imiona z powtarzającymi się literami: ");
        for (String str : name.listOfNames){
            System.out.println(str + " - " + name.isSameLetter(str));
        }

        System.out.println(name.repeatName(name.listOfNames));
    }
}
