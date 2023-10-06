import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("class GetLocalNumber don't return 14", this.getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("method getClassNumber is less, than 45", this.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue("method getClassString doesn't contains 'Hello' or 'hello' word", ((this.getClassString().contains("Hello")) | (this.getClassString().contains("hello"))));
    }
}

