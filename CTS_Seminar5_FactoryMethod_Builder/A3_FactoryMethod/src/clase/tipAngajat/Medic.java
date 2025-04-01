package clase.tipAngajat;

public class Medic extends PersonalSpital {
    private double spor;

    public Medic(String nume, double salariu, double vechime) {
        super(nume, salariu);
        this.spor = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("vechime=").append(spor);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
