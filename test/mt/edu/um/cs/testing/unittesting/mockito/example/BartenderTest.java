package mt.edu.um.cs.testing.unittesting.mockito.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class BartenderTest {

    private Bartender bartender;

    @Mock
    private Drink drink;

    @Mock
    private Ingredients ingredients;

    @Before
    public void beforeTest() {
        bartender = new Bartender();
    }

    @Test
    public void testUsersIngredients() {

        bartender.mixDrink(drink, ingredients);

        verify(ingredients).getIngredients();
    }

    @Test
    public void testShakesDrink() {
        bartender.mixDrink(drink, ingredients);

        verify(drink).shake();
    }

    @Test
    public void testVerifyOrder() {
        bartender.mixDrink(drink, ingredients);

        final InOrder inOrder = inOrder(drink, ingredients);
        inOrder.verify(ingredients).getIngredients();
        inOrder.verify(drink).shake();
    }
}
