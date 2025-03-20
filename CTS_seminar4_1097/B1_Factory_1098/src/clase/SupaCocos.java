package clase;

public class SupaCocos extends Supa{

    private double cantitateAripi;

    public SupaCocos(int gramaj, float pretPerSutaG, String ingrediente, float nrCalorii,
                     double cantitateCiuperci) {
        super(gramaj, pretPerSutaG, ingrediente, nrCalorii);
        this.cantitateAripi = cantitateCiuperci;
    }

    @Override
    public void preparaSupa() {
        System.out.println(toString());
        System.out.println("Supa de COCOS -> cantitatea de aripi de cocos este: " + cantitateAripi);
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + getPretPerSutaG() * (cantitateAripi /100);
    }
}
