/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaconstrutores;

/**
 *
 * @author vilson.moro
 */
public class SobrecargaConstrutores {

    
    public static void main(String[] args) {
      /*  Pessoa p1 = new Pessoa();
      //  p1.nome = "Jose";
        p1.idade = 45;
        p1.peso = 90;
        p1.altura = 1.66f;
        p1.display();*/
        
        Pessoa p2 = new Pessoa("Henrique");
        p2.display();
        
        Pessoa p3 = new Pessoa("Pedro", 30, 95, 1.69f);
        p3.display(); 
        
        p3.setNome("Pedro da Silva");
        System.out.println(p3.getNome());
    }
    
}
