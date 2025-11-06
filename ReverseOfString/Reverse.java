public class Reverse {
    public static void main(String[] args) {
        String res = reverse("ALOK");
        System.out.println(res);
    }

    public static String reverse(String word) {
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char ch = word.charAt(i);
            rev += ch;
        }
        return rev;
    }
}