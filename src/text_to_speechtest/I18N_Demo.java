
package text_to_speechtest;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18N_Demo 
{
    public static void main(String args[]) 
    {
        Locale locale=Locale.US;
        ResourceBundle rb=ResourceBundle.getBundle("text_to_speechtest.MessageBundle",locale);
        System.out.println(rb.getString("number"));
       // ResourceBundle rb2=ResourceBundle.getBundle("text_to_speechtest.MessageBundle",locale);
        System.out.println(rb.getString("number"));
        Locale.setDefault(new Locale("in","bn"));
         ResourceBundle rb1=ResourceBundle.getBundle("text_to_speechtest.MessageBundle");
         System.out.println(rb1.getString("number"));
    }
    
}
