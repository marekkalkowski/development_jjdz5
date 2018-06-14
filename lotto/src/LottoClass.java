import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class LottoClass {

    private int range;
    private int number;

   // Map <Integer,Integer> mapa = new HashMap<>();
    Set <Integer> pickedNumbers= new TreeSet<>();
    //Set <Integer> setint = new TreeSet<>();

   // List <Set> sortedLIst = new ArrayList<>();

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Set shuffle(){
        for (int i = 1; i <= number; i++ ){

            int z =(int) (Math.random()*range + 1);
            if (pickedNumbers.contains(z)){i--;continue;}
            System.out.println(z);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pickedNumbers.add(z);
        }
       // pickedNumbers;

        return pickedNumbers;
    }


    public static void save(Set<Integer> obj, String path) throws Exception {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(
                    new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            for (Integer s : obj) {
                pw.println(s);
            }
            pw.flush();
        } finally {
            pw.close();
        }
    }


}
