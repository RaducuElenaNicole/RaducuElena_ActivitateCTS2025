package clase;

public class NotaCraciun extends NotaDecorator{
    public NotaCraciun(Nota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit!");
    }
}
