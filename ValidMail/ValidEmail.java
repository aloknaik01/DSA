package ValidMail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {

    public static boolean isValidMail(String email) {
        String exp = "[a-z0-9]{6,32}[@]gmail[.]com";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(email);

        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String email = "aloknaik016261@gmail.com";

        boolean res = isValidMail(email);
        if (res) {
            System.out.println(email + " is a valid Email");
        }

        else {
            System.out.println(email + " is a invalid Email");
        }
    }
}
