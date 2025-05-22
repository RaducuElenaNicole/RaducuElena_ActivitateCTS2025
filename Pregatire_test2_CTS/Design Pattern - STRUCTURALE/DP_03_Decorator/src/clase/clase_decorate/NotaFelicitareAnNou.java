package clase.clase_decorate;

import clase.NotaDecorator;
import clase.baza.Nota;

public class NotaFelicitareAnNou extends NotaDecorator {
    public NotaFelicitareAnNou(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("La multi ani! Un an nou fericit!");
    }
}
