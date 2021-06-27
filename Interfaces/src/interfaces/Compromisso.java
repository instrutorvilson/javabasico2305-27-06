/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import colecaolist.ICrudGenerics;
import java.util.List;

/**
 *
 * @author vilson.moro
 */
public class Compromisso  implements ICrudGenerics<Compromisso>{

    @Override
    public boolean gravar(Compromisso obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Compromisso> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
