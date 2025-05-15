package clase;

public class TramvaiHandler extends Handler {
    @Override
    public void recomanda(int distanta) {
        if(distanta <= 10){
            System.out.println("Se recomanda calatoria cu TRAMVAIUL!");
        } else if (handlerUrmator != null) {
            handlerUrmator.recomanda(distanta);
        }
    }
}
