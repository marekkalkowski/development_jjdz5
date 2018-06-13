import java.util.*;

public class Names {
    /**
     * tablica imion "name
     * ilość imion w tablicy
     */
    private String [] name;
    private Integer numberOfNames;



    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int getNumberOfNames() {
        return numberOfNames;
    }

    public void setNumberOfNames(int numberOfNames) {
        this.numberOfNames = numberOfNames;
    }

    /**
     *  <b></b>metoda zwraca nadłuższe imię z tablicy imion</b>
     *
     * @param array - tablica imion
     * @return najdłuższe imię
     */

    public String longestName (String [] array){
        int longestValue = 0;
        String longestName = null;
        for (String str : array){
            if (str.length() > longestValue){
                longestName = str;
                longestValue = str.length();
            }
        }
       return longestName;
    }

    /**
     * metoda zwraca najkrótsze imię
     * @param array - tablica imion
     * @return najkrótsze imię
     */

    public String shortestName (String [] array){
        int shortestValue = array[0].length();
        String shortestName = array[0];
        for (String str : array){
            if (str.length() < shortestValue){
                shortestName = str;
                shortestValue = str.length();
            }
        }
        return shortestName;
    }

    /**
     * metoda napełnia SET powtarzającymi się imionami
     * @param array  - tablica imino
     * @return - SET z powtarzającymi się imionami
     */
    public Set repeatName (String [] array) {

        Set<String> repeatArray = new HashSet<>();


        for (int i = 0; i < array.length; i++) {
            String firstName = array[i];
            for (int y = i+1; y < array.length; y++) {
                if (repeatArray.contains(firstName)){break;}

                else if (firstName.equals(array[y])) {
                    repeatArray.add(array[y]);
                    break;
                }

            }

        }
        return repeatArray;
    }

    /**
     * Metoda tworzy MAP do której dodaje imiona z SET-a i liczy ile razy wystepują w tablicy imion
     * następnie zapisuje do mapy klucz-imię i wartość - wynik sumy
     * @param repeatName
     * @return mape imion i ilości
     */
    public Map numberOfRepeatNames (Set repeatName){

        Map<Object, Integer> mapNames = new HashMap<>();
        for (Object obj : repeatName){
            int y =0;
            for (String str : name){
                if (obj.equals(str)){
                    y++;
                    mapNames.put(obj,y);
                }
            }

        }
        if (mapNames.isEmpty() || mapNames.containsKey(1) || mapNames.containsKey(0)){
            mapNames.put("Brak takich samych imion",0);
            return mapNames;
        }else {return mapNames;}
    }

    /**
     * Metoda sprawdza czy w imieniu występują te same litery - nie uwzględnia wielkości liter
     * @param name
     * @return wartość true - jezeli są albo wartoiść false - jezeli nie ma
     */
    public boolean isSameLetter (String name) {
        boolean hasSame = false;
        for (int i = 0; i < name.length()-1;i++){
            char firstChar = name.toLowerCase().charAt(i);
            for (int z = i+1; z < name.length(); z++){
                if (firstChar == name.toLowerCase().charAt(z)){
                    hasSame = true;
                    break;
                }
            }

            if (hasSame == true){break;}

        }
        //System.out.println(as + " - " + hasSame);
        return hasSame;
    }
}
