package clase.Flyweight;

import clase.partea_comuna.Pacient;
import clase.partea_comuna.PacientAbstract;

import java.util.HashMap;
import java.util.Map;

public class Receptie {
    // Flyweight Factory
    private Map<String, PacientAbstract> colectiePacienti;

    public Receptie() {
        this.colectiePacienti = new HashMap<String, PacientAbstract>();
    }

    public PacientAbstract getPacient(String CNP, String numePacient, int varsta){
        if(this.colectiePacienti.containsKey(CNP) == false){
            Pacient pacientNou = new Pacient(CNP, numePacient, varsta);
            colectiePacienti.put(CNP, pacientNou);
        }
        return colectiePacienti.get(CNP);
    }

    public String getPacient(String CNP){
        if(this.colectiePacienti.containsKey(CNP)){
            System.out.println("Exista pacientul cu CNP-ul: " + CNP +
                    " Detaliile acestuia sunt: " + colectiePacienti.get(CNP).toString());
        }else{
            return "Nu exista pacientul cu CNP-ul: " + CNP;
        }
        return "0"; // ????? - nu stiu daca este ok !!!
    }
}
