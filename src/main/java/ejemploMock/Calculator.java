package ejemploMock;

public class Calculator {

    MultiplicarServicio multiplicarServicio;
    public Calculator(MultiplicarServicio servicioMock){
        multiplicarServicio =  new MultiplicarServicio();
    }

    public int getFactorial(int number){
        int fact=1;
        for (int i = 1; i <=number ; i++) {
            fact=multiplicarServicio.multiplicar(fact,i);
        }
        return fact;
        }
    }


