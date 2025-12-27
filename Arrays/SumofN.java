package Arrays;

public class SumofN {
    public static void main() {
 int arr[] = {1, 2, 3, 9,4, 5}; //24
     int sum = sumofN(arr);
        System.out.println(sum);
        int sum2 = sumofN2(arr);
        System.out.println(sum2);
        int sum3 = findSumofNEle(arr);
        System.out.println(sum3);
    }

    static int sumofN(int a[])
    {
        int res = 0;
        for(int i=0; i<a.length; i++)
        {
            res+=a[i];
        }

        return res;
    }

    static int sumofN2(int a[])
    {

        int max = Integer.MIN_VALUE;
        int res = 0;
        for(int e:a )
        {
            if(e > max) max=e;
        }

        return (max * (max + 1))/2;
    }


    static int findSumofNEle(int a[])
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int e: a)
        {
            if(e < min) min=e;
            if(e > max) max=e;
        }

        int sum1 = (min * ( min-1))/2;
        int sum2 = (max * (max+1))/2;

        return sum2-sum1;


    }
}


