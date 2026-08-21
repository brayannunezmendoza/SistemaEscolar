/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import java.util.Random;
import obj.Materia;

/**
 *
 * @author braya
 */
public class DbMateria {

    private Materia materia;
    private ArrayList<Materia> db = new ArrayList<>();

    public DbMateria() {
        addMateria("Matematica");
        addMateria("Ingles");
        addMateria("Portugues");
    }

    public void addMateria(String nome) {
        Random id = new Random();
        db.add(new Materia(id.nextInt(0, 99), nome));
    }

    public String nomeMateria(String id) {
        String nome = "Não encontrado";
        for (Materia materia : db) {
            if (id.equals(materia.getId())) {
                nome = materia.getNome();
                return nome;
            }
        }
        return nome;
    }

}
