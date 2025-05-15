package clase;

public abstract class Handler {
    protected Handler handlerUrmator;

    public void setHandlerUrmator(Handler handlerUrmator) {
        this.handlerUrmator = handlerUrmator;
    }

    public abstract void recomanda(int distanta);
}
