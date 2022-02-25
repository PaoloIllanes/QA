package compareJSONTest;

import compareJSON.CompareJSON;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CompareJSONTest {



    @Test
    public void JSONTestCorrect() throws IOException {
        CompareJSON cJson =  new CompareJSON();
        String actual = cJson.compare("{\"Name\":\"Jhon\",\"Age\":\"22\"}","{\"Name\":\"Jhon\",\"Age\":\"44\"}");
        String expected ="Los JSON son iguales";

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void JSONTestInCorrect() throws IOException {
        CompareJSON cJson =  new CompareJSON();
        String actual = cJson.compare("{\"Name\":\"Jhon\",\"Age\":\"22\"}","{\"Name\":\"Jhon\",\"Age\":\"44\"}");
        String expected ="Los valores de Age son diferentes : Expected : 22 Actual : 44";

        Assertions.assertEquals(expected,actual);

    }


    @Test
    public void JSONTestInvalid() throws IOException {
        CompareJSON cJson =  new CompareJSON();
        String actual = cJson.compare("{\"Name\":\"Jhon\",\"Age\":\"22\",\"Note\":\"33\"}","{\"Name\":\"Jhon\",\"Age\":\"44\"}");
        String expected ="EL JSON actual no contiene la propiedad : Note";

        Assertions.assertEquals(expected,actual);

    }

}
