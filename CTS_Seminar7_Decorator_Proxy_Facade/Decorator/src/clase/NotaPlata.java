package clase;

public class NotaPlata implements Nota{
    private float pretTotal;

    public NotaPlata(float pretTotal){
        this.pretTotal = pretTotal;
    }

    public float getPretTotal() {
        return pretTotal;
    }

    @Override
    public void printareNota() {
        System.out.println("Totalul de plata este: " + pretTotal);
    }
}
