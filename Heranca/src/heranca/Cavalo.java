/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author vilson.moro
 */
public class Cavalo extends Animal {
   String raca;

    public Cavalo() {
    }

    public Cavalo(String raca, float tamanho, String cor) {
       super(tamanho, cor);
       this.raca = raca;
    }
    
   
   public void fugir(){
       System.out.println("Cavalo fugindo");
   }
   
   @Override
   public void comer(){      
       System.out.println("Comer cavalo");
       // super.comer();
   }
}
