import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Names name = new Names();


        System.out.println("Podaj ilość imion:");
        name.setNumberOfNames(scan.nextInt());

       String [] arrayOfNames = new String [name.getNumberOfNames()];

        for (int i = 0; i < name.getNumberOfNames(); i++ ) {
            System.out.println("Podaj imię (żeby przerwać wpisywanie napisz \"esc\": ");
            String zank = scan.next().toLowerCase();
            while (zank.length() < 3)
            {
                System.out.println("Imię jest za krótkie - musi mieć conajmniej 3 znaki \n podaj imię jeszcze raz \n");
            zank = scan.next().toLowerCase();
            }

            if (zank.equals("esc")) {
                break;
            } else {
                arrayOfNames[i] = zank;
            }
        }


        name.setName(arrayOfNames);

        System.out.println("Wpisane przez Ciebie iminiona to: " + Arrays.asList(arrayOfNames));

        System.out.println("Najdłuższe imię to: " + name.longestName(name.getName()));

        System.out.println("Najkrótsze imię to: " + name.shortestName(name.getName()));

        System.out.println("Powtarzające się imiona to: " + name.numberOfRepeatNames(name.repeatName(name.getName())));

        System.out.print("Imiona z powtarzającymi się literami: ");
        for (String str : name.getName()){
            System.out.println(str + " - " + name.isSameLetter(str));
        }

        System.out.println(name.repeatName(name.getName()));
    }
}
