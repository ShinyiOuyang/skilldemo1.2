import static org.junit.Assert.*;
import org.junit.*;

public class SubtractorTester {

    @Test
    public void subtractTest1() {
        assertEquals(4, Subtractor.subtract(10, 6));
    }
}
