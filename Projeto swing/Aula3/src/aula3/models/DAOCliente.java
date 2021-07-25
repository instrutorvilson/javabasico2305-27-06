/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3.models;

import aula3.controller.Cliente;
import aula3.utils.ConectaDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOCliente {
  public static boolean salvar(Cliente c) {
      Connection con = ConectaDB.getConexao();
      String sql = "insert into cliente(nome, cpf, fone, email,"+ 
           "rua, bairro,cep,cidade, uf)values(?,?,?,?,?,?,?,?,?)";
      try {
          PreparedStatement stm = con.prepareStatement(sql);
          stm.setString(1, c.getNome());
          stm.setString(2, c.getCpf());
          stm.setString(3, c.getFone());
          stm.setString(4, c.getEmail());
          stm.setString(5, c.getRua());
          stm.setString(6, c.getBairro());
          stm.setString(7, c.getCep());
          stm.setString(8, c.getCidade());
          stm.setString(9, c.getUf());
          stm.execute();
      } catch (SQLException ex) {
          Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
          return false;
      }
      return true;
  } 
}
