import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Card karta = new Card();


        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj figurę:");
        String figura = scan.next();

       System.out.println("Podaj kolor: ");
     String kolor = scan.next();
        //System.out.println(figura);

        if (figura.equals("as")){
            karta.setFigura(Ranks.ACE);
        }
        else if (figura == "dama"){
            karta.setFigura(Ranks.QUEEN);}
            else if (figura == " król"){
                karta.setFigura(Ranks.KING);
            }
            else if (figura == " walet"){
                karta.setFigura(Ranks.JACK);
            }else {
                System.out.println("Spoza zakresu");
            }

        if (kolor.equals("pik")){
            karta.setColor(Suits.SPADES);
        }
        else if (figura == "dama"){
            karta.setFigura(Ranks.QUEEN);}
        else if (figura == " król"){
            karta.setFigura(Ranks.KING);
        }
        else if (figura == " walet"){
            karta.setFigura(Ranks.JACK);
        }else {
            System.out.println("Spoza zakresu");
        }


        karta.getDescription();
        }
        //karta.setColor(Suits.CLUBS);



    }

