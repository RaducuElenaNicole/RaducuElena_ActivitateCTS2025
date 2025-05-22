package A8.clase;

public class Sectie implements StructuraSpital {
    private String denumireSectie;

    public Sectie(String denumireSectie) {
        this.denumireSectie = denumireSectie;
    }

    public String getDenumireSectie() {
        return denumireSectie;
    }

    public void setDenumireSectie(String denumireSectie) {
        this.denumireSectie = denumireSectie;
    }

    @Override
    public void descriereStructuraSpital() {
        System.out.println("       Sectie: " + this.denumireSectie);
    }

    // se pun exceptii deoarece aceste doua metode nu implementeaza nimic
    // in aceasta clasa, nu exista nicio lista / sublista
    // clasa reprezinta frunza
    // frunza NU are copii! => metodele nu vor implementa nimic
    @Override
    public void adaugaSubdepartament(StructuraSpital structura) throws Exception{
        throw new Exception();
    }

    @Override
    public void stergeSubdepartament(StructuraSpital structura) throws Exception {
        throw new Exception();
    }

    @Override
    public StructuraSpital getSubdepartament() {
        return null;
    }
}
