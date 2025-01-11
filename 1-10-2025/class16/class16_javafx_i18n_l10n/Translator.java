/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class16_javafx_i18n_l10n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Administrator
 */
public class Translator {
    private static ResourceBundle translator;
    private static Locale currentLocale;
    
    static {
        currentLocale = Locale.ENGLISH;
        Locale.setDefault(currentLocale); //set locale to all application
        translator = ResourceBundle.getBundle("languages/MessagesBundle");
    }
    
    public static void setLocale(Locale newLocale) {
        Locale.setDefault(newLocale);
        translator = ResourceBundle.getBundle("languages/MessagesBundle");
    }
    
    public static Locale getLocale() {
        return currentLocale;
    }
    
    public static ResourceBundle getResource() {
        return translator;
    }
}
