import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestMain {

    @Test
    public void testInputIsEven(){
        assertTrue(Main.checkIfInputIsAnEvenNumber(23)); // Assertion
    }

    @Test
    public void testInputIsEven1(){
        assertTrue(Main.checkIfInputIsAnEvenNumber(22)); // Assertion
    }
}
