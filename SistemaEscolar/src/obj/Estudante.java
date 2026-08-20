
package obj;

import java.time.LocalDate;

/**
 *
 * @author braya
 */
public class Estudante {

    private String id;
    private String nome;
    private String senha;
    private String ra;
    private String cpf;
    private LocalDate dataNascimento;
    private String situacaoCadastro;

    public Estudante(String id, String ra, String cpf, String nome,LocalDate dataNascimento,String senha,String situacaoCadastral) {
        this.id = id;
        this.ra = ra;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.situacaoCadastro = situacaoCadastral;
    }
    
    public String getId(){return id;}
    public String getNome(){return nome;}
    public String getSenha(){return senha;}
    public String getRa(){return ra;}
    public String getCpf(){return cpf;}
    public LocalDate getDataNacimento(){return dataNascimento;}
    public String getSituacaoCadastral(){return situacaoCadastro;}

    public void setId(String id) {this.id = id;}

    public void setNome(String nome) {this.nome = nome;}

    public void setSenha(String senha) {this.senha = senha;}

    public void setRa(String ra) {this.ra = ra;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public void setDataNascimento(LocalDate dataNascimento) {this.dataNascimento = dataNascimento;}

    public void setSituacaoCadastro(String situacaoCadastro) {this.situacaoCadastro = situacaoCadastro;}
    
    public void setEstudante(String nome,String senha, String ra, String cpf, LocalDate dataNascimento,String situacaoCadastral){
    this.nome = nome;
    this.senha=senha;
    this.cpf = cpf;
    this.ra = ra;
    this.dataNascimento =dataNascimento;
    this.situacaoCadastro = situacaoCadastral;
    }    

}
