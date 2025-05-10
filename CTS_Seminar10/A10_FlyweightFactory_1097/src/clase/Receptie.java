package clase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Receptie {
    private Map<String, PacientAbstract> pacienti; // cheia = CNP -> de facut !

    public Receptie() {
        this.pacienti = new HashMap<String, PacientAbstract>();
    }

    public PacientAbstract getPacient(String nume, String nrTelefon, String adresa){
        if(!pacienti.containsKey(nume)){
            pacienti.put(nume, new Pacient(nume, nrTelefon, adresa));
        }
        return pacienti.get(nume);
    }

    public PacientAbstract getPacient(String nume) throws Exception {
        if(!pacienti.containsKey(nume)){
            return pacienti.get(nume);
        }else{
            throw new Exception("Nu exista pacient!");
        }
    }
}
