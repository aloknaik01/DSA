package number.programming;

public class LeapYear {
  public static void main() {
      System.out.println("Enter a year to check Leap year or not");
      int year = new java.util.Scanner(System.in).nextInt();
      System.out.println(year + " is " + (isLeapYear(year) ? "Leap Year" : "Not Leap Year"));
    }

    static boolean isLeapYear(int year)
    {
        return (year % 400 == 0) || (year % 4 ==0 && year % 100 != 0);
    }
}
