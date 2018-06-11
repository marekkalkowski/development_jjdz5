import java.util.Arrays;

public class Tablice {

    char [] chars;
    char[] chars2;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tablice)) return false;
        Tablice tablice = (Tablice) o;
        return Arrays.equals(chars, tablice.chars) &&
                Arrays.equals(chars1, tablice.chars1);
    }

    @Override
    public int hashCode() {

        int result = Arrays.hashCode(chars);
        result = 31 * result + Arrays.hashCode(chars1);
        return result;
    }

    char [] chars1;


    public Tablice(char [] chars){
        this.chars = chars;
    };

    public Tablice(){};
}
