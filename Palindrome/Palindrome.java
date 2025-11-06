package Palindrome;

public class Palindrome {
    public static void main(String[] args) {
        String word = "MOM";
        boolean res = isPalindrome(word);
        if (res)
            System.out.println("Palindrome");
        else
            System.out.println("not palindrome");
    }

    public static boolean isPalindrome(String word) {

        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            rev += ch;
        }

        if (rev.equals(word))
            return true;
        else
            return false;
    }
}
