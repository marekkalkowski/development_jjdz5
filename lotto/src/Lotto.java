import javax.swing.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Lotto {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        LottoClass losowanie = new LottoClass();


        System.out.println("Podaj zakres liczb:  ");
       losowanie.setRange(scan.nextInt());

        System.out.println("Podaj ilość liczb do wylosowania ");
        losowanie.setNumber(scan.nextInt());

        losowanie.shuffle();

       // int [] aray = {3,1,34,2,5};
        System.out.println(losowanie.pickedNumbers);
        String path = "E:\\developmnet\\lotto\\src\\losowanie.txt";
        losowanie.save(losowanie.pickedNumbers,path);

    }
}
