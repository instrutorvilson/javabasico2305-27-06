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
    float altura;
    
    public void calcularIMC(){
        float indice = peso/(altura * altura);
        System.out.println("Seu indice IMC: " 
                + String.format("%.2f", indice));
        if(indice <= 18.5){
            System.out.println("Magreza");
        }
        else if (indice <= 24.9){
            System.out.println("Normal");
        }
        else if (indice <= 30){
            System.out.println("sobrepeso");
        }
        else if (indice > 30){
            System.out.println("obeso");
        }
    }
    
    public void calculaIdade(){
        if(idade < 18){
            System.out.println("Menor de idade");            
        }
        else{
            System.out.println("Maior de idade");
        }
            
    }
    
    public void display(){
        System.out.println("Nome....: " + nome);
        System.out.println("Idade...: " + idade);
        System.out.println("Peso....: " + peso);
        System.out.println("Altura..: " + altura);
        calculaIdade();
        calcularIMC();
        System.out.println("");
    }
}
