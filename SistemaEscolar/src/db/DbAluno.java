/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import java.util.Random;
import obj.Aluno;

/**
 *
 * @author braya
 */
public class DbAluno {

    private ArrayList<Aluno> db = new ArrayList<>();

    public void addAluno(String nome, String ra) {
        Random r = new Random();
        String id_Aluno = String.valueOf(r.nextLong(0, 9999));
        db.add(new Aluno(id_Aluno, nome, ra));
    }

    public String consultar_Aluno(String ra) {
        String ra_Resultado="Ra não encontrado";
        for (Aluno aluno : db) {
            if (ra.equals(aluno.getRa())) {
                ra_Resultado= aluno.getRa();
                return ra_Resultado;
            }
        }return ra_Resultado;
    }

}
