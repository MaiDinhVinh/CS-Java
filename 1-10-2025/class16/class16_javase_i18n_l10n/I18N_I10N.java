/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class16_javase_i18n_l10n;

import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class I18N_I10N {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        {
//            System.out.print("What's your name?");
//            String name = sc.nextLine();
//            System.out.println("Hello" + " " + name);
//
//            System.out.print("Which year were you born?");
//            int year = sc.nextInt();
//            int age = LocalDate.now().getYear() - year;
//
//            System.out.println("Your age is" + " " + age);
        }

        /**
         * I18N I10N
         */
        {
//            Locale locale = new Locale("vn", "VN");
            Locale locale = new Locale("th", "TH");
//            Locale locale = new Locale("en", "US");
            ResourceBundle message =
                    ResourceBundle.getBundle("class16_javase_i18n_l10n/MessagesBundle", locale);
            System.out.print(message.getString("ask.name"));
            String name = sc.nextLine();
            System.out.println(message.getString("greet") + " " + name);

            System.out.print(message.getString("ask.birth.year"));
            int year = sc.nextInt();
            int age = LocalDate.now().getYear() - year;

            System.out.println(message.getString("ans.age") + " " + age);
        }

    }
}
