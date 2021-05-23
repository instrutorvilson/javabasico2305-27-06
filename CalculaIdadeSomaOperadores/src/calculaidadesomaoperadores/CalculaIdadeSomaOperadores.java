/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculaidadesomaoperadores;

import java.util.Scanner;

/**
 *
 * @author vilson.moro
 */
public class CalculaIdadeSomaOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String msg="";
       
        Scanner tela = new Scanner(System.in);
        System.out.println("Informe nome: ");
        String nome = tela.nextLine();
        
        System.out.println("Informe idade");
        int idade = tela.nextInt();
        
        if(idade < 11){
            msg = "criança";
        }
        
        if((idade > 10) && (idade <= 14)){
            msg = "pré-adolescnte";
        }
        
        if( (idade > 14) && (idade <= 18)){
            msg = "adolescnte";
        }
            
        if((idade > 18) && (idade <= 50)){
            msg = "Adulto";
        }
        
        if(idade > 50)
            msg="terceria idade";
        
        System.out.println(nome + " você é " + msg);
    }
    
}
