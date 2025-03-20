import clase.AbstractRezervare;
import clase.RezervareTerasa;

public class Main {
    public static void main(String[] args) {
        AbstractRezervare rezervareTerasa = new RezervareTerasa(12, 15, "Ana", 12, true);
        System.out.println(rezervareTerasa.toString());

        AbstractRezervare rezervareTerasa2 = rezervareTerasa.creeazaRezervare(17);
        rezervareTerasa2.setOra(22);
        System.out.println(rezervareTerasa2.toString());

        AbstractRezervare rezervareTerasa3 = rezervareTerasa.creeazaRezervare(9);
        rezervareTerasa3.setNumeClient("Andrei");
        System.out.println(rezervareTerasa3.toString());
    }
}
