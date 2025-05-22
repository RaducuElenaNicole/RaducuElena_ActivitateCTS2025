package A6;

import A6.clase.Medic;
import A6.clase.Pacient;
import A6.clase.Salon;

public class ModulFacade {
    public String verificareInternarePacient(Pacient pacient){
        Salon salon = new Salon();
        Medic medic = new Medic();

        if(pacient.verificaGravitateStare()){
            if(medic.confirmareInternare(pacient)){
                if(salon.disponibilitatePat()){
                    return "Pacientul " + pacient.getNumePacient() +
                            " cu gravitatea " + pacient.getGravitateStarePacient() +
                            " va fi internat cu succes!";
                }else{
                    return "Pacientul " + pacient.getNumePacient() +
                            " cu gravitatea " + pacient.getGravitateStarePacient() +
                            " trebuie internat, dar nu s-a gasit niciun pat liber!";
                }
            }else{
                return "Pacientul " + pacient.getNumePacient() +
                        " cu gravitatea " + pacient.getGravitateStarePacient() +
                        " nu a primit confirmarea medicului pentru internare!";
            }
        }else{
            return "Pacientul " + pacient.getNumePacient() +
                    " nu are nevoie de internare!";
        }
    }
}
