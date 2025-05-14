package clase;

public class SpitalPublic extends TemplateInternare{
    private String denumire;

    public SpitalPublic(String denumire) {
        this.denumire = denumire;
    }

    @Override
    int analizaDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificaDisponibilitatea() {
        System.out.println("Spital PUBLIC -> Nu exista suficiente paturi in spitalul public "
                + this.denumire + "!");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " a fost mutat la alt spital. " +
                "Nu sunt destule paturi pentru internarea pacientilor!");
    }
}
