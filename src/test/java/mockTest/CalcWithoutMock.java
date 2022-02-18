package mockTest;

import ejemploMock.Calculator;
import ejemploMock.MultiplicarServicio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalcWithoutMock {


    // PASO2 crear el objeto
    MultiplicarServicio servicioMock = Mockito.mock(MultiplicarServicio.class);

    @Test
    public void verifyFactorial(){
        //PASO 3 crear el metodo y sus comportamiento
        Mockito.when(servicioMock.multiplicar(1,1)).thenReturn(1);
        Mockito.when(servicioMock.multiplicar(1,2)).thenReturn(2);
        Mockito.when(servicioMock.multiplicar(2,3)).thenReturn(6);

        // PASO 4 enviar el objeto mockeado en el constrcutor
        Calculator calculadoraMock = new Calculator(servicioMock);
        int expectedResult=6;
        int actualResult=calculadoraMock.getFactorial(3);
        Assertions.assertEquals(expectedResult,actualResult,"Error el factorial el incorrecto");

        // verificacion mocks
        Mockito.verify(servicioMock).multiplicar(1,1);
        Mockito.verify(servicioMock).multiplicar(1,2);
        Mockito.verify(servicioMock).multiplicar(2,3);
    }

}
