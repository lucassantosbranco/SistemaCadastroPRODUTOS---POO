
package br.ulbra.entity;

/**
 *
 * @author aluno.saolucas
 */
public class Usuario {
    private int ID;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String cpf;
    private String cepusu;
    private String logradourousu;
    private String numerousu;
    private String bairrousu;
    private String cidadeusu;
    private String estado;
    
    public Usuario(){
        
    }      

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCepusu() {
        return cepusu;
    }

    public void setCepusu(String cepusu) {
        this.cepusu = cepusu;
    }

    public String getLogradourousu() {
        return logradourousu;
    }

    public void setLogradourousu(String logradourousu) {
        this.logradourousu = logradourousu;
    }

    public String getNumerousu() {
        return numerousu;
    }

    public void setNumerousu(String numerousu) {
        this.numerousu = numerousu;
    }

    public String getBairrousu() {
        return bairrousu;
    }

    public void setBairrousu(String bairrousu) {
        this.bairrousu = bairrousu;
    }

    public String getCidadeusu() {
        return cidadeusu;
    }

    public void setCidadeusu(String cidadeusu) {
        this.cidadeusu = cidadeusu;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     public boolean validarSenha(String senha) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        return senha.matches(regex);
    }
     public boolean confirmarSenha(String senha, String confirmarSenha) {
    return senha.equals(confirmarSenha);
}

   
}

   


