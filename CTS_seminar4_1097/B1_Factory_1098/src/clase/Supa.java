package clase;

public abstract class Supa {
    private int gramaj;
    private float pretPerSutaG; // pretul per suta de grame
    private String ingrediente;
    private float nrCalorii;

    public float getPretPerSutaG() {
        return pretPerSutaG;
    }

    public Supa(int gramaj, float pretPerSutaG, String ingrediente, float nrCalorii) {
        this.gramaj = gramaj;
        this.pretPerSutaG = pretPerSutaG;
        this.ingrediente = ingrediente;
        this.nrCalorii = nrCalorii;
    }

    public abstract void preparaSupa();

    public double calculeazaPret(){
        return pretPerSutaG * (gramaj/100);
    }

    @Override
    public String toString() {
        return "SupaDeBaza {" +
                "gramaj = " + gramaj +
                " | pretPerSutaG = " + pretPerSutaG +
                " | ingrediente = '" + ingrediente +
                " | nrCalorii = " + nrCalorii +
                "} ";
    }
}
