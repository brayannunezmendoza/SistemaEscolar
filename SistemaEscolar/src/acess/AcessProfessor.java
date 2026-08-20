package acess;

import credentials.dbProf;

import java.util.Scanner;

/**
 *
 * @author brayan
 */
import db.DbAluno;
import db.DbProfessor;
import obj.Aluno;
import obj.Professor;

public class AcessProfessor {

    //credentials.dbProf db = new dbProf();
    private String rp;
    private String senha;
    private DbProfessor professor = new DbProfessor();
    private String[] mensagem;
    private DbAluno aluno = new DbAluno();

//    private DbNotas notas;
//    private DbAluno aluno;
    public AcessProfessor() {
        Scanner sc = new Scanner(System.in);
//        aluno = new DbAluno();
//        notas = new DbNotas();
//        notas.dbNotas();
//
        System.out.println("Bem-Vindo a escola Struevols Professor");
        System.out.println("Digite seu RP");
        rp = sc.nextLine();
        System.out.println("Digite sua senha");
        senha = sc.nextLine();
        mensagem = comparar(rp, senha);

        if (mensagem[0].equals("logado")) {
            System.out.println("Bem Vindo a aba de Professores");
            System.out.println("Bem Vindo:" + mensagem[1]);
            System.out.println("opções disponiveis: \nVer lista de alunos");

            switch (sc.next()) {
                case "1":
                    verListaAlunos();
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                default:
                    System.out.println("defaut ");
            }

        } else {
            System.out.println(mensagem[1]);
        }
    }

    public String[] comparar(String rp, String senha) {
        String status = "erro";
        for (Professor professor : professor.getLista()) {
            if (professor.getRp().equals(rp) && professor.getSenha().equals(senha)) {
                System.out.println("logado");
                status = "logado";
                return new String[]{status, professor.getName()};
            }
        }
        return new String[]{status, "professor desconhecido"};
    }

    public void verListaAlunos() {
        //lista dos alunos retornando apenas os nomes e Ras
        for (Aluno aluno : aluno.getLista()) {
            System.out.println("nome: " + aluno.getNome() + " | ra: " + aluno.getRa());
        }
    }
}
