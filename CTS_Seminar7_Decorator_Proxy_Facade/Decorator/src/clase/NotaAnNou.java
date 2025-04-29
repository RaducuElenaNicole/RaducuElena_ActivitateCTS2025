package clase;

public class NotaAnNou extends NotaDecorator{
    public NotaAnNou(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("An nou fericit!");
    }
}