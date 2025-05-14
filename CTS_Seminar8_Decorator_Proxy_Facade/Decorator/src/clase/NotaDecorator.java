package clase;

public abstract class NotaDecorator implements Nota {
    private Nota nota;

    public NotaDecorator(Nota nota) {
        this.nota = nota;
    }

    @Override
    public void printareNota() {
        nota.printareNota();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();
}
