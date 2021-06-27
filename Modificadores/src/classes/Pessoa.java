/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author vilson.moro
 */
/*
  Modificadores de classe
 public -> visivel em todas as classes onde é realizado o import
  default -> visivel somente para as classe no mesmo pacote
*/

public class Pessoa {
  public String nome;    
  //private é visivel somente dentro da classe
  private String cpf;
  //cria set para inseri valor no atributo
  public void setCpf(String pCpf){
     if (validaCpf(pCpf))
         cpf = pCpf;
  }
  
  private boolean validaCpf(String pCpf){
     if(pCpf.length() != 11){
          System.out.println("CPF inválido");
          return false;
     }
     else
         return true;
  }
  
}
