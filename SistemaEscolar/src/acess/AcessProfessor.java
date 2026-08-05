package acess;

import credentials.dbProf;
import java.util.Scanner;

/**
 *
 * @author brayan
 */
public class AcessProfessor {

    credentials.dbProf db = new dbProf();
    private String Rp;
    private String senha;

    public AcessProfessor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Rp");
        Rp = sc.nextLine();
        System.out.println("Digite sua senha");
        senha = sc.nextLine();
        sc.close();
        comparar(Rp, senha);
    }

    public void comparar(String rp, String senha) {
        Scanner sc = new Scanner(System.in);
        short s;
        if (db.comparar(rp, senha) == '1') {
            System.out.println("Acesso permitido");
            //funções///adicionar nota, ver notas
            System.out.println("(1) Ver notas dos Alunos");
            System.out.println("(2) Alterar notas do Aluno");
            s = sc.nextShort();
            if (s == 1) {
                
            }
            if (s == 2) {
                
            }
        }
    }
}
