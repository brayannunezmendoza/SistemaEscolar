/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package obj;

/**
 *
 * @author braya
 */
public class Materia {
    private int id;
    private String nome;
    
    public Materia(int id,String nome){
        this.id = id;
        this.nome = nome;
    }
    public int getId(){return id;}
    public String getNome(){return nome;}
    
}
