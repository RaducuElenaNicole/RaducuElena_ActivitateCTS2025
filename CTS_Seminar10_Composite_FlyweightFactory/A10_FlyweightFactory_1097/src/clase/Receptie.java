package clase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Receptie {
    private Map<String, PacientAbstract> pacienti;

    public Receptie() {
        this.pacienti = new HashMap<String, PacientAbstract>();
    }

    public PacientAbstract getPacient(String nume, String nrTelefon, String adresa){
        if(!this.pacienti.containsKey(nume)){
            pacienti.put(nume, new Pacient(nume, nrTelefon, adresa));
        }
        return pacienti.get(nume);
    }

    public PacientAbstract getPacient(String nume) throws Exception {
        if(this.pacienti.containsKey(nume)){
            return this.pacienti.get(nume);
        }else{
            throw new Exception("Nu exista pacientul cu numele " + nume + " !");
        }
    }
}
