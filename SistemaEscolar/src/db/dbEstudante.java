/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import obj.Estudante;
import db.DbAluno;

/**
 *
 * @author braya
 */
public class dbEstudante {

    private ArrayList<Estudante> db = new ArrayList<>();

    public dbEstudante() {
        addEstudante("Brayan", "12345678900", LocalDate.of(2006, 10, 19), "Ativo");

    }

    public void addEstudante(String nome, String cpf, LocalDate dataNascimento, String situacaoCadastral) {
        Random idRa = new Random();
        String idras = String.format("%08d", idRa.nextLong(0, 99999999));
        //verificar se não ha repetição de id;()
        //senha inicial sera o cpf, o estudante podera alterar no futuro;()
        String senha = cpf;
        db.add(new Estudante(idras, idras, cpf, nome, dataNascimento, senha, situacaoCadastral));
        System.out.println("Estudante Cadastrado no Sistema");
        System.out.println("informações do Estudante : "
                + "\nNome: " + nome
                + "\nCpf: " + cpf
                + "\nData de Nascimento: " + dataNascimento
                + "\nId: " + idras
                + "\nRa: " + idras
                + "\nSenha de Login: " + senha
                + "\nSituação Cadastral: " + situacaoCadastral);

        //sincronização de dados com outras listas
        //lista aluno,lista notas/
        //        System.out.println("Digite o nome: ");
//        System.out.println("Digite o cpf: ");
//        System.out.println("Digite a data de nascimento:");
//        System.out.println("Digite a senha: ");
    }

    //delet aluno-> mudar apenas a situação do aluno na escola,
    //ao inves de deletar o aluno da lista ele sera 
    //listado apenas como inativo ou transferido
    public String situacaoCadastral(String nome, String ra, String cpf, String situacaoCadastral) {
        System.out.println("(1)Ativo");
        System.out.println("(2)Transferido");
        System.out.println("(2)Inativo");
        if (situacaoCadastral.equals("1")) {
            return "Ativo";
        }
        if (situacaoCadastral.equals("2")) {
            return "Transferido";
        }
        if (situacaoCadastral.equals("3")) {
            return "Inativo";
        }
        return null;
    }

    public void alterarDados(String nome, String cpf, String ra, String senha, LocalDate dataNascimento, String situacaoCadastral) {
        for (Estudante estudante : db) {
            if (estudante.getCpf().equals(cpf)) {
                estudante.setEstudante(nome, senha, ra, cpf, dataNascimento, situacaoCadastral);
                System.out.println("Dados alterados"
                        + "Nome: " + estudante.getNome()
                        + "Cpf: " + estudante.getCpf()
                        + "Ra: " + estudante.getRa()
                        + "Senha: " + estudante.getSenha()
                        + "Data de Nascimento: " + estudante.getDataNacimento()
                        + "Situação Cadastral: " + estudante.getSituacaoCadastral()
                );
            }
        }

    }

    public String autenticacao(String ra, String senha) {
        String raa=null;
        

        for (Estudante estudante : db) {
            if (estudante.getRa().equals(ra) && estudante.getSenha().equals(senha)) {
                System.out.println("Acesso do Aluno autenticado");
                raa=estudante.getRa();
            }
        }
        
        return raa;
    }

}
