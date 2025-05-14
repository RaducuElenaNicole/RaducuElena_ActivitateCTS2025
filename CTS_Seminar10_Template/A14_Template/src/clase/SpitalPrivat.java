package clase;

public class SpitalPrivat extends TemplateInternare{
    @Override
    int analizaDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void verificaDisponibilitatea() {
        System.out.println("Spital PRIVAT -> Exista suficienta paturi!");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pacientului " + pacient.getNume() + " i se emis cu succes fisa de internare!");
    }
}
