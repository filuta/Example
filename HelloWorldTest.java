
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

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
    
    @Test
    public void testHelloWorldSometimesFail() {
    	if ((new Random()).nextInt(2) > 0) {
    		fail("Random fail");
    	}
    }
}
