import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) {

        Card karta = new Card();


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj figurę - możliwy wybór to as, król, dama, walet:");
        String figura = scan.next();
        int mistakes = 1;
        while (!(figura.equals("as")) && !figura.equals("dama") && !figura.equals("król") && !figura.equals("walet")) {

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
        while (!(kolor.equals("pik")) && !kolor.equals("karo") && !kolor.equals("trefl") && !kolor.equals("kier")){

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

        if (figura.equals("as")){
            karta.setFigura(Ranks.ACE);
        }
        else if (figura.equals("dama")){
            karta.setFigura(Ranks.QUEEN);
        }
            else if (figura.equals("król")){
                karta.setFigura(Ranks.KING);
            }
            else if (figura.equals("walet")){
                karta.setFigura(Ranks.JACK);
            }

        if (kolor.equals("pik")){
            karta.setColor(Suits.SPADES);
        }
        else if (kolor.equals("karo")){
            karta.setColor(Suits.DIAMONDS);
        }
        else if (kolor.equals("trefl")){
            karta.setColor(Suits.SPADES);
        }
        else if (kolor.equals("kier")){
            karta.setColor(Suits.HEARTS);
        }
        System.out.println();


        karta.getDescription();
        }
        //karta.setColor(Suits.CLUBS);



    }

