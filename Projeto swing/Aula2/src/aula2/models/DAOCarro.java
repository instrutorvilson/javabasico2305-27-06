/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2.models;

import aula2.controller.Carro;
import aula2.utils.ConectaDB;


public class DAOCarro {
   public static boolean salvar(Carro carro){
       if(ConectaDB.getConexao() != null){
           System.out.println("Conectado ao bd");
       }
       return true;
   } 
}
