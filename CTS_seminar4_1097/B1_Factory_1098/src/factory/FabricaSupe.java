package factory;

import clase.Supa;
import clase.SupaCocos;
import clase.SupaLegume;
import clase.SupaVita;

public class FabricaSupe {
    private int gramaj;
    private float pretPerSutaG;
    private float nrCalorii;

    public FabricaSupe(int gramaj, float pretPerSutaG, float nrCalorii) {
        this.gramaj = gramaj;
        this.pretPerSutaG = pretPerSutaG;
        this.nrCalorii = nrCalorii;
    }

    public Supa getSupa(TipSupa tip, String ingrediente, double extra){
        switch (tip){
            case SupaDeLegume:
                SupaLegume supaLegume = new SupaLegume(gramaj, pretPerSutaG, ingrediente, nrCalorii, extra);
                // ctrl + P
                // extra = gramajCrutoane
                return supaLegume;
            case SupaDeVita:
                SupaVita supaVita = new SupaVita(gramaj, pretPerSutaG, ingrediente, nrCalorii, extra);
                // extra = pretSmantana
                return supaVita;
            case SupaDeCocos:
                SupaCocos supaCocos = new SupaCocos(gramaj, pretPerSutaG, ingrediente, nrCalorii, extra);
                // extra = cantitateCiuperci
                return supaCocos;
            default:
                return null;
        }
    }
}
