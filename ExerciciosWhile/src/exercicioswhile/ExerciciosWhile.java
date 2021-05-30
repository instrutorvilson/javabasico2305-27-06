/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioswhile;

import java.util.Scanner;

/**
 *
 * @author vilson.moro
 */
public class ExerciciosWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "";

        boolean opcao = true;
        while (opcao) {
            System.out.println("Digite o numero do mês [1-12]");
            int mes =  new Scanner(System.in).nextInt();

            switch (mes) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;
                default:
                    System.out.println("Mês inválido");
            }

            System.out.println("Deseja inserir outro nome [s/n]?");
            String sopcao = new Scanner(System.in).next();
            //opcao = sopcao.toUpperCase().equals("S");
            opcao = sopcao.equalsIgnoreCase("s");
        }

    }
    
}
