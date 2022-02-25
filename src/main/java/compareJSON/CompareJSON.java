package compareJSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CompareJSON {
    public String compare(String expectedJSON, String actualJSON) throws IOException {
        String msg="Los JSON son iguales";
        ObjectMapper mapper = new ObjectMapper();
        try {

            Map<String, String> expected = mapper.readValue(expectedJSON,HashMap.class);
            Map<String, String> actual = mapper.readValue(actualJSON, HashMap.class);
            System.out.println(expected);
            System.out.println(actual);


            for (HashMap.Entry<String, String> entry : expected.entrySet()) {
                String expectedKey = entry.getKey();
                String expectedValue = entry.getValue();
                boolean actualContainsKey =actual.containsKey(expectedKey) ;
                String actualValue = actual.get(expectedKey);
             if(!actualContainsKey){
                 msg = "EL JSON actual no contiene la propiedad : "+expectedKey;
                 break;
             }else if(!expectedValue.equals(actualValue)){
                 msg = "Los valores de "+expectedKey+" son diferentes : "+"Expected : "+expectedValue+ " Actual : "+actualValue;
                 break;

             }



            }


        } catch (IOException e) {
            e.printStackTrace();
        }


        return msg;
    }
}
