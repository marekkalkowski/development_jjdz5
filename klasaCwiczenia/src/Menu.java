public class Menu {

   private int number;
    public String text;


    public Menu() {
        number = 1;
        text = "some text";
    }

    public Menu(int number) {
        this.number = number;
    }

    public Menu(String someText) {
        this.text = someText;
    }

    public Menu(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public Menu(String text, int number) {
        this.number = number;
        this.text = text;

    }

    public void setNumber( int number){this.number = number;}

    public int getNumber (){return number;}
}
