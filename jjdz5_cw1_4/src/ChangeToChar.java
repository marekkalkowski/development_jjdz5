public class ChangeToChar {

    private String word;
    private char firstLetter;
    private int numeral;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    // funkcja zwraca pierwszą literę pobranego wyrazu
    public char change (){
        return firstLetter = word.charAt(numeral-1);
    }

    public void setNumeral(int numeral) {
        this.numeral = numeral;
    }

    public int getNumeral() {
        return numeral;
    }
}
