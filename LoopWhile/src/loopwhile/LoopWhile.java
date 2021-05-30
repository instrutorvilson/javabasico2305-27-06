/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopwhile;

import java.util.Scanner;

/**
 *
 * @author vilson.moro
 */
public class LoopWhile {

    public static void main(String[] args) {
        String nome = "";
        
        boolean opcao = true;
        while(opcao){
           System.out.println("Informe nome");
           nome = new Scanner(System.in).nextLine();
           
           System.out.println("Deseja inserir outro nome [s/n]?");
           String sopcao = new Scanner(System.in).next();
           
           //opcao = sopcao.toUpperCase().equals("S");
           opcao = sopcao.equalsIgnoreCase("s");
        }
        
      /*  int x = 0;
        while(x<5){
           System.out.println("Informe nome");
           String nome = tela.nextLine(); 
           
            System.out.println("Deseja inserir outro nome [s/n]?");
            String opcao = tela.next();
            if (opcao.charAt(0) == 's')
               x++;
            else
                x=5;
        }
        
        */
        
        /*int i = 0;
        while (i < 10) {
          System.out.println(i);
          i = i + 2;
        }
        System.out.println("E a vida continua...");
       */
        
    }

}
