package notasTest;

import ejemplo1.Nota;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import withoutUnitTest.Calculadora;

public class NotasTest {
    /*0-70 Esfuerzate mas tu nota es: NN
71-80 Bien mas tu nota es: NN
81-90 Muy bien mas tu nota es: NN
91-100 Excelente mas tu nota es: NN*/

    @ParameterizedTest
    @CsvSource({
            "-1,La nota no es correcta",
            "0,Esfuerzate mas tu nota es: 2",
            "1,Esfuerzate mas tu nota es: 2",
            "29,Esfuerzate mas tu nota es: 2",
            "30,Esfuerzate mas tu nota es: 2",
            "31,Esfuerzate mas tu nota es: 2",
            "69,Esfuerzate mas tu nota es: 2",
            "70,Esfuerzate mas tu nota es: 2",

            "71,Bien mas tu nota es: 2",
            "72,Bien mas tu nota es: 2",
            "74,Bien mas tu nota es: 2",
            "75,Bien mas tu nota es: 2",
            "76,Bien mas tu nota es: 2",
            "79,Bien mas tu nota es: 2",
            "80,Bien mas tu nota es: 2",

            "81,Muy bien, mas tu nota es: 2",
            "82,Muy bien, mas tu nota es: 2",
            "85,Muy bien, mas tu nota es: 2",
            "86,Muy bien, mas tu nota es: 2",
            "87,Muy bien, mas tu nota es: 2",
            "89,Muy bien, mas tu nota es: 2",
            "90,Muy bien, mas tu nota es: 2",

            "91,Excelente, mas tu nota es: 2",
            "92,Excelente, mas tu nota es: 2",
            "94,Excelente, mas tu nota es: 2",
            "95,Excelente, mas tu nota es: 2",
            "96,Excelente, mas tu nota es: 2",
            "99,Excelente, mas tu nota es: 2",
            "100,Excelente, mas tu nota es: 2",
            "101,La nota no es correcta",

    })
    public void verificarNotas(int note,String expectedRes){

        Nota nota  = new Nota();
        String actualResult= nota.obtenerMensaje(note);

        Assertions.assertEquals(actualResult,expectedRes);

    }

}
