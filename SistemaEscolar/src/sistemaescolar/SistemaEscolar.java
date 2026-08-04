package sistemaescolar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brayan
 */
public class SistemaEscolar {

    public SistemaEscolar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("(1) Acesso como Aluno");
        System.out.println("(2) Acesso como Professor");
        System.out.println("(3) Acesso como Administrador");

        switch (sc.nextLine()) {
            case "1":
                new acess.AcessAluno();
                break;
            case "2":

                break;
            case "3":

                break;

            default:
                System.out.println("Tente Novamente");
        }
    }

}
