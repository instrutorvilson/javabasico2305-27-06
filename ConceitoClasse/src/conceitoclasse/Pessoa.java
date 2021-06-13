/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitoclasse;

public class Pessoa {
    String nome;
    int idade;
    float peso;
    
    public void calculaIdade(){
        if(idade < 18){
            System.out.println("Menor de idade");            
        }
        else{
            System.out.println("Maior de idade");
        }
            
    }
    
    public void display(){
        System.out.println("Nome..: " + nome);
        System.out.println("Idade.: " + idade);
        System.out.println("Peso..: " + peso);
        calculaIdade();
        System.out.println("");
    }
}
