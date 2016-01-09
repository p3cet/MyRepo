/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertcast;

/**
 *
 * @author Zwyr
 */
public class ConvertCast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Tests");
        
        int digit=43;
        
        //cast int to char
        char a=(char)digit;
        System.out.println("Int="+digit+" to char casted: "+ a);  //+
        
        //cast char to int
        a='a';
        digit=(int)a;
        System.out.println("char="+a+" casted to int: "+digit);  //97
        
        //conver char to int
        System.out.println("char 6 converted to int");
        a='6';
        digit=Character.digit(a, 10);
        System.out.println(digit);
        digit=Character.getNumericValue(a);
        System.out.println(digit);
        System.out.println("char a casted to int");
        digit=(int)a;
        System.out.println(digit);
        
        //int to string
        String ss=Integer.toString(digit);
        System.out.println("int="+digit+" converted to string decimal: "+ss);  
        digit=8;
        ss=Integer.toString(digit, 2);
        System.out.println("int="+digit+" converted to string binary: "+ss);
        
        //String to int
        digit=Integer.parseInt(ss);
        System.out.println(digit);
        digit=Integer.parseInt(ss,2);
        System.out.println(digit);
        
        //string to int exception
        try {
            digit=Integer.parseInt("Ala");
        }
        catch (NumberFormatException e) {
            System.out.println("wrong format!");
        }
        
        //string to float
        ss="22.3";                          //22,3 throws exception
        try{
            float f=Float.parseFloat(ss);   //also Float.valueOf() can be used - 
                                            //returns Integer and is not static(?)
            System.out.println(f);
        }
        catch (NumberFormatException e) {
            System.out.println("wrong format!");
        }
        
    }
    
}
