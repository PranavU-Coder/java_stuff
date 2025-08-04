import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CookingTest {
  
    @Test

    public void returnChef(){

        Chef pranav = new Chef();
        assertEquals("Yep, I am a Chef!",pranav.Master());
    }
}