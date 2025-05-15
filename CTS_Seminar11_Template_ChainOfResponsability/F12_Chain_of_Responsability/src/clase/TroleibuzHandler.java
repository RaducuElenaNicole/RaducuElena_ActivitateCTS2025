package clase;

public class TroleibuzHandler extends Handler {
    @Override
    public void recomanda(int distanta) {
        if(distanta < 0){
            System.out.println("Valoarea parametrului este incorecta!");
        }

        if(distanta < 3){
            System.out.println("Se recomnada calatorie cu TROLEIBUZUL!");
        } else if (handlerUrmator != null) {
            handlerUrmator.recomanda(distanta);
        }
    }
}
