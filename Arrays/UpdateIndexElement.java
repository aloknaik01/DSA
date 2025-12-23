package Arrays;

import java.util.Scanner;

public class UpdateIndexElement {
    public static void main() {
        System.out.println("Enter a valid Index");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println("Enter value");
        int val = sc.nextInt();

        int arr[] = { 2 , 5, 6, 7, 4};


        int res = getudateIndexElement(arr, key, val);
        System.out.println("Revious value of index " + key + " is : " + res);

    }

    static int getudateIndexElement(int a[], int key, int val)
    {
        if(key < 0 || key >= a.length) return -1;
        int temp = a[key];
        a[key] = val;
        return temp;
    }


}
