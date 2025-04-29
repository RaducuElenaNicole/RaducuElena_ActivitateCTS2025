package clase;

public class SupaCiuperci extends Supa{

    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, float pretPerSutaG, String ingrediente,
                        double cantitateCiuperci) {
        super(gramaj, pretPerSutaG, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public void preparaSupa() {
        System.out.println("Supa de CIUPERCI -> cantitatea de ciuperci este: " + cantitateCiuperci);
    }

    @Override
    public double calculeazaPret() {
        return super.calculeazaPret() + getPretPerSutaG() * (cantitateCiuperci/100);
    }
}
