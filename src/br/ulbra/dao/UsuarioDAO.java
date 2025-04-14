package br.ulbra.dao;

import br.ulbra.config.ConnectionFactory;
import br.ulbra.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {

    private Connection con;

    public UsuarioDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public boolean checkLogin(String email, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM tbusuarios WHERE emailUsu = ? AND senhaUsu = ?");
            stmt.setString(1, email);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar login: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }
   
    
    
        public void salvar(Usuario u) {
    PreparedStatement stmt = null;
    try {
        stmt = con.prepareStatement("INSERT INTO tbusuarios (nomeusu, emailusu, senhausu, telefoneusu, cpfusu, cepusu, logradourousu, numerousu, bairrousu, cidadeusu, estadousu) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        stmt.setString(1, u.getNome());
        stmt.setString(2, u.getEmail());
        stmt.setString(3, u.getSenha());
        stmt.setString(4, u.getTelefone());
        stmt.setString(5, u.getCpf());
        stmt.setString(6, u.getCepusu());
        stmt.setString(7, u.getLogradourousu());
        stmt.setString(8, u.getNumerousu());
        stmt.setString(9, u.getBairrousu());
        stmt.setString(10, u.getCidadeusu());
        stmt.setString(11, u.getEstado());

        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar usuário: " + ex.getMessage());
    } finally {
        ConnectionFactory.closeConnection(con, stmt);
    }
        }
 
    public List<Usuario> read() throws Exception {
    List<Usuario> lista = new ArrayList<>();
    String sql = "SELECT * FROM tbusuarios";
    Connection conn = ConnectionFactory.getConnection();
    PreparedStatement stmt = conn.prepareStatement(sql);
    ResultSet rs = stmt.executeQuery();

    while (rs.next()) {
        Usuario u = new Usuario();
        u.setID(rs.getInt("pkidusu"));
        u.setNome(rs.getString("nomeusu"));
        u.setEmail(rs.getString("emailusu"));
        lista.add(u);
    }

    rs.close();
    stmt.close();
    conn.close();

    return lista;
}
   
    
}


