public class MulitplieArray {


        public static void main(String[] args) {
            String[][] names = {
                    {"Mr. ", "Mrs. ", "Ms. "},
                    {"Smith", "Jones"}
            };
            // Mr. Smith
            System.out.println(names[1][1] + names[1][0]);
            // Ms. Jones
            System.out.println(names[0][2] + names[1][1]);
            String [] [] nazwy = new String[2][3];

            System.arraycopy(names,2,nazwy,2,1);
            System.out.println(nazwy[1][1]);



        }

}
