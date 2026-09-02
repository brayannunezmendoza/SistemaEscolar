/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EscolaGraven.model;

import java.time.LocalDate;

/**
 *
 * @author brayan
 */
public class Coordenador extends User{
    private String rc;
    public Coordenador(String nome, String senha, LocalDate data_Nascimento) {
        super(nome, senha, data_Nascimento);
    }

    public String getRc() {return rc;}
    public void setRc(String rc) {this.rc = rc;}
    
    
}
