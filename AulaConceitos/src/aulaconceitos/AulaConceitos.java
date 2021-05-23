/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaconceitos;

import java.util.Scanner;
public class AulaConceitos {
  
    public static void main(String[] args) {
      // declaracaoVariavel();   
      //lerDadosTeclado();
      //operadoresMatematicos();
      //operadoresComparacao();
      //operadoresLogicos();
      desvioCondicional();
    }
    
    public static void desvioCondicional(){
       int x = 20;
       int y = 10;
       System.out.println(x < 20);
       if(x < 20){
           System.out.println(x + " é menor que " + y);
       }
       else{
         System.out.println(x + " não é menor que " + y);  
       }
    }
    
    public static void operadoresComparacao(){
       /* == != < > <= >= */ 
       int x = 20;
       int y = 10;
       System.out.println(x == y);
       System.out.println(x != y);
       System.out.println(x < y);
       System.out.println(x <= y);
       System.out.println(x > y);
       System.out.println(x >= y);
    }
    
    public static void operadoresLogicos(){
      /*&&  ||  !*/  
      int x = 20;
      int y = 10;
      int z = 30;
      System.out.println((x < y));
      System.out.println((x < z));
      System.out.println((x < y) && (x < z));
      System.out.println((x < y) || (x < z));
    }
    
    public static void operadoresMatematicos(){
        /*Operodores matematicos*/
        /* + - * / ^ % */
        int x = 20;
        int y = 10;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        /* ++ incremento  --decremento */
        System.out.println(x);
        //x++;
        x = x + 1;
        System.out.println(x);
        System.out.println(y);
        y--;
        System.out.println(y);
    }
    
    public static void lerDadosTeclado(){
        Scanner tela = new Scanner(System.in);
        
        System.out.print("Informe seu nome: ");
        String nome = tela.nextLine();
        
        System.out.print("Informe sua idade: ");
        int idade = tela.nextInt();
        
        System.out.println("Olá " + nome + " você tem " 
                + idade + " anos de vida");
        
        System.out.print("Informe seu peso: ");
        float peso = tela.nextFloat();
        
        System.out.print("Informe sua altura: ");
        double altura = tela.nextDouble();
        
        System.out.println(nome + " sua altura é " + altura + 
                ", e pesa " + peso + " kilos.");
    }
    
    public static void declaracaoVariavel(){
         char sexo = 'F';
       String nome = "Vilson";
       int idade = 10;
       
       double peso = 10.5;
       float altura = 1.69f;
       System.out.println(altura);
       System.out.println(idade);
       
       altura = idade;//casting implicito
       idade = (int)altura;//casting explicito
       System.out.println(altura);
       System.out.println(idade);
    }
    
}
