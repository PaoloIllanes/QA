package ejercicio3Test;

import ejercicio3.Converter;
import ejercicio3.Exchange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



public class ExchangeTest {

    Converter converter = Mockito.mock(Converter.class);

    @Test
    public void verifyChange1()  {


        Mockito.when(converter.convertirMoneda("dolar","boliviano")).thenReturn(7.00);
        Exchange exchange = new Exchange(converter);
        String actualResult = exchange.cambiarMoneda(100,"dolar","boliviano");
        String expectedResult = "La cantidad convertida fue de : 700.0 boliviano";

        Assertions.assertEquals(expectedResult,actualResult,"Error respuesta incorrecta");
        Mockito.verify(converter).convertirMoneda("dolar","boliviano");


    }
    @Test
    public void verifyChange2()  {


        Mockito.when(converter.convertirMoneda("euro","boliviano")).thenReturn(8.00);
        Exchange exchange = new Exchange(converter);
        String actualResult = exchange.cambiarMoneda(100,"euro","boliviano");
        String expectedResult = "La cantidad convertida fue de : 800.0 boliviano";

        Assertions.assertEquals(expectedResult,actualResult,"Error respuesta incorrecta");
        Mockito.verify(converter).convertirMoneda("euro","boliviano");


    }
    @Test
    public void verifyChange3()  {


        Mockito.when(converter.convertirMoneda("dolar","euro")).thenReturn(1.14);
        Exchange exchange = new Exchange(converter);
        String actualResult = exchange.cambiarMoneda(100,"dolar","euro");
        String expectedResult = "La cantidad convertida fue de : 114.0 euro";

        Assertions.assertEquals(expectedResult,actualResult,"Error respuesta incorrecta");
        Mockito.verify(converter).convertirMoneda("dolar","euro");


    }
    @Test
    public void verifyInvalidCoin()  {



        Exchange exchange = new Exchange(converter);
        String actualResult = exchange.cambiarMoneda(100,"real","boliviano");
        String expectedResult = "La moneda no es valida";

        Assertions.assertEquals(expectedResult,actualResult,"Error respuesta incorrecta");



    }


}
