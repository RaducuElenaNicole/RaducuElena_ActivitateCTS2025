package clase;

public class AutobuzHandler extends Handler {
    @Override
    public void recomanda(int distanta) {
        if(distanta <= 5){
            System.out.println("Este recomandata calatoria cu AUTOBUZUL!");
        } else if (handlerUrmator != null) {
            handlerUrmator.recomanda(distanta);
        }
    }
}
