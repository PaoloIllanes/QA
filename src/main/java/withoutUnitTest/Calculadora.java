package withoutUnitTest;

public class Calculadora {

    public Calculadora(){}

    public static int suma(int a , int b){
        return a +b;
    }
    public static int resta(int a , int b){
        return a -b;
    }
    public static int multiplicacion(int a , int b){
        return a *b;
    }
    public static int division(int a , int b){
        return a /b;
    }
    public static void main(String[]args){
        int expected = 11;
        int result = suma(5,6);

        if(expected==result){
            System.out.print("Passed");
        }else{
            System.out.print("Failed");
        }
    }
}
