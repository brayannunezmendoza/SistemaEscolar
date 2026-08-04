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

    private String nome, ra, senha, nomeMateria;
    private int nota;

//    public void addAluno(String name) {
//        //gerar ra do aluno automaticamente
//        Random r = new Random();
//        String re = String.format("%08d", r.longs(0, 99999999));
//    }
    public Aluno(String name, String ra, String senha) {

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
    }

}
