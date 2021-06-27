/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecaolist;

import java.util.List;

/**
 *
 * @author vilson.moro
 */
public interface ICrudGenerics<T> {
   public boolean gravar(T obj);
   public List<T> consultarTodos();
}
