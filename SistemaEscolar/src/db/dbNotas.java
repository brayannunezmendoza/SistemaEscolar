/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import obj.Aluno;

/**
 *
 * @author brayan
 */
public class dbNotas {

    ArrayList<Aluno> db = new ArrayList<>();

    public dbNotas() {
        dbNotas();
    }

    public void dbNotas() {
        db.add(new Aluno("12525153326", "Matematica", 10));
        db.add(new Aluno("12525153326", "Ingles", 6));

    }

    public void getNotas(String ra) {
        for (Aluno aluno : db) {
            System.out.println(aluno.getMateria()+": "+aluno.getNota());
            
        }

    }

}
