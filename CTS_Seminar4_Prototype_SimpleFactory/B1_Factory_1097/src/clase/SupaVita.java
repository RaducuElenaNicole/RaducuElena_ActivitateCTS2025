package clase;

public class SupaVita extends Supa{
    private double pretSmantana;

    public SupaVita(int gramaj, float pretPerSutaG, String ingrediente,
                    double pretSmantana) {
        super(gramaj, pretPerSutaG, ingrediente);
        this.pretSmantana = pretSmantana;
    }

    @Override
    public void preparaSupa() {
        System.out.println("Supa de VITA -> pretul unei portii de smantana este: " + pretSmantana);
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + pretSmantana;
    }
}
