/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
create table carro(
placa varchar(8),
marca varchar(50),
modelo varchar(50),
cor varchar(20)
)
*/
package aula2.models;

import aula2.controller.Carro;
import aula2.utils.ConectaDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOCarro {
   public static boolean salvar(Carro carro){
       Connection con = ConectaDB.getConexao();
       String sql = "insert into carro (placa,marca,modelo,cor)";
              sql += "values(?,?,?,?)" ;
       try {
           PreparedStatement stm = con.prepareStatement(sql);
           stm.setString(1, carro.getPlaca());
           stm.setString(2, carro.getMarca());
           stm.setString(3, carro.getModelo());
           stm.setString(4, carro.getCor());
           stm.execute();
       } catch (SQLException ex) {
           Logger.getLogger(DAOCarro.class.getName()).log(Level.SEVERE, null, ex);
       }
       return true;
   } 
}
