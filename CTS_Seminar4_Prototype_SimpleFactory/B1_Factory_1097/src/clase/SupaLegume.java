package clase;

public class SupaLegume extends Supa {
    private double gramajCrutoane;

    public SupaLegume(int gramaj, float pretPerSutaG, String ingrediente,
                      double gramajCrutoane) {
        super(gramaj, pretPerSutaG, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }

    @Override
    public void preparaSupa() {
        System.out.println("Supa de LEGUME -> cantitatea de crutoane este: " + gramajCrutoane);
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + getPretPerSutaG() * (gramajCrutoane / 100);
    }
}
