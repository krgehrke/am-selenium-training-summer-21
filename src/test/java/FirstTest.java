import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FirstTest {

    @BeforeAll
    public static void start(){
        System.out.println("Start Test");
    }

    @Test
    public void actualTest(){
        System.out.println(" Test");
        Assertions.assertEquals(1,66);
    }
    @Test
    public void actualTest1(){
        System.out.println(" Test1");
        Assertions.assertTrue(2>7);
    }

    @AfterEach
    public void end(){
        System.out.println("End Test");
    }



}
