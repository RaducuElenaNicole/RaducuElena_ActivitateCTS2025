package clase;

import clase.baza.Nota;

public abstract class NotaDecorator implements Nota {
    private Nota nota;

    public NotaDecorator(Nota nota) {
        this.nota = nota;
    }

    protected abstract void printareFelicitare();

    @Override
    public void printareNota() {
        printareFelicitare();
        nota.printareNota();
    }

}
