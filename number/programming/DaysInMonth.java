package number.programming;

import java.util.Scanner;

public class DaysInMonth {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = sc.nextInt();
        System.out.println("Enter a month");
        int month = sc.nextInt();

        System.out.
                println("There is " +  daysInMonth(year, month) +
                        " in The month of " + month + " of the Year " + year );
    sc.close();
    }

    static int daysInMonth(int year, int month)
    {
        return
        (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) ?
                31 : month == 2 ? (year % 4 ==0 && year % 100 != 0) || (year%400 == 0) ?  29 :  28 : 31;
    }
    }
//input :-
//Enter a Year
//2024
//Enter a month
//2


//Output : -
//There is 29 in The month of 2 of the Year 2024


//input :-

//Enter a Year
//2025
//Enter a month
//4

//Output : -
//There is 31 in The month of 4 of the Year 2025
