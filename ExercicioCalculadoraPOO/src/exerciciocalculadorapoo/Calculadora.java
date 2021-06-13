/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciocalculadorapoo;

/**
 *
 * @author vilson.moro
 */
public class Calculadora {
    public float somar(float x, float y){
        return x + y;
    }
    
    public float subtrair(float x, float y){
        return x - y;
    }
    
    public float multiplicar(float x, float y){
        return x * y;
    }
    
    public float dividir(float x, float y){
        if (y == 0){
            System.out.println("O divisor não pode ser Zero");
            return 0;
        }
        return x / y;
    }
}
