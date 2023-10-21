import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {


    @BeforeEach
    void init(TestInfo testInfo) {
        String callingTest = testInfo.getTestMethod().get().getName();
        System.out.println("Before " + callingTest);
    }

    @AfterEach
     void after(TestInfo testInfo) {
        String callingTest = testInfo.getTestMethod().get().getName();
        System.out.println("After " + callingTest);
    }

    @BeforeAll
    static void init() {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void after() {
        System.out.println("After all tests");
    }


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