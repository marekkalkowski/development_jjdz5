import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Names name = new Names();

        System.out.println("Podaj ilość imion:");


        name.setNumberOfNames(scan.nextInt());

       // if (name.getNumberOfNames() instanceof  ){};
        String [] arrayOfNames = new String [name.getNumberOfNames()];

        for (int i = 0; i < name.getNumberOfNames(); i++ ) {
            System.out.println("Podaj imiona (żeby przerwać wpisywanie napisz \"esc\": ");
            String zank = scan.next();

            if (zank.equals("esc")) {
                break;
            } else {
                arrayOfNames[i] = zank;
            }
        }

        name.setName(arrayOfNames);

        System.out.println(Arrays.asList(arrayOfNames));
        System.out.println("Najdłuższe imię to: " + name.longestName(name.getName()));
        System.out.println("Najkrótsze imię to: " + name.shortestName(name.getName()));
        //System.out.println("Powtarzające się imiona to: " + name.repeatName(name.getName()));
        System.out.println("Powtarzające się imiona to: " + name.numberOfRepeatNames(name.repeatName(name.getName())));


    }
}
