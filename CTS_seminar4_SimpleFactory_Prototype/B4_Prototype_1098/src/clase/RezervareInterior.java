package clase;

public class RezervareInterior extends AbstractRezervare{
    private boolean esteLaParter;

    public RezervareInterior(float nrParticpanti, int ora, String numeClient,
                             int ziuaLunii, boolean esteLaParter) {
        super(nrParticpanti, ora, numeClient, ziuaLunii);
        this.esteLaParter = esteLaParter;
    }

    public RezervareInterior() {
        super();
    }

    @Override
    public AbstractRezervare creeazaRezervare(int zi) {
        RezervareInterior rezervare = new RezervareInterior();

        rezervare.esteLaParter = this.esteLaParter;
        rezervare.numeClient = this.numeClient;
        rezervare.nrParticpanti = this.nrParticpanti;
        rezervare.ziuaLunii = zi;
        rezervare.ora = this.ora;

        return rezervare;
    }
}
