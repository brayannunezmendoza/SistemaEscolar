package acess;

import db.DbAluno;
import java.util.Scanner;
import db.dbEstudante;
import obj.Estudante;

/**
 *
 * @author brayan
 */
public class AcessAluno {

    Scanner sc = new Scanner(System.in);
    dbEstudante estudante = new dbEstudante();

    //login do estudante
    public AcessAluno() {
        login();
    }

    public void login() {
        System.out.println("Bem-Vindo a Escola Struevols");
        System.out.println("Digite suas credenciais");
        System.out.println("Digite seu Ra: ");
        String ra = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();
        if (estudante.autenticacao(ra, senha) != null) {
            System.out.println("Acesso permitido");
            //verNota();
            System.out.println("Digite a opção desejada");
            
            //1-ver todas as notas
            //1.2-ver nota de um bimeste especifico
            //1.3-ver nota de uma materia especifica
            //1.4-ver nota em ordem de chegada
            //2-ver minha informações
            //3-alterar minhas informações
            //4-voltar
            //5-fechar
            System.out.println("(1)Ver todas as minhas notas");
            
            String acessOk = sc.nextLine();
            acessoOk(acessOk);
        } else {
            System.out.println("Acesso negado");
        }

    }

    public void acessoOk(String code) {
        
        
    }

//    db.DbAluno db = new DbAluno();
//    db.DbNotas dbn = new DbNotas();
//    private String ra;
//    public AcessAluno() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite seu Ra");
//        ra = sc.nextLine();
//        
//        System.out.println("Digite sua senha");
//        String senha = sc.nextLine();
//        
//        ///conferir dados com o db
//        
//        if (db.comparar(ra, senha) == '1') {
//            verMinhasNotas();
//            
//        }
//        
//    }
//    
//    public void verMinhasNotas() {
//        System.out.println("Notas");
//        dbn.getNotas(ra);
//        
//    }
}
