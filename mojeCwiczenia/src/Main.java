public class Main {
    public static void main(String[] args) {

       Tablice tab = new Tablice();
       tab.name = "Marek";
       tab.chars = new char[tab.name.length()];
       tab.chars1 = new char[tab.name.length()];
       tab.chars2 = new char[tab.name.length()];






        for (int i=0; i < tab.chars.length; i++){
           tab.chars[i] = tab.name.charAt(i);

       }
        for (char znak: tab.chars
                ) {
            System.out.print(znak);

        }

//        tab.chars1[0] = 'o';
//       tab.chars1[1] = 'z';
        System.out.println("\n");
        System.out.println(tab.chars1.length);
        System.arraycopy(tab.chars,0,tab.chars1,0,tab.chars1.length );
        System.out.println("\n---------------");

        for (char znak: tab.chars1
                ) {
            System.out.print(znak);
        }
        System.out.println("\n---------------copyOfRange");
        tab.chars2 = java.util.Arrays.copyOfRange(tab.chars,0,3);
//        for (char znak: tab.chars2
//                ) {
//            System.out.print(znak);
//        }
        System.out.println(new String (tab.chars2));

        int z = java.util.Arrays.binarySearch(tab.chars2,'k');
        boolean bol = java.util.Arrays.equals(tab.chars,tab.chars2);
        System.out.println(z + " " + bol);
        System.out.println("..........");
        java.util.Arrays.sort(tab.chars);
        System.out.println(new String (tab.chars));

        System.out.println("??????????????");
        int [] charInt = {1,4,2,8,3,9,5};
        java.util.Arrays.sort(charInt);
        for (int znak: charInt
                ) {
            System.out.println(znak);
        }

        int x = 1;
        int y = 2;
        String result = ! (x==y) ? "prawda" : "fałsz";
        System.out.println(result);

        System.out.println("-------------");

        byte c = 000000;


        char litera = 'b';

        switch (litera){
            case 'a':
                System.out.println("cośtam");
                //break;
            case 'b':
                System.out.println("blablka");
               // break;
            case 'c':
                System.out.println("wlasciwa");
               // break;
            default :
                System.out.println("default");
                break  ;

        }

    }

}
