/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocalculadorapoo;

import java.util.Scanner;

/**
 *
 * @author vilson.moro
 */
public class ExercicioCalculadoraPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Calculadora calculadora = new Calculadora();
        System.out.println("Informe primeiro numero");
        float n1 = new Scanner(System.in).nextFloat();
        
        System.out.println("Informe a operação");
        System.out.println("1 = somar");
        System.out.println("2 = subtrair");
        System.out.println("3 = Muliplicar");
        System.out.println("4 = Dividir");
        int operacao = new Scanner(System.in).nextInt();
        
        System.out.println("Informe segundo numero");
        float n2 = new Scanner(System.in).nextFloat();
        
        switch(operacao){
            case 1: System.out.println(calculadora.somar(n1, n2));
                    break;
            case 2: System.out.println(calculadora.subtrair(n1, n2));
                    break;     
            case 3: System.out.println(calculadora.multiplicar(n1, n2));
                    break;
            case 4: System.out.println(calculadora.dividir(n1, n2));
                    break;
            default:
                System.out.println("Opção inválida");
        }
        
    }
    
}
