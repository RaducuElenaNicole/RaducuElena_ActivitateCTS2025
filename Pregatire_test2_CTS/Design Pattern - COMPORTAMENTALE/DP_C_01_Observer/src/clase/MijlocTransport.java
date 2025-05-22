package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subject{
    private List<Observer_Notificare> calatoriInregistrati;
    private int numarLinie;

    public MijlocTransport(int numarLinie) {
        this.numarLinie = numarLinie;
        this.calatoriInregistrati = new ArrayList<Observer_Notificare>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer_Notificare obs : calatoriInregistrati){
            obs.primesteNotificare(mesaj);
        }
    }

    @Override
    public void adaugaCalator(Observer_Notificare obs) {
        this.calatoriInregistrati.add(obs);
    }

    @Override
    public void StergeCalator(Observer_Notificare obs) {
        this.calatoriInregistrati.remove(obs);
    }

    public abstract void pleacaDeLaCapat();

    public List<Observer_Notificare> getCalatoriInregistrati() {
        return calatoriInregistrati;
    }

    public void setCalatoriInregistrati(List<Observer_Notificare> calatoriInregistrati) {
        this.calatoriInregistrati = calatoriInregistrati;
    }

    public int getNumarLinie() {
        return numarLinie;
    }

    public void setNumarLinie(int numarLinie) {
        this.numarLinie = numarLinie;
    }
}
