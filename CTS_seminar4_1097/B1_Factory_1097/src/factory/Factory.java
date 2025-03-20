package factory;

import clase.Supa;
import clase.SupaCiuperci;
import clase.SupaLegume;
import clase.SupaVita;

public class Factory {
    private int gramaj;
    private float pretPerSutaG;

    public Factory(int gramaj, float pretPerSutaG) {
        this.gramaj = gramaj;
        this.pretPerSutaG = pretPerSutaG;
    }

    public Supa getSupa(TipSupa tip, String ingrediente, double extra){
        switch (tip){
            case SupaDeLegume:
                SupaLegume supaLegume = new SupaLegume(gramaj, pretPerSutaG, ingrediente, extra);
                // ctrl + P
                // extra = gramajCrutoane
                return supaLegume;
            case SupaDeVita:
                SupaVita supaVita = new SupaVita(gramaj, pretPerSutaG, ingrediente, extra);
                // extra = pretSmantana
                return supaVita;
            case SupaDeCiuperci:
                SupaCiuperci supaCiuperci = new SupaCiuperci(gramaj, pretPerSutaG, ingrediente, extra);
                // extra = cantitateCiuperci
                return supaCiuperci;
            default:
                return null;
        }
    }
}
