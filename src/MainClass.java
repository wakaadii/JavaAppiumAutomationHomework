import org.junit.Assert;
import org.junit.Test;

public class MainClass {
    public int getLocalNumber() {
        return(14);
    }

    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("class GetLocalNumber don't return 14", this.getLocalNumber() == 14);
    }
}
