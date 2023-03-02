import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class TestStringUtils {

    public StringUtils stringUtils = new StringUtils();

    @Test
    public void testStringUtilsConstructor(){

        assertNotEquals(stringUtils,null);
    }
}
