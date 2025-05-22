package clase;

public class Calator implements Observer_Notificare {
    private String numeCalator;

    public Calator(String numeCalator) {
        this.numeCalator = numeCalator;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Mesajul pentru calatorul " + this.numeCalator
                + " este: { " + mesaj + " } ");
    }
}
