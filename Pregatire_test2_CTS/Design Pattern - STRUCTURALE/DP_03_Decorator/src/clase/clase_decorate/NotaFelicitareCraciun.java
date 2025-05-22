package clase.clase_decorate;

import clase.NotaDecorator;
import clase.baza.Nota;

public class NotaFelicitareCraciun extends NotaDecorator {

    public NotaFelicitareCraciun(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit!");
    }
}
