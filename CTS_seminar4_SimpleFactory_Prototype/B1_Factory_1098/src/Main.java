import clase.Supa;
import factory.FabricaSupe;
import factory.TipSupa;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");

        FabricaSupe meniuSupe = new FabricaSupe(200, 15, 1750);

        Supa supa1 = meniuSupe.getSupa(TipSupa.SupaDeLegume, "Legume, Smantana de gatit, Sare, Piper", 10);
        supa1.preparaSupa();
        System.out.println("\n");

        Supa supa2 = meniuSupe.getSupa(TipSupa.SupaDeVita, "Vita, Cartof, Morcov", 15);
        supa2.preparaSupa();
        System.out.println("\n");

        Supa supa3 = meniuSupe.getSupa(TipSupa.SupaDeCocos, "Ciuperci, Ceapa", 12);
        supa3.preparaSupa();
        System.out.println("\n");
    }
}