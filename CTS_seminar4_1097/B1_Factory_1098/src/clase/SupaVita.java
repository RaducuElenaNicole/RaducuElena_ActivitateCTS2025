package clase;

public class SupaVita extends Supa{
    private double pretSmantana;

    public SupaVita(int gramaj, float pretPerSutaG, String ingrediente, float nrCalorii,
                    double pretSmantana) {
        super(gramaj, pretPerSutaG, ingrediente, nrCalorii);
        this.pretSmantana = pretSmantana;
    }

    @Override
    public void preparaSupa() {
        System.out.println(toString());
        System.out.println("Supa de VITA -> pretul unei portii de smantana este: " + pretSmantana);
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + pretSmantana;
    }
}
