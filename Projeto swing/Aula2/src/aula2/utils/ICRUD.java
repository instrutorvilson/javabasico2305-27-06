/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2.utils;

/**
 *
 * @author vilson.moro
 */
public interface ICRUD<T> {
   public boolean salvar(T t); 
   public T getOne(int id);
}
