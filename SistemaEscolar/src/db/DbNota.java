/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.util.ArrayList;
import obj.Nota;
import db.dbAluno;
import db.DbMateria;
import java.util.Random;

/**
 *
 * @author braya
 */
public class DbNota {

    private ArrayList<Nota> db = new ArrayList<>();
    private dbAluno db_aluno;
    private DbMateria db_Materia;

    public DbNota() {
        db_aluno = new dbAluno();
        db_Materia = new DbMateria();
        addNota("00000000", "2", 7);
    }

    public void addNota(String ra_Aluno, String id_Materia, double nota) {
        Random r_Nota = new Random();
        String id_Nota = String.valueOf(r_Nota.longs(0, 99999999));
        String ra_Auno_Resultado = db_aluno.consultar_Aluno(ra_Aluno);
        String nome_Materia_Resultado = db_Materia.consultar_Materia(id_Materia);
        db.add(new Nota(id_Nota, nome_Materia_Resultado, ra_Aluno, nota, "2026/10/19"));
    }

    public void mostrar_Notas(String ra_Aluno, String nome_Materia) {
        System.out.println("notas");
        for (Nota nota : db) {
            if (ra_Aluno.equals("0")) {
                if (nome_Materia.equals(nota.getIdMateria())) {
                    System.out.println("id Aluno: " + nota.getIdAluno());
                    System.out.println("id Materia: " + nota.getIdMateria());
                    System.out.println("nota: " + nota.getNota());
                }
            }
        }

    }
}
