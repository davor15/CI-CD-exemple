import org.junit.platform.suite.api.*;

@Suite
@SelectClasses({NumbersTest.class, StringTest.class})
public class AppTestSuite {
}
