import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){

        System.out.println("Prosty kalkulator wykonujący podstawowe operacje na dwóch liczbach");

        Calculator wynik = new Calculator();


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        wynik.x = scan.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        wynik.y = scan.nextDouble();
       // scan.close();

        System.out.println("Jakie działanie chcesz wykonać:");
        System.out.println("1. Dodawanie ");
        System.out.println("2. Odejmowanie ");
        System.out.println("3. Dzielenie ");
        System.out.println("4. Mnożenie ");

        Scanner operation = new Scanner(System.in);
        wynik.operationType = operation.nextInt();

        int howManyTimesBadChoice = 0;
        while (wynik.operationType>4 || wynik.operationType<1) {
            System.out.println("Niewłaściwy wybór - wybierz jeszcze raz");
            wynik.operationType = operation.nextInt();
            howManyTimesBadChoice++;

            if (howManyTimesBadChoice >= 2 && howManyTimesBadChoice <3) {
                System.out.println("Bez jaj przeciez chyba widzisz jaki masz wybór - jeszce raz źle wybierzesz i odpalam wirusa na Twoim kompie :)");
            }

            if (howManyTimesBadChoice >= 3) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Sajonara odpalam wirusa");

                }
                break;
            }
        }
        scan.close();

        //System.out.println(wynik.operationType);
        if (wynik.y ==0 && wynik.operationType == 3) System.out.println("Nie dziel cholero przez zero");
        else
            if (wynik.operationType == 1) {System.out.println("Wynik dodawania:" + wynik.add());}
            else if (wynik.operationType == 2){System.out.println("Wynik odejmowania:" + wynik.substruct() );}
            else if (wynik.operationType == 3) {System.out.println("Wynik dzielnia:" + wynik.divide() );}
            else  if (wynik.operationType == 4) { System.out.println("Wynik mnożenia:" + wynik.multiply() );};


        /*System.out.println("Wartość pierwsza to: " + wynik.x);
        System.out.println("Wartość druga to: " + wynik.y);*/


//

    }
}
