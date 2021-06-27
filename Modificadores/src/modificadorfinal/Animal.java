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
public class Animal {
   public String raca;
   public String cor;
   
   /*não pode ser sobrescrito em classe filha*/
   public final void barulho(){
       System.out.println("barulho animal");
   }
   
   public void comer(){
      System.out.println("comer animal"); 
   }
}
