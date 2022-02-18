package ejemploMockStatic;

public class CalculadoraMockStatic {


    public int getFactorial(int n){
        int fact=1;
        for (int i = 1; i <=n ; i++) {
            fact=MultiplicarMockStatic.multiplicar(fact,i);
        }
        return fact;
    }
}
