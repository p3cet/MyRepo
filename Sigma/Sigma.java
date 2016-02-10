// http://www.codewars.com/kata/when-sigma1-function-has-equals-values-for-an-integer-and-its-reversed-one/java
package sigma;

import java.util.*;

public class Sigma {

    public static int equalSigma1(int nmax) 
    {
        if (nmax<528) return 0;
        List<Integer> sigma=new LinkedList<>();
        for (int i=528; i<=nmax;i++) {
            int rev=getReverse(Integer.toString(i));
            if (rev==i) continue;
            if (calcSum(findDivs(i))==calcSum(findDivs(rev))) {
                if (sigma.indexOf(i)==-1){
                    sigma.add(i);
                    if (rev<=nmax) sigma.add(rev);
                }
            }
        }
        System.out.println(sigma.toString());
        return sigma.stream().mapToInt(i->i).sum();
    }
    private static List<Integer> findDivs(int n) {
      List<Integer> divisors = new LinkedList<>();
      divisors.add(1);
      for (int i=2;i<=Math.sqrt(n);i++)
        if (n%i==0) {divisors.add(i);if (n/i!=i) divisors.add(n/i);}
      divisors.add(n);
      return divisors;
    }
    
    private static int calcSum(List<Integer> divs){
        return divs.stream().mapToInt(i->i).sum();
        
    }
    private static int getReverse(String s) {
        StringBuilder ss=new StringBuilder(s);
        return Integer.parseInt(ss.reverse().toString());
    }

    
    public static void main(String[] args) {
        System.out.print(equalSigma1(1600));
    }
    
}
