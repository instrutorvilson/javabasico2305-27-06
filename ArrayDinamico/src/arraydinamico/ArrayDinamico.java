/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydinamico;

import java.util.Scanner;

/**
 *
 * @author vilson.moro
 */
public class ArrayDinamico {

    static String[] nomes = new String[1];

    public static void main(String[] args) {

        boolean continuar = true;
        int i = 0;
        while (continuar) {
            System.out.println("Informe nome ");
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Deseja continuar? [s/n]");
            String opcao = new Scanner(System.in).nextLine();
            continuar = opcao.equalsIgnoreCase("s");  
            if (continuar){
                add();
                i++;             
            }
        }
        listar();       
    }

    public static void listar(){
         //listar nomes informados
       System.out.println("===============================");
       for(String nome : nomes){
           System.out.println(nome);
       }
    }
    public static void add() {
        String[] aux = new String[nomes.length];
        for (int x = 0; x < nomes.length; x++) {
            aux[x] = nomes[x];
        }
        nomes = new String[aux.length + 1];
        for (int x = 0; x < aux.length; x++) {
            nomes[x] = aux[x];
        }
    }

}
