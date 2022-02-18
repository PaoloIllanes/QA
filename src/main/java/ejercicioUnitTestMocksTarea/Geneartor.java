package ejercicioUnitTestMocksTarea;


import java.util.ArrayList;
import java.util.List;

public class Geneartor {
    UtilPrime utilPrime;
    public Geneartor(UtilPrime objetoMockeado){
        utilPrime = objetoMockeado;
    }

    public List<Integer> getValuesNumber(int num) throws Exception {
        List<Integer> numbers = new ArrayList<>();
        if(num<1){
            throw new Exception("Numero no valido");

        } else if (num==1) {
            numbers.add(1);
            System.out.println("Values: "+numbers);

        }else if(utilPrime.isPrime(num)){

            for(int i =1;i<=num;i+=2){
                numbers.add(i);
            }
            System.out.println("Values: "+numbers);

        }else{
            for(int i =2;i<=num;i+=2){
                numbers.add(i);
            }
            System.out.println("Values: "+numbers);
        }



        return numbers;
    }
}
