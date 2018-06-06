import java.util.Scanner;
public class Main {


    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        Profitability pizzaFirst = new Profitability();
        Profitability pizzaSecond = new Profitability();

        System.out.println("Podaj średnicę pierwszej pizzy w cm: ");
        pizzaFirst.setPizzaDiameter(scan.nextInt());
        System.out.println("Podaj cenę pierwszej pizzy w zł: ");
        pizzaFirst.setPizzaPrice(scan.nextInt());

        System.out.println("Podaj średnicę drugiej pizzy w cm: ");
        pizzaSecond.setPizzaDiameter(scan.nextInt());
        System.out.println("Podaj cenę drugiej pizzy w cm: ");
        pizzaSecond.setPizzaPrice(scan.nextInt());
        scan.close();

        pizzaFirst.pizzaFieldCounting();
        pizzaFirst.countPizzaPriceToField();

        pizzaSecond.pizzaFieldCounting();
        pizzaSecond.countPizzaPriceToField();



        System.out.printf("Koszt 1cm pierwszej pizzy to: %.3f%n",pizzaFirst.getPizzaPriceToField());
        System.out.printf("Koszt 1cm drugiej pizzy to: %.3f%n",pizzaSecond.getPizzaPriceToField());
        if (pizzaFirst.getPizzaPriceToField() == pizzaSecond.getPizzaPriceToField()) {
            System.out.println("Nie ma różnicy koszt obu pizz jest taki sam");}
            else if (pizzaFirst.getPizzaPriceToField() < pizzaSecond.getPizzaPriceToField()){
            System.out.println("Wybierz pierwszą bardziej się opłaca");}
            else {
            System.out.println("Wybierz drugą bardziej się opłaca");}


    }
}
