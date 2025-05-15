package clase;

public class EvenimentPrivat extends TemplateOcupareMasa {
    private String tipEveniment;
    private int numarMaximPersoane;


    public EvenimentPrivat(String tipEveniment, int numarMaximPersoane) {
        this.tipEveniment = tipEveniment;
        this.numarMaximPersoane = numarMaximPersoane;
    }

    public String getTipEveniment() {
        return tipEveniment;
    }

    public int getNumarMaximPersoane() {
        return numarMaximPersoane;
    }

    @Override
    public void curata() {
        System.out.println("Mesele sunt curatate si aranjate pentru evenimentul privat!");
    }

    @Override
    public void aseazaServetele() {
        System.out.println("S-au asezat servetele pentru evenimentul privat!");
    }

    @Override
    public void aseazaTacamuri() {
        System.out.println("Numarul de tacamuri utilizat este: " + this.numarMaximPersoane);
    }

    @Override
    public void invitatiePersoana(Invitat invitat) {
        System.out.println("Evenimentul privat de tipul " + this.tipEveniment
                + " a invitat urmatoarea persoana " + invitat.getNume()
                + ". Numar maxim de persoane care pot veni este " + invitat.getNumarPersoane());
    }
}
