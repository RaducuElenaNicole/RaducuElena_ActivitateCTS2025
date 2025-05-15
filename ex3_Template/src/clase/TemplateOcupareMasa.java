package clase;

public abstract class TemplateOcupareMasa {
    public abstract void curata();
    public abstract void aseazaServetele();
    public abstract void aseazaTacamuri();
    public abstract void invitatiePersoana(Invitat invitat);

   public final void ocupareMasa(Invitat invitat) {
        curata();
        aseazaServetele();
        aseazaTacamuri();
        invitatiePersoana(invitat);
        System.out.println("-------- Masa s-a ocupat! --------");
    }
}
