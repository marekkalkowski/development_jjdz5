
public class Calculator {

//    double addReslut;
//    double substructReslut;
//    double divideReslut;
//    double multiplyResult;
    double x;
    double y;
    double result;
    int operationType;
    String nazwa;

    public Calculator (){};

    public Calculator (double x, double y){
        this.x = x;
        this.y = y;
    };


    public double add (){ return result = x + y; }

    public double substruct (){ return result = x - y;}

    public double divide (){ return result = x /y;}

    public double multiply () {return result = x * y;}




}
