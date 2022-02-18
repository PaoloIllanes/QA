package ejercicioMockTest;

import ejercicioUnitTestMocksTarea.Geneartor;
import ejercicioUnitTestMocksTarea.UtilPrime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class MockPrimeTest {

    UtilPrime utilPrime = Mockito.mock(UtilPrime.class);

    @Test
    public void verifyPrimo() throws Exception {


        Mockito.when(utilPrime.isPrime(13)).thenReturn(true);
        Geneartor geneartor = new Geneartor(utilPrime);
        List<Integer> actualResult = geneartor.getValuesNumber(13);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(3);
        expectedResult.add(5);
        expectedResult.add(7);
        expectedResult.add(9);
        expectedResult.add(11);
        expectedResult.add(13);
        Assertions.assertEquals(expectedResult,actualResult,"Error respuesta incorrecta");
        Mockito.verify(utilPrime).isPrime(13);


    }

    @Test
    public void verifyNoPrimo() throws Exception {


        Mockito.when(utilPrime.isPrime(10)).thenReturn(false);
        Geneartor geneartor = new Geneartor(utilPrime);
        List<Integer> actualResult = geneartor.getValuesNumber(10);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);
        expectedResult.add(10);
        Assertions.assertEquals(expectedResult,actualResult,"Error respuesta incorrecta");
        Mockito.verify(utilPrime).isPrime(10);


    }
    @Test
    public void verifyInvalidNum() throws Exception {

        Geneartor geneartor = new Geneartor(utilPrime);
        Assertions.assertThrows(Exception.class, ()-> {geneartor.getValuesNumber(0);} );


    }
    @Test
    public void verifyInvalidOne() throws Exception {

        Geneartor geneartor = new Geneartor(utilPrime);
        Assertions.assertThrows(Exception.class, ()-> {geneartor.getValuesNumber(0);} );


    }


}
