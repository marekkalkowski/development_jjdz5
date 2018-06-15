import java.util.*;

public class Names {
    /**
     * tablica imion "name
     * ilość imion w tablicy
     */
    //private String [] name;
    private Integer numberOfNames;
    List <String> listOfNames = new ArrayList<>() ;



    /**
     *  <b></b>metoda zwraca nadłuższe imię z listy imion</b>
     *
     * @param list - tablica imion
     * @return najdłuższe imię
     */

    public String longestName (List<String> list){
        int longestValue = 0;
        String longestName = null;
        for (String str : list){
            if (str.length() > longestValue){
                longestName = str;
                longestValue = str.length();
            }
        }
       return longestName;
    }

    /**
     * metoda zwraca najkrótsze imię
     * @param list - lista imion
     * @return najkrótsze imię
     */

    public String shortestName (List<String> list){
        int shortestValue = list.get(0).length();
        String shortestName = list.get(0);
        for (String str : list){
            if (str.length() < shortestValue){
                shortestName = str;
                shortestValue = str.length();
            }
        }
        return shortestName;
    }

    /**
     * metoda napełnia SET powtarzającymi się imionami
     * @param list  - tablica imino
     * @return - SET z powtarzającymi się imionami
     */

    public Set repeatName (List<String> list) {

        Set<String> repeatArray = new HashSet<>();
        int z = 0;
        for (String name:list){

            for ( int i = z +1 ; i < list.size();i++) {
                String firstName = list.get(i);

                if (repeatArray.contains(name)) {
                    break;
                } else if (name.equals(firstName)) {
                    repeatArray.add(name);

                }
            }
        z++;
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
            for (String str : listOfNames){
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
//    public boolean isSameLetter (String name) {
//        boolean hasSame = false;
//
//        for (int i = 0; i < name.length()-1;i++){
//            char firstChar = name.toLowerCase().charAt(i);
//            for (int z = i+1; z < name.length(); z++){
//                if (firstChar == name.toLowerCase().charAt(z)){
//                    hasSame = true;
//                    break;
//                }
//            }
//
//            if (hasSame == true){break;}
//
//        }
//
//        return hasSame;
//    }

    /**
     * to jest po zmianie z podwójnej pętli
     * @param name
     * @return
     */

    public boolean isSameLetter2 (String name){
        boolean hasSame = false;
        Set <Character> charSet = new HashSet<>();
        for (char c : name.toCharArray()){
            charSet.add(c);
        };
        if (name.length()==charSet.size()){hasSame = false;}
        else {hasSame = true;}


        return hasSame;
    }
}
