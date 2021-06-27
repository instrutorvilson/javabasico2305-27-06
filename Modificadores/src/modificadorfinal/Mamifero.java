/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadorfinal;

/**
 *
 * @author vilson.moro
 */
public class Mamifero extends Animal{
   public int mamas; 
   
   
   @Override
   public final void comer(){
      System.out.println("comer mamifero"); 
   }
}
