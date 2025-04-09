package clase;

public class MasinaVAN extends AMasina implements IMasina{
    public String destinatie;

    public MasinaVAN(String nrInmatriculare, int anFabricatie, String marca, String destinatie) {
        this.nrInmatriculare = nrInmatriculare;
        this.anFabricatie = anFabricatie;
        this.marca = marca;
        this.destinatie = destinatie;
    }

    @Override
    public void descriere() {
        System.out.println("MasinaVAN -> Marca: " + marca +
                " | An: " + anFabricatie +
                " | Nr: " + nrInmatriculare +
                " | Destinatia: " + destinatie);
    }
}
