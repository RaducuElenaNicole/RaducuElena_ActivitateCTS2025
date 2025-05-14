package clase;

public class PlataSMS implements IMetodaPlata {
    @Override
    public void plateste(float pretBilet) {
        System.out.println("Plata prin SMS in valoare de " + pretBilet + " validata!");
    }
}
