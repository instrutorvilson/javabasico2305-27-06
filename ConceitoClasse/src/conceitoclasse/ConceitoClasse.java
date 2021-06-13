/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitoclasse;

/**
 *
 * @author vilson.moro
 */
public class ConceitoClasse {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "João";
        p1.idade = 15;
        p1.peso = 90;
        p1.display();
        
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Pedro";
        p2.idade = 45;
        p2.peso = 65;
        
        p2.display();       
     
        
    }
    
}
