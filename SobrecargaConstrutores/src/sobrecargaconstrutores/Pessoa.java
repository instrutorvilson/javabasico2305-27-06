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
public class Pessoa {
    private String nome;
    int idade;
    float peso;
    float altura;
    
    //construtores com sobrecarga
    public Pessoa(){
        //construtor sem argumentos 
        //(nenhum parametro foi passada)
    }
    
    public Pessoa(String pNome){
        nome = pNome;
    }
    
    public Pessoa(String pNome, 
                  int pIdade, 
                  float pPeso, 
                  float pAltura){
        nome = pNome;
        idade = pIdade;
        peso = pPeso;
        altura = pAltura;
    }
    
    public void display(){
        System.out.println("Nome....: " + nome);
        System.out.println("Idade...: " + idade);
        System.out.println("Peso....: " + peso);
        System.out.println("Altura..: " + altura);
        System.out.println("");
    }
    
    //escrever no atributo nome
    public void setNome(String value){
        nome = value;
    }
    
    //ler o valor do atributo nome
    public String getNome(){
        return nome;
    }
}
