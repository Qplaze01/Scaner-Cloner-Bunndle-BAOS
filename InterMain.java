package classWorks.lesson2;

import java.util.Locale;
import java.util.ResourceBundle;

public class InterMain {
    public static void main(String[] args) {
        String languuage = "ru";
        String contry = "RU";

        Locale locale = new Locale(languuage, contry);
        ResourceBundle bundle =
                ResourceBundle.getBundle("MessageBundle", locale);
        System.out.println(locale+" Name "+bundle.getString("name"));
    }
}
