package AFewTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSomeMath {

    private int x;
    private int y;

    @BeforeEach
    public void setUp(){
        x = 10;
        y = 3;
    }

    @Test
    public void testAddition(){
        assertEquals(x + y, 13);
    }

    @Test
    public void testSubtraction(){
        assertEquals(x - y, 7);
    }
}
