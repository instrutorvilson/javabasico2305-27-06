/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculaidade;

import java.util.Scanner;

public class CalculaIdade {

   
    public static void main(String[] args) {
        String nome;
        
        Scanner tela = new Scanner(System.in);
        System.out.print("Informe nome: ");
        nome = tela.nextLine();
        
        System.out.print("Informe idade: ");
        int idade = tela.nextInt();
        
        if(idade < 18){
            System.out.println(nome + " você é menor de idade, nada de cachaça!");
        }
        else{
           System.out.println(nome + " você é maior de idade, pode cachaça!");
        }
    }
    
}
