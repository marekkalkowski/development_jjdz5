public class RollingDice {

    public static int diceRoll(int diceSides){
        int dice = (int) ( Math.random() * diceSides + 1);
        return dice;
    }
    public static int monopolyRoll(){

        int dice1 = diceRoll(6);
        int dice2 = diceRoll(6);
        int rolls = 1;
        int wynik = dice1 + dice2 ;

        while (dice1==dice2){

            if (rolls >= 3){return -1;}
            dice1 = diceRoll(6);
            dice2 = diceRoll(6);
            wynik += dice1 + dice2;
            rolls += 1;
        }
        return wynik;



    }


    public static void main(String[] args) {
        System.out.println(diceRoll(6));
        System.out.println(monopolyRoll());



    }
}