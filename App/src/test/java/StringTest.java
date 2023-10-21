import org.junit.jupiter.api.Test;

import static java.lang.Character.isUpperCase;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringTest {
    @Test
    public void testUpper(){
        assertEquals("FOO", "foo".toUpperCase());
    }
    @Test
    public void testIsUpper(){
        assertTrue(isUpperCase('C'));
    }

}
