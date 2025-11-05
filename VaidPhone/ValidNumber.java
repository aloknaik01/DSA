import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumber {

    public static boolean isValidNum(String number) {

        String exp = "[+]91[6789][0-9]{9}";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(number);

        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String num = "+919966543210";
        boolean res = isValidNum(num);

        if (res) {
            System.out.println(num + " is valid number");
        } else {
            System.out.println(num + " is invalid number");
        }
    }
}