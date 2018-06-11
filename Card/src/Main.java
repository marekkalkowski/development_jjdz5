import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) {

        Card karta = new Card();


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj figurę - możliwy wybór to as, król, dama, walet:");
        String figura = scan.next();
        int mistakes = 1;
        while (!(figura.toLowerCase().equals("as")) && !figura.toLowerCase().equals("dama") && !figura.toLowerCase().equals("król") && !figura.toLowerCase().equals("walet")) {

            if (mistakes == 2) {
                System.out.println("Jeszce raz się pomylisz i instaluję wirusa");
            } else if (mistakes >= 3) {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Deleting System files sorry");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("System files deleted :) ");
                return;
            }
            mistakes++;
            System.out.println("Spoza zakresu");
            System.out.println("Podaj figurę - możliwy wybór to as, król, dama, walet:");
            figura = scan.next();
        }

       System.out.println("Podaj kolor - możliwy wybór to: pik, kier, trefl, karo:");
        String kolor = scan.next();
        mistakes = 1;
        while (!(kolor.toLowerCase().equals("pik")) && !kolor.toLowerCase().equals("karo") && !kolor.toLowerCase().equals("trefl") && !kolor.toLowerCase().equals("kier")){

            if (mistakes == 2) {
                System.out.println("Jeszce raz się pomylisz i instaluję wirusa");
            } else if (mistakes >= 3) {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Deleting System files sorry");
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("System files deleted :) ");

                return;
            }
            mistakes++;
            System.out.println("Kolor z poza zakresu");
            System.out.println("Podaj kolor - możliwy wybór to: pik, kier, trefl, karo :");
            kolor = scan.next();

        }

        if (figura.toLowerCase().equals("as")){
            karta.setFigura(Ranks.ACE);
        }
        else if (figura.toLowerCase().equals("dama")){
            karta.setFigura(Ranks.QUEEN);
        }
            else if (figura.toLowerCase().equals("król")){
                karta.setFigura(Ranks.KING);
            }
            else if (figura.toLowerCase().equals("walet")){
                karta.setFigura(Ranks.JACK);
            }

        if (kolor.toLowerCase().equals("pik")){
            karta.setColor(Suits.SPADES);
        }
        else if (kolor.toLowerCase().equals("karo")){
            karta.setColor(Suits.DIAMONDS);
        }
        else if (kolor.toLowerCase().equals("trefl")){
            karta.setColor(Suits.SPADES);
        }
        else if (kolor.toLowerCase().equals("kier")){
            karta.setColor(Suits.HEARTS);
        }
        System.out.println();


        karta.getDescription();
        }
        //karta.setColor(Suits.CLUBS);



    }

