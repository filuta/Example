
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test public void testHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, World!", helloWorld.getMessage());
        helloWorld.setMessage("test");
        assertEquals("test", helloWorld.getMessage());
    }
    
    @Test
    public void testHelloWorldFail() {
    	fail("Failed test");
    }
}
