/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadores;

import classes.Pessoa;
import modificadorfinal.Animal;
import modificadorfinal.Mamifero;


public class Modificadores {

      public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Vilson";
        pessoa.setCpf("12345678910");
        
        Animal animal = new Animal();
        animal.raca = "Dinossauro";
        animal.cor = "verde";
        animal.barulho();
        animal.comer();
        
          Mamifero vaca = new Mamifero();
          vaca.barulho();
    }
    
}
