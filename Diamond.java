
//https://www.codewars.com/kata/give-me-diamond/java

package diamond;

import java.util.Arrays;


public class Diamond {

    public static void main(String[] args) {
        System.out.println(print(9));
    }
    
    
    public static String print(int n) {
        if (n%2==0 || n<0) return null;
        return createDiamond(n);
    }
  
    private static String createDiamond(int n) {
      String[] diamond= new String[n];
      int stars=1;
      diamond[n/2]=renderLine(n, 0);
      for (int i=0;i<n/2+1;i++) {
        diamond[i]=diamond[n-1-i]=renderLine(stars,(n-stars)/2);
        stars+=2;
      }
      return Arrays.toString(diamond).replaceAll(", ", "")
              .replace("[", "")
              .replace("]", "");
      
    }
    
    private static String renderLine(int stars, int spaces) {
      StringBuilder ss = new StringBuilder();
      for (int i=0;i<spaces;i++)
          ss.append(" ");
      for (int i=0;i<stars;i++)
          ss.append("*");
      ss.append("\n");
      return ss.toString();
    }
}
