/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj;

/**
 *
 * @author braya
 */
public class Nota {

    private int id;
    private int idMateria;
    private int idAluno;
    private int nota;

    public Nota(int id, int idMateria, int idAluno, int nota) {
        this.id = id;
        this.idMateria = idMateria;
        this.idAluno = idAluno;
        this.nota = nota;
    }
    public int getId(){return id;}
    public int getIdMateria(){return idMateria;}
    public int getIdAluno(){return idAluno;}
    public int getNota(){return nota;}

}
