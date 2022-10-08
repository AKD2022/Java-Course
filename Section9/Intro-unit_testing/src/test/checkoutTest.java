package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import src.main.Main;
import org.junit.Test;


public class checkoutTest{
    @Test
    public void subtotalIsValid() {
        assertEquals(19.2, Main.getSubtotal());
    }
}
