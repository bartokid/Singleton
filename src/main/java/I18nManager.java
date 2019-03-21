import java.util.HashMap;
import java.util.ResourceBundle;

public class I18nManager {

    private HashMap<String, ResourceBundle> data;
    public static void  getInstance(){}


    public String getString(String lang, String key) {
        ResourceBundle rs = data.get(lang);

        if (rs == null) {
            //logger.info("classloader")
            rs = ResourceBundle.getBundle(lang);
            data.put(lang, rs);
        }
        return rs.getString(key);
    }
}
