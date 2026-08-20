package credentials;

import java.util.ArrayList;
import obj.Professor;

/**
 *
 * @author brayan
 */
public class dbProf {

    ArrayList<Professor> db = new ArrayList<>();

    public dbProf() {
//        loadDB();
    }

//    public void loadDB() {
//        db.add(new Professor("Nilton", "12345678900", "123456789", "qwe"));
//        db.add(new Professor("Carlos", "98765432100", "000000000", "qwe"));
//        db.add(new Professor("Brayan", "1", "1", "q"));
//    }

    public char comparar(String rp, String senha) {
        char c = 5;
        for (Professor professor : db) {
            if (professor.getRp().equals(rp) && professor.getSenha().equals(senha)) {
                c = '1';
                break;
            }
        }
        return c;
    }
}
