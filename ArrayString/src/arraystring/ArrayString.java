/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystring;

/**
 *
 * @author vilson.moro
 */
public class ArrayString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "Hello world";
        
//        System.out.println(frase);
//        System.out.println(frase.charAt(0));
//        System.out.println(frase.length());
         int x = 0;
         while(x < frase.length()){
           System.out.println(frase.charAt(x));  
           x = x + 1;
         }
    }
    
}
