package Arrays;

import java.util.Arrays;

public class LastLarge {
    static void main() {
        int n[] = {1, 8, 3, 4, 5};
        int res[] = lastarge(n);
        System.out.println(Arrays.toString(res));
    }
    static int[] lastarge(int a[])
    {
      for(int i=0; i<a.length-1; i++)
      {
          if(a[i] > a[i+1])
          {
              int temp = a[i];
              a[i] = a[i+1];
              a[i+1] = temp;

          }
      }

      return a;
    }
}
