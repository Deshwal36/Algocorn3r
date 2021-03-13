import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * TestJunit
 */
public class TestJunit {

    @Test
    public void add(){
        String str="Junit is working fine";
        assertEquals("Junit  working fine", str);
    }
}

