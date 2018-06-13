public class Card {


    Suits color;
    Ranks figura;




    public void getDescription ( ){

        System.out.println(color + " " + figura);





    }

    public Suits getColor() {
        return color;
    }

    public void setColor(Suits color) {
        this.color = color;
    }

    public Ranks getFigura() {
        return figura;
    }

    public void setFigura(Ranks figura) {
        this.figura = figura;
    }
}
