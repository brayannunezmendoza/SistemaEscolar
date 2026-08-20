/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj;

/**
 *
 * @author brayan
 */
public class Aluno {

    private String id;
    private String ra;
    private String nome;

    public Aluno(String id, String nome,String ra) {
        this.id = id;
        this.nome = nome;
        this.ra=ra;
       
    }

    public String getId(){return id;};
    public String getNome(){return nome;};
    public String getRa(){return ra;};
    //public String getCpf(){return cpf;};
    
    /*public Aluno(String name, String ra, String senha) {

        this.nome = name;
        this.ra = ra;
        this.senha = senha;

    }

    public Aluno(String ra, String nomeMateria, int nota) {
        this.nome = ra;
        this.nota = nota;
        this.nomeMateria = nomeMateria;
    }

    public String getMateria() {
        return nomeMateria;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nRa: " + ra + "\nSenha: " + senha;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }*/
}
