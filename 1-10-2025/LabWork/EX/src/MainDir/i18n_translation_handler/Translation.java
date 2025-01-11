package MainDir.i18n_translation_handler;

import java.util.Locale;
import java.util.ResourceBundle;

public class Translation {
    private static Locale currentLocale;

    private static ResourceBundle translator;

    static{
        currentLocale = Locale.ENGLISH;
        Locale.setDefault(currentLocale);
        translator = ResourceBundle.getBundle("MainDir/MessagesBundle");
    }

    public static void setLocale(Locale newLocale){
        Locale.setDefault(newLocale);
        translator = ResourceBundle.getBundle("MainDir/MessagesBundle");
    }

    public static Locale getLocale(){
        return currentLocale;
    }

    public static ResourceBundle getTranslator(){
        return translator;
    }
}
