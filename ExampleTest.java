import org.junit.Test;
import static org.junit.Assert.*;
public class ExampleTest {

    @Test public void testFunction_A(){
        Example e = new Example(6, 9);
        assertEquals("Function A incorrect",9, e.Function_A(3));
        assertEquals("Function A incorrect",-10, e.Function_A(-4));
    }

    @Test public void testFunction_B(){
        Example e = new Example(6, 9);
        assertEquals("Function B incorrect",12, e.Function_B(3));
        assertEquals("Function B incorrect",-2, e.Function_B(7));
    }
}
