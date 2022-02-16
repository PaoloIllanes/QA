import org.junit.jupiter.api.*;

public class BasicSyntaxis {

    @BeforeAll
    public static void oneSetup(){
        System.out.println("Antes de todo test");
    }

    @AfterAll
    public static void endCleanUp(){
        System.out.println("Despues de todo test");
    }

    @BeforeEach
    public void setup(){
        System.out.println("Antes de cada test");
    }
    @AfterEach
    public void cleanUp(){
        System.out.println("Despues de cada test");
    }

    @Test
    public void verifyThing(){
        System.out.println("Probando 1");
    }

    @Test
    public void verifyThin2(){
        System.out.println("Probando 2");
    }


}
