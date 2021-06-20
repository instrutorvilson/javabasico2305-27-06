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
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.cor = "Vermelho";
        animal.tamanho = 1.80f;
        animal.comer();
        
        Cavalo cavalo = new Cavalo();
        cavalo.raca = "Manga larga";
        cavalo.cor = "tostado cara branca";
        cavalo.tamanho = 2.0f;
        cavalo.fugir();
        cavalo.comer();
    }
    
}
