package clase;

public class NotaPaste extends NotaDecorator {
    public NotaPaste(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Paste fericit!");
    }
}
