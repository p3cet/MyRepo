//http://www.codewars.com/kata/54d22119beeaaaf663000024

package shadesofgrey;

import java.util.*;

public class ShadesOfGrey {

    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shadesOfGrey(50)));
    }
    
    static String[] shadesOfGrey(int num) {
        if (num<1) return new String[]{};
        String[] grey=new String[Math.min(num,254)];
        for (int i=1;i<=Math.min(num,254);i++) {
            /*String hex=Integer.toString(i, 16);
            if (i<=15) grey[i-1]="#0"+hex+"0"+hex+"0"+hex;
            else grey[i-1]="#"+hex+hex+hex;*/
            grey[i-1]=String.format("#%02x%02x%02x", i, i, i);
        }
        
        return grey;
        
    }
    
}
