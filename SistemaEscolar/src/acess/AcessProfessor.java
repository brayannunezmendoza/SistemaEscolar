/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acess;

import credentials.dbProf;
import java.util.Scanner;

/**
 *
 * @author brayan
 */
public class AcessProfessor {
    credentials.dbProf db = new dbProf();
    public AcessProfessor(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu Rp");
        String Rp = sc.nextLine();
        System.out.println("Digite sua senha");
        String senha = sc.nextLine();
        //comparar com o db
        
        
        
        
    }
    public void comparar(String Rp,String senha){
        
        
    }
    
    
}
