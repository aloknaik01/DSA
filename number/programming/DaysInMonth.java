package number.programming;

import java.util.Scanner;

public class DaysInMonth {
    static void main() {

        System.out.println("Enter an Year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();

        System.out.
                println("There is " +  daysInMonth(year, month) +
                        " in The month of " + month + " of the Year " + year );
    }

    static int daysInMonth(int year, int month)
    {
        return
        (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) ?
                31 : month == 2 ? (year % 4 ==0 && year % 100 != 0) || (year%400 == 0) ?  29 :  28 : 31;
    }
    }

