public class Profitability {

    private double pizzaField;
    private double pizzaPrice;
    private int pizzaDiameter;
    private double pizzaPriceToField;


    public double pizzaFieldCounting (){

        return this.pizzaField = (pizzaDiameter/2) * (pizzaDiameter/2) * 3.14;

    }

    public int getPizzaDiameter() {
        return pizzaDiameter;
    }

    public void setPizzaDiameter(int pizzaDiameter) {
        this.pizzaDiameter = pizzaDiameter;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public double getPizzaField() {
        return pizzaField;
    }

    public double getPizzaPriceToField() {
        return pizzaPriceToField;
    }

    public void setPizzaPriceToField(double pizzaPriceToField) {
        this.pizzaPriceToField = pizzaPriceToField;
    }

    public double countPizzaPriceToField() {
        return pizzaPriceToField =  pizzaPrice/pizzaField;


    }
}
