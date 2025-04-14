/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.dao;

import br.ulbra.config.ConnectionFactory;
import br.ulbra.entity.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lucas Santos
 */
public class ProdutoDAO {

    private Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/cadastro_produto";
        String user = "root";
        String password = "";
       Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }

    public void salvar(Produto p) throws Exception {
        String sql = "INSERT INTO produto (nomeProd, dataCadProd, categoriaProd, valorUnitProd, quantEstoqueProd) VALUES (?,?,?,?,?)";
        Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, p.getNomeProd());
        stmt.setString(2, p.getDataCadProd()); 
        stmt.setString(3, p.getCategoriaProd());
        stmt.setDouble(4, p.getValorUnitProd());
        stmt.setInt(5, p.getQuantEstoqueProd());
        stmt.execute();
        stmt.close();
        conn.close();
    }
    public List<Produto> readAll() throws Exception {
    List<Produto> lista = new ArrayList<>();
    Connection conn = ConnectionFactory.getConnection();
    String sql = "SELECT * FROM produto";
    PreparedStatement stmt = conn.prepareStatement(sql);
    ResultSet rs = stmt.executeQuery();

    while (rs.next()) {
        Produto p = new Produto();
       p.setIdProd(rs.getInt("pkidprod"));
        p.setNomeProd(rs.getString("nomeProd"));
        p.setDataCadProd(rs.getString("dataCadProd"));
        p.setCategoriaProd(rs.getString("categoriaProd"));
        p.setValorUnitProd(rs.getDouble("valorUnitProd"));
        p.setQuantEstoqueProd(rs.getInt("quantEstoqueProd"));
        lista.add(p);
    }

    rs.close();
    stmt.close();
    conn.close();

    return lista;
}
    
}
