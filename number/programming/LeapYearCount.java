package number.programming;

import java.time.LocalDate;

public class LeapYearCount {
    static void main() {
    int currentYear = LocalDate.now().getYear();
        System.out.println("There is total " + countLeapYearByLoop(currentYear)
        + " no of leap year till " + currentYear);
    }

    //by using for loop
    static int countLeapYearByLoop(int currentYear)
    {
        int count = 0;
        for(int year=1; year<=currentYear; year++)
        {
            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
               count++;
        }

        return count;
    }
}
