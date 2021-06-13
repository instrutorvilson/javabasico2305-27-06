/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametros;


public class Calculadora {
    
    //void = sem retorno
    public void somar(int x, int y){
        System.out.println(x + y);
    }
    
    //sem void especifica o tipo de retorno
    public int somar(int[] numeros){
      int soma = 0;  
      for(int x : numeros){
          soma += x;
      }
      return soma;  
    }
    
    public float somar(float x, float y){
        return x + y;
    }
    
}
