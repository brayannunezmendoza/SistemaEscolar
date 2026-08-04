/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import obj.Aluno;
import java.util.ArrayList;

/**
 *
 * @author brayan
 */
public class dbAluno {

    ArrayList<Aluno> db = new ArrayList<>();

    public dbAluno() {
        dbAluno();
        //();
    }

    public void dbAluno() {
        //temporario 
        db.add(new Aluno("Brayan", "12525153326", "qwe"));
        db.add(new Aluno("Carlos", "12547897832", "123"));
        db.add(new Aluno("Raul", "12547897444", "abc"));

    }

    public char comparar(String ra, String senha) {
        //5 falha ao injetar os dados ao if
        //0 nenhum dado compativel para o login
        //1 acesso compativel
        char c='0';
        for (Aluno aluno : db) {
            //System.out.println(aluno.getNome());
            if (aluno.getRa().equals(ra) && aluno.getSenha().equals(senha)) {
                System.out.println("Acesso bem sucedido");
                c='1';
                break;
            }
        }return c;
        
    }
}
