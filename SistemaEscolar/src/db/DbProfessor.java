/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import obj.Professor;

/**
 *
 * @author braya
 */
public class DbProfessor {

    ArrayList<Professor> db = new ArrayList<>();

    public DbProfessor() {
        addProfessor("Brayan", "12345678900", "123", "qwe");

    }

    public void addProfessor(String nome, String cpf, String Rp, String senha) {
        //generate id
        Random r = new Random();
        String id = String.format("%08d", r.nextLong(0, 99999999));
        db.add(new Professor(id, nome, cpf, Rp, senha));
    }

    public void deletProfessor(String nome, String rp) {
        db.removeIf(professor -> professor.getName().equals(nome) && professor.getRp().equals(rp));
    }

    public List<Professor> getLista() {
        return Collections.unmodifiableList(db);
    }
}
