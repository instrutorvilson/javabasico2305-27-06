/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeabstrata;

/**
 *
 * @author vilson.moro
 */
public class ClasseAbstrata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
          Não pode ser instanciado objeto de uma classe abstrata
        */        
        //Animal animal = new Animal();
        
        Cavalo cavalo = new Cavalo();
        cavalo.raca = "manga larga";
        cavalo.sleep();
    }
    
}
