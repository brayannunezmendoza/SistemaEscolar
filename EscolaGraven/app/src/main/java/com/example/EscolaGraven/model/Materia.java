/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EscolaGraven.model;

/**
 *
 * @author brayan
 */
public class Materia {
    private int id;
    private String nome_Materia;
    
    public Materia(String nome_Materia){
    this.nome_Materia = nome_Materia;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNome_Materia() {return nome_Materia;}
    public void setNome_Materia(String nome_Materia) {this.nome_Materia = nome_Materia;}
    
}
