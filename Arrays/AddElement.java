package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {

    static Scanner sc = new Scanner(System.in);

    public static void main() {

        int arr[] = { 1 ,2 ,3 ,4 ,5 ,6};
        System.out.println("1. Add Element at First");
        System.out.println("2. Add Element at Last");
        System.out.println("3. Add Element at given index");

        System.out.println("Choose 1 of above");
        int choise = sc.nextInt();

        switch (choise) {
            case 1: addAtFirst(arr);
            break;
            case 2 : addAtLast(arr);
            break;
            case 3: addAtIndex(arr);
            break;
            default:
                System.out.println("Invalid Choise");
            break;
        }
    }

    static void addAtFirst(int a[])
    {
        System.out.println("Enter a int value");
        int val = sc.nextInt();
        a[0] = val;
        System.out.println(Arrays.toString(a));
    }

    static void addAtLast(int a[])
    {
        System.out.println("Enter a int value");
        int val = sc.nextInt();
        a[a.length - 1] = val;
        System.out.println(Arrays.toString(a));
    }


    static void addAtIndex(int a[])
    {
        System.out.println("Choose Valid index");
        int index = sc.nextInt();

        if(index < 0 || index > a.length)
        {
            System.out.println("Invalid index");
        }
 else {
        System.out.println("Enter a int value");
        int val = sc.nextInt();
        a[index] = val;
        System.out.println(Arrays.toString(a));
    }
    }
}
