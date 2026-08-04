package acess;

import db.dbAluno;
import db.dbNotas;
import java.util.Scanner;

/**
 *
 * @author brayan
 */
public class AcessAluno {
    
    db.dbAluno db = new dbAluno();
    db.dbNotas dbn = new dbNotas();
    private String ra;
    public AcessAluno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu Ra");
        ra = sc.nextLine();
        
        System.out.println("Digite sua senha");
        String senha = sc.nextLine();
        
        ///conferir dados com o db
        
        if (db.comparar(ra, senha) == '1') {
            verMinhasNotas();
            
        }
        
    }
    
    public void verMinhasNotas() {
        System.out.println("Notas");
        dbn.getNotas(ra);
        
    }
}
