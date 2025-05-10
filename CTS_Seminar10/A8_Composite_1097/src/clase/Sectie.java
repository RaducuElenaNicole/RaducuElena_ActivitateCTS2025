package clase;

public class Sectie implements IStructura{
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriereStructura() {
        System.out.println("   Sectie: " + this.nume);
    }

    @Override
    public void adaugaNod(IStructura structura) throws Exception {
        throw new Exception();
    }

    @Override
    public void stergeNod(IStructura structura) throws Exception {
        throw new Exception();
    }

    @Override
    public IStructura getNodCopil() {
        return null;
    }
}
