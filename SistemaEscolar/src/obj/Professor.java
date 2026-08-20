/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj;

import java.util.Random;

/**
 *
 * @author brayan
 */
public class Professor {

    private String id;
    private String name;
    private String cpf;
    private String rp;
    private String senha;

    public Professor(String id, String nome, String cpf, String rp, String senha) {
        this.id = id;
        this.name = nome;
        this.cpf = cpf;
        this.rp = rp;
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRp() {
        return rp;
    }

    public String getSenha() {
        return senha;
    }

}
