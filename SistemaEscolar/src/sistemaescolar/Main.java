/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaescolar;

import java.util.Scanner;

/**
 *
 * @author brayan
 */
public class Main {
    public static void main(String[] args) {
        new SistemaEscolar();
    }
}


/*
     private boolean b1 = false;

    public static void main(String[] args) {
        new SistemaEscolar().acesso();
    }

    public void acesso() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Escolha o seu login");
            String e1 = sc.next();
            if ("1".equals(e1)) {
                System.out.println("Acesso como Aluno");
                b1 = false;
                loginAluno();
                break;
            }
            if ("2".equals(e1)) {
                System.out.println("Acesso como Professor");
                loginProf();
                b1 = false;

                break;

            } else {
                System.out.println("Tente novamente");
                b1 = true;
            }
        } while (b1);
    }

    public void loginProf() {
        Scanner sc = new Scanner(System.in);
        String login;
        String senha;
        boolean b2 = false;
        System.out.println("login como Professor");
        do {
            System.out.println("Digite seu Login");
            login = sc.nextLine();
            System.out.println("Digite sua senha");
            senha = sc.nextLine();
            if (login.equals("Brayan") && senha.equals("qwe")) {
                System.out.println("Acesso permitido como professor");
                b2 = false;
                break;
            } else {
                System.out.println("Acesso negado");
                b2 = true;
            }
        } while (b2==true);
    }

    public void loginAluno() {
        Scanner sc = new Scanner(System.in);
        String login;
        String senha;
        System.out.println("Login como Aluno");
        boolean b2 = false;

        do {
            System.out.println("Digite seu login");
            login = sc.nextLine();
            System.out.println("Digite sua senha");
            senha = sc.nextLine();
            if ("Brayan".equals(login) && "qwe".equals(senha)) {
                System.out.println("Acesso permitido como aluno");
                b2 = false;
                break;
            } else {
                System.out.println("Acesso negado");
                b2 = true;
            }
        } while (b2);
    }

    public void sistemaDoProfessor(int id) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Funções disponiveis");
        System.out.println("(1) ver tabela de notas");
        System.out.println("...");

        String e1 = sc.nextLine();
        if (e1.equals("1")) {
            tabelaALunos();

        } else {
        }
    }

    public void tabelaALunos() {
        ArrayList<String> tbAluno = new ArrayList<>();
        tbAluno.add(0, "Brayan");
        tbAluno.add(1, "Carlos");
        tbAluno.add(2, "Mih");
    }

    public void addAluno() {
    }

    public void verTabelaAluno() {
    }

 */
