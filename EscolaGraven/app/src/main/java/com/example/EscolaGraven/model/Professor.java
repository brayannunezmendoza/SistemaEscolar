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
public class Professor extends User{
    private String rp;
    public Professor(String name, String password, LocalDate data_Nascimento){
        super(name,password,data_Nascimento);   
    }
}
