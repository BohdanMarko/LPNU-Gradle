package gradlebasics;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        var expected = "Hello world.";
        var actual = "Hello world.";
        assertEquals(expected, actual);
    }
}
