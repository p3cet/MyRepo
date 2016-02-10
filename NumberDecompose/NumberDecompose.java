/*
http://www.codewars.com/kata/decompose-a-number/java 
*/
package numberdecompose;

import java.util.*;

public class NumberDecompose {

 public static long[][] decompose(long n) {
        if (n<=3) return new long[][]{{},{n}};
        long nn=n;
        List<Long> ll=new LinkedList<>();
        long num=2;
        long counter=0;
        do {
          counter=calc(n,num);
          if (counter>=2) {
            ll.add(counter);
            n=n-(long)Math.pow(num,counter);
            counter=0;
            num++;
          }
          else break;
        } while(n>=(num*num));
        long[][] tab=new long[2][];
        if (!ll.isEmpty()) tab[0]=new long[ll.size()];
        tab[1]=new long[1];
        tab[1][0]=n;
        for (int l=0;l<ll.size();l++)
          tab[0][l]=ll.get(l);
        return tab;
    }
    
    private static long calc(long n, long x) {
      long counter=0;
      do {
        n=n/x;
        counter++;
      } while (n>=x);
      return counter;
    }
    public static void main(String[] args) {
        long[][] a=decompose(28);
    }
    
}
