/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2.controller;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vilson.moro
 */
public class ControllerCarro {
    
   private List<Carro> lista = new ArrayList<>();
  
   public boolean salvar(Carro carro){
       lista.add(carro);
       return true;
   }
   
   public List<Carro> getCarros(){
       return lista;
   }
}
