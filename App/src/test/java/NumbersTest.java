import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumbersTest {
    @Test
    void testAbs() {
        assertEquals(Math.abs(-6), 6);
    }
    @RepeatedTest(3)
    public void testIsFinite() {
        assertTrue(Double.isFinite(59));
    }

    @Test
    void testParsing() {
        assertThrows(NumberFormatException.class, () -> Integer.parseInt("hello"));
    }
}
