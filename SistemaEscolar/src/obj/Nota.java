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
    private String idMateria;
    private String idAluno;
    private double nota;
    private String data;

    public Nota(int id, String idMateria, String idAluno, double nota,String data) {
        this.id = id;
        this.idMateria = idMateria;
        this.idAluno = idAluno;
        this.nota = nota;
        this.data = data;
    }
    public int getId(){return id;}
    public String getIdMateria(){return idMateria;}
    public String getIdAluno(){return idAluno;}
    public double getNota(){return nota;}
    public String getData(){return data;}

}
