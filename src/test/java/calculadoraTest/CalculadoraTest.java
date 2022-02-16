package calculadoraTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import withoutUnitTest.Calculadora;

public class CalculadoraTest {

    @ParameterizedTest
    @CsvSource({"2,2,4",
            "3,3,6",
            "2,7,9",
            "-1,2,1"
    })
    public void sumarTest(int a, int b, int result){

        Calculadora calculadora =  new Calculadora();


        int testRes = calculadora.suma(a,b);

        Assertions.assertEquals(result,testRes,"Error en la suma");

    }


    @Test
    @Disabled
    public void restarTest(){

        Calculadora calculadora =  new Calculadora();

        int expected = 1;
        int result = calculadora.resta(8,7);

        Assertions.assertEquals(expected,result,"Error en la suma");

    }
    @Test
    @Timeout(value =2)
    public void mulTest(){

        Calculadora calculadora =  new Calculadora();

        int expected = 56;
        int result = calculadora.multiplicacion(7,8);

        Assertions.assertEquals(expected,result,"Error en la suma");

    }

    @Test
    public void divTest(){

        Calculadora calculadora =  new Calculadora();
        Assertions.assertThrows(ArithmeticException.class,()->{calculadora.division(2,0);});


    }
}
