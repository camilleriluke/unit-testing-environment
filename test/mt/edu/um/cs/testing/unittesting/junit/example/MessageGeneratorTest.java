package mt.edu.um.cs.testing.unittesting.junit.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MessageGeneratorTest {

    private MessageGeneratorFacade messageGeneratorFacade;

    @Before
    public void beforeTest() {

        messageGeneratorFacade = new MessageGeneratorFacadeImpl();
    }

    @Test
    public void testGetMessage() {

        final String message = messageGeneratorFacade.getMessage();

        assertEquals("Hello World!!", message);
    }
}
