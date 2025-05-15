package program;

import clase.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--------------- CHAIN OF RESPONSIBILITY ---------------\n");

        Handler troleibuz = new TroleibuzHandler();
        Handler autobuz = new AutobuzHandler();
        Handler tramvai = new TramvaiHandler();
        Handler metrou = new MetrouHandler();

        troleibuz.setHandlerUrmator(autobuz);
        autobuz.setHandlerUrmator(tramvai);
        tramvai.setHandlerUrmator(metrou);

        troleibuz.recomanda(7);
        troleibuz.recomanda(12);
        troleibuz.recomanda(1);
        troleibuz.recomanda(5);
    }
}
