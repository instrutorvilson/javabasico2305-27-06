/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametros;

/**
 *
 * @author vilson.moro
 */
public class Parametros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); //metodo construtor
        //sem retorno
        calculadora.somar(500, 145);
        
        int[] x = {1,2,3,4,5,6,7,8,9,10};
        //com retorno
        int soma = calculadora.somar(x);
        System.out.println("Soma do array: " + soma);
    }
    
}
