import org.junit.Test;
import org.junit.Assert;

public class MyStringUtilTest {

    @Test
    public void testDashCase() {

        String camelCased = "SomeTestString";
        String dashCased = MyStringUtil.dashCase(camelCased);
        
        Assert.assertEquals("some-test-string", dashCased);
    }
}
