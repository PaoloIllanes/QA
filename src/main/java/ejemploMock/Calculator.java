package ejemploMock;

public class Calculator {

    MultiplicarServicio multiplicarServicio;
    public Calculator(){
        multiplicarServicio =  new MultiplicarServicio();
    }

    public int getfactorial(int number){
        int fact=1;
        for (int i = 1; i <=number ; i++) {
            fact=multiplicarServicio.multiplicar(fact,i);
        }
        return fact;
        }
    }


