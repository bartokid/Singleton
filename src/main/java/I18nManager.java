import java.util.HashMap;
import java.util.ResourceBundle;
//import java.util.logging.Logger;
import org.apache.log4j.*;
public class I18nManager {
    static Logger logger = Logger.getLogger(I18nManager.class);
    private HashMap<String, ResourceBundle> data;
    private static I18nManager single_instance = null;
    private I18nManager(){
        //crear hashmap
    }
    public static I18nManager getInstance()
    {
        if (single_instance == null)
            single_instance = new I18nManager();

        return single_instance;
    }


    public String getText(String property, String key){
        return "hola";
    }

    public String getString(String lang, String key) {
        ResourceBundle rs = data.get(lang);

        if (rs == null) {
            logger.info("classloader");
            rs = ResourceBundle.getBundle(lang);
            data.put(lang, rs);
        }
        return rs.getString(key);
    }
}
