package clase;

public class RezervareTerasa extends AbstractRezervare{

    private boolean esteFumator;

    public RezervareTerasa() {
        super();
    }

    @Override
    public AbstractRezervare creeazaRezervare(int zi) {
        RezervareTerasa rezervare = new RezervareTerasa();

        rezervare.esteFumator = this.esteFumator;
        rezervare.numeClient = this.numeClient;
        rezervare.nrParticpanti = this.nrParticpanti;
        rezervare.ziuaLunii = zi;
        rezervare.ora = this.ora;

        return rezervare;
    }

    public RezervareTerasa(float nrParticpanti, int ora, String numeClient, int ziuaLunii, boolean esteFumator) {
        super(nrParticpanti, ora, numeClient, ziuaLunii);
        this.esteFumator = esteFumator;
    }
}
