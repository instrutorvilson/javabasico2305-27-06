/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;



/**
 *
 * @author vilson.moro
 */
public class SwitchCase {
   
    public static void main(String[] args) {
        Scanner tela = new Scanner(System.in);
        System.out.println("Digite o numero do mês [1-12]");
        int mes = tela.nextInt();
        
        switch(mes){
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
    }
    
}
