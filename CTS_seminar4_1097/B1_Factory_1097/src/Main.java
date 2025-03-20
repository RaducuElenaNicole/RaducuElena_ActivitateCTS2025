import clase.Supa;
import factory.Factory;
import factory.TipSupa;

public class Main {
    public static void main(String[] args) {
        Factory meniuSupe = new Factory(200, 15);
        Supa supa1 = meniuSupe.getSupa(TipSupa.SupaDeLegume, "Legume, Smantana de gatit, Sare, Piper", 10);
        supa1.preparaSupa();
        Supa supa2 = meniuSupe.getSupa(TipSupa.SupaDeVita, "Vita, Cartof, Morcov", 15);
        supa2.preparaSupa();
        Supa supa3 = meniuSupe.getSupa(TipSupa.SupaDeCiuperci, "Ciuperci, Ceapa", 12);
        supa3.preparaSupa();
    }
}