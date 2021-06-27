/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;

/**
 *
 * @author vilson.moro
 */
interface ICrud {
  public boolean gravar();
  public boolean alterar();
  public boolean excluir();
  public List<Object> consultarTodos();
  public Object consultarPeloId(int id);  
}
