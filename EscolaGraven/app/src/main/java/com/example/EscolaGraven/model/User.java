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
public abstract class User {

    private int id;
    private String name;
    private String password;
    private LocalDate data_Nascimento;

    public User(String name, String password, LocalDate data_Nascimento) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.data_Nascimento = data_Nascimento;
    }

    
    public boolean login() {return true;}

    public int getId() {return id;}
    public String getName() {return name;}
    public String getPassword() {return password;}
    public LocalDate getDataNascimento() {return data_Nascimento;}

    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setPassword(String password) {this.password = password;}
    public void setDataNascimento(LocalDate data_Nascimetno) {this.data_Nascimento = data_Nascimetno;}

}
