package HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testFactorial {
    @Test
    public void testInput0Outout1() {
        int actual = new Factorial().calc(0);
        Assertions.assertEquals(1,actual);
    }
    @Test
    public void testInput3Output6(){
        int actual = new Factorial().calc(3);
        Assertions.assertEquals(6,actual);
    }
    @Test
    public void testNegativeValueInput(){
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> new Factorial().calc(-1));
    }
    @Test
    public void testMaxValue(){
        int maxValue = 16;
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Factorial().calc(maxValue + 1));
    }
}
