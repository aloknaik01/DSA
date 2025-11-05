import java.util.Scanner;

class Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number");

        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        int digit = 0;

        while (num != 0) {
            digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;
        }

        if (temp == rev) {
            System.out.println("Palindrome Number");

        } else {

            System.out.println("not palindrome number");
        }


         sc.close();
    }
}