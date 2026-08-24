package sistemaescolar;
import db.DbNota;
import java.util.Scanner;
/**
 *
 * @author brayan
 */
public class SistemaEscolar {

    public SistemaEscolar() {
       // p1();
       db.DbNota nota = new DbNota();
       nota.addNota("00000000", "1", 10);
       nota.mostrar_Notas("0", "Ingles");
    }

    public void p1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("(1) Acesso como Aluno");
        System.out.println("(2) Acesso como Professor");
        System.out.println("(3) Acesso como Administrador");
        EscolhaAcesso(sc.nextLine());
    }

    public void EscolhaAcesso(String s) {
        switch (s) {
            case "1":
                new acess.AcessAluno();
                break;
            case "2":
                new acess.AcessProfessor();
                break;
            case "3":
                //new acess.AcessAdministrador();
                break;
            default:
                System.out.println("Esolha de acesso falho");
        }
    }
}
