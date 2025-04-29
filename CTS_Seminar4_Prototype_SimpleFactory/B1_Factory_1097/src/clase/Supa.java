package clase;

public abstract class Supa {
    private int gramaj;
    private float pretPerSutaG; // pretul per suta de grame
    private String ingrediente;

    public float getPretPerSutaG() {
        return pretPerSutaG;
    }

    public Supa(int gramaj, float pretPerSutaG, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaG = pretPerSutaG;
        this.ingrediente = ingrediente;
    }

    public abstract void preparaSupa();

    public double calculeazaPret(){
        return pretPerSutaG * (gramaj/100);
    }
}
