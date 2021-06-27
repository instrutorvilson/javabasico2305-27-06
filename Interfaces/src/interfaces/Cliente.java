/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vilson.moro
 */

/*Cliente precisa implementar todos os métodos definido na interface*/
public class Cliente implements ICrud{
    
    String nome;
    String fone;

    public Cliente(String nome, String fone) {
        this.nome = nome;
        this.fone = fone;
    }

    public Cliente() {
    }
    

    @Override
    public boolean gravar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> consultarTodos() {
       List<Object> lista = new ArrayList<>();
       lista.add(new Cliente("jose", "123"));
       lista.add(new Cliente("maria", "456"));
       lista.add(new Cliente("pedro", "789"));
       lista.add(new Cliente("carla", "154"));
       return lista;
    }

    @Override
    public Object consultarPeloId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", fone=" + fone + '}';
    }
    
}
