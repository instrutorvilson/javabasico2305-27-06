/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisaoarray;

import java.util.Scanner;

/**
 *
 * @author vilson.moro
 */
public class RevisaoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] nomes = new String[4];
      /* 
       //usando for
       for(int i = 0; i < nomes.length; i++){
           System.out.println("Informe "+ (i+1) +"º nome: ");
           nomes[i] = new Scanner(System.in).nextLine();
       }
       
       ///listar nomes digitados
       for(String nome : nomes){
           System.out.println(nome);  
       }
       */
      
       //usando while
       int i = 0;
       while(i < nomes.length){
          System.out.println("Informe "+ (i+1) +"º nome: ");
          nomes[i] = new Scanner(System.in).nextLine();
          i++;
       }
       //listar nomes no vetor de forma indexada
       for(int x = 0; x < nomes.length; x++){
           System.out.println(nomes[x]);
       }
       
    }
    
}
