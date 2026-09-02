/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EscolaGraven.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author brayan
 */
public class Aluno extends User {

    private String ra;
    private Date dataNascimento;

    public Aluno(String name, String password, LocalDate data_Nascimento) {
        super(name, password, data_Nascimento);
    }
    public String getRa(){return ra;}

    public void setRa(String ra) {this.ra = ra;}
    

}
