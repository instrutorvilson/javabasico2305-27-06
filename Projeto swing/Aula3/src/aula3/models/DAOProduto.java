/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3.models;

import aula3.controller.Produto;
import aula3.utils.ConectaDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOProduto {
    public static ResultSet getCategorias(){
        ResultSet rs = null;
        try {
            Connection con = ConectaDB.getConexao();
            String sql = "select * from categoria";
            PreparedStatement stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static boolean salvar(Produto produto){
        //acessar banco de dados
        try{
          Connection con = ConectaDB.getConexao();
          String sql = "insert into produto" +
                        "(descricao, preco, estoque, idcategoria)" +
                        "values(?,?,?,?)";
          PreparedStatement stm = con.prepareStatement(sql);
          stm.setString(1, produto.getDescricao());
          stm.setFloat(2, produto.getPreco());
          stm.setFloat(3, produto.getEstoque());
          stm.setInt(4, produto.getIdcategoria());
          stm.execute();
          
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
        
        return true;
    }
}
