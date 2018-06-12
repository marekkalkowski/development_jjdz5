import java.util.*;

public class Names {

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

    public String shortestName (String [] array){
        int shortestValue = array[0].length();
        String shortestName = null;
        for (String str : array){
            if (str.length() < shortestValue){
                shortestName = str;
                shortestValue = str.length();
            }
        }
        return shortestName;
    }

    public Set repeatName (String [] array) {

        Set<String> repeatArray = new HashSet<>();
        String firstName = array[0];


        for (int i = 1; i < array.length; i++) {
            if (firstName.equals(array[i])) {
                repeatArray.add(array[i]);
            }
            firstName = array[i];
        }
        return repeatArray;
    }

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
        return mapNames;
    }
}
