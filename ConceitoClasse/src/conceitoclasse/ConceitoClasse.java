/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitoclasse;

import java.util.Scanner;

/**
 *
 * @author vilson.moro
 */
public class ConceitoClasse {
    
    public static void main(String[] args) {
       /* Pessoa p1 = new Pessoa();
        p1.nome = "João";
        p1.idade = 15;
        p1.peso = 90;
        p1.altura = 1.80f;
        p1.display();
              
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Pedro";
        p2.idade = 45;
        p2.peso = 65;
        p2.altura = 1.95f;
        p2.display(); */ 
        
        Pessoa p3 = new Pessoa();
        System.out.println("Digite seu nome ");
        p3.nome = new Scanner(System.in).nextLine();
        System.out.println("Digite sua idade ");
        p3.idade = new Scanner(System.in).nextInt();
        System.out.println("Digite seu peso ");
        p3.peso = new Scanner(System.in).nextFloat();
        System.out.println("Digite seu altura ");
        p3.altura = new Scanner(System.in).nextFloat();
        p3.display();
        
    }
    
}
