package clase;

import java.time.LocalDate;

public class Metrou extends MijlocTransport {
    private String denumirePrimaStatie;
    private String denumireUltimaStatie;

    public Metrou(int numarLinie, String denumirePrimaStatie, String denumireUltimaStatie) {
        super(numarLinie);
        this.denumirePrimaStatie = denumirePrimaStatie;
        this.denumireUltimaStatie = denumireUltimaStatie;
    }

    @Override
    public void pleacaDeLaCapat() {
        trimiteMesaj("Metroul care merge pe magistrala " + this.getNumarLinie() +
                " pleaca de la inceputul masgistralei, statia "  + this.denumirePrimaStatie +
                " si are capatul magistralei la linia " + this.denumireUltimaStatie);
    }

    public void schimbareTraseu(){
        trimiteMesaj("Metroul care merge pe magistrala " + this.getNumarLinie() +
                ", va circula astazi " + LocalDate.now() + " pe magistrala portocalie!");
    }
}
