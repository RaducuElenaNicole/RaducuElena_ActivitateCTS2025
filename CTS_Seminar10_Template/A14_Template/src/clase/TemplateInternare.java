package clase;

public abstract class TemplateInternare {
    abstract int analizaDificultate(Pacient pacient);
    abstract void verificaDisponibilitatea();
    abstract void emitereFisa(Pacient pacient);

    public final void internare(Pacient pacient){
        if(analizaDificultate(pacient) < 3){
            System.out.println("Pacientul " + pacient.getNume() + " nu necesita internare!");
        }else{
            System.out.println("Pacientul " + pacient.getNume() + " necesita internare! " +
                    "Starea de sanatatate este precara!");
            verificaDisponibilitatea();
            emitereFisa(pacient);
            System.out.println();
        }
    }

}
