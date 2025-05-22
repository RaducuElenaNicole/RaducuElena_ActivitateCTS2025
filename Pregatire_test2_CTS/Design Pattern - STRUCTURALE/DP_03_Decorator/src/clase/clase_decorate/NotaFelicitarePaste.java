package clase.clase_decorate;

import clase.NotaDecorator;
import clase.baza.Nota;

public class NotaFelicitarePaste extends NotaDecorator {
    public NotaFelicitarePaste(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Paste fericit!");
    }
}
