package mt.edu.um.cs.testing.unittesting.junit.example;

import mt.edu.um.cs.testing.unittesting.junit.example.MessageGeneratorFacade;

public class MessageGeneratorFacadeImpl implements MessageGeneratorFacade {

    @Override
    public String getMessage() {
        return "Hello World!!";
    }

}
