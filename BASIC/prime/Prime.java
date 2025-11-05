import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        boolean isPrime = false;

        if (num >= 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        }
        
        System.out.println(isPrime ? "Prime" : "Not Prime");

        sc.close();
    }
}