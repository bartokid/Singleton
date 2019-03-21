
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class I18nManagerTest {

    @Test
    public void Test(){
        String text1 = I18nManager.getInstance().getText("en", "l1");
        Assert.assertEquals("Hello", text1);

        String text2 = I18nManager.getInstance().getText("es", "l1");
        Assert.assertEquals("Hola", text2);

        String text3 = I18nManager.getInstance().getText("en", "l2");
        Assert.assertEquals("Bye", text3);

        String text4 = I18nManager.getInstance().getText("es", "l2");
        Assert.assertEquals("Adios", text4);
    }
}
