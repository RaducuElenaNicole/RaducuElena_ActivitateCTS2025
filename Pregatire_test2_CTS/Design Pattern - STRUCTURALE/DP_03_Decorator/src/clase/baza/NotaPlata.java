package clase.baza;

public class NotaPlata implements Nota{
    private float pretTotalNota;

    public NotaPlata(float pretTotalNota) {
        this.pretTotalNota = pretTotalNota;
    }

    public float getPretTotalNota() {
        return pretTotalNota;
    }

    @Override
    public void printareNota() {
        System.out.println("Totalul de plata este " + this.pretTotalNota);
    }
}
