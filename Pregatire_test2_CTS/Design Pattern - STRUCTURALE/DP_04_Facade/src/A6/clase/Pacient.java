package A6.clase;

public class Pacient {
    private String numePacient;
    private int gravitateStarePacient;

    public Pacient(String numePacient, int gravitateStarePacient) {
        this.numePacient = numePacient;
        this.gravitateStarePacient = gravitateStarePacient;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public int getGravitateStarePacient() {
        return gravitateStarePacient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", gravitateStarePacient=").append(gravitateStarePacient);
        sb.append('}');
        return sb.toString();
    }

    public boolean verificaGravitateStare(){
        if(this.gravitateStarePacient >= 3){
            return true;
        }else{
            return false;
        }
    }
}
