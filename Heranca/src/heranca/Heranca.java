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
        /*Animal animal = new Animal();
        animal.setCor("Vermelho");
        animal.setTamanho(1.80f);
        animal.comer();*/
        
        Animal animal2 = new Animal(0.5f, "branca");
        animal2.comer();
        
       /* Cavalo cavalo = new Cavalo();
        cavalo.raca = "Manga larga";
        cavalo.setCor("tostado cara branca");
        cavalo.setTamanho(2.0f);
        cavalo.fugir();
        cavalo.comer();
        */
       Cavalo cavalo2 = new Cavalo(
               "Quarto de milha", 1.80f,
               "preta com cara branca");
       cavalo2.fugir();
       cavalo2.comer();
       
       
        Leao leao = new Leao();
        leao.setCor("Dourado");
        leao.setTamanho(1.50f);
        leao.juba = true;
        leao.cacar();
        leao.comer();
    }
    
    //polimorfismo -> poli= muitas morfismo=formas
    //sobreescrita -> override
    
}
