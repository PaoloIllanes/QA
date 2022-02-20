package ejercicio3StaticTest;


import ejercicio3MockStatic.ConverterStatic;
import ejercicio3MockStatic.ExchangeStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class ExchangeStaticTest {


    @BeforeAll
    public static void before(){
        MockedStatic<ConverterStatic> mocked = Mockito.mockStatic(ConverterStatic.class);
        mocked.when(()->ConverterStatic.convertirMonedaSt("dolar","boliviano")).thenReturn(7.00);
        mocked.when(()->ConverterStatic.convertirMonedaSt("euro","boliviano")).thenReturn(8.00);
        mocked.when(()->ConverterStatic.convertirMonedaSt("euro","dolar")).thenReturn(1.14);
    }

    @Test
    public void verifyConvertion1(){
        ExchangeStatic exchangeStatic = new ExchangeStatic();
        String expected ="La cantidad convertida fue de : 700.0 boliviano";
        String actual = exchangeStatic.cambiarMonedaSt(100,"dolar","boliviano");
        Assertions.assertEquals(expected, actual, "ERROR es incorrecto");
    }
    @Test
    public void verifyConvertion2(){
        ExchangeStatic exchangeStatic = new ExchangeStatic();
        String expected="La cantidad convertida fue de : 800.0 boliviano";
        String actual =exchangeStatic.cambiarMonedaSt(100,"euro","boliviano");
        Assertions.assertEquals(expected, actual, "ERROR es incorrecto");
    }
    @Test
    public void verifyConvertion3(){
        ExchangeStatic exchangeStatic = new ExchangeStatic();
        String expected="La cantidad convertida fue de : 114.0 dolar";
        String actual =exchangeStatic.cambiarMonedaSt(100,"euro","dolar");
        Assertions.assertEquals(expected, actual, "ERROR es incorrecto");
    }

}
