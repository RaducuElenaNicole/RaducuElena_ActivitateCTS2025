package SingletonEager;

// Singleton - EAGER initialization

import clase.AMasina;

public class Service implements IService {
    private static Service instance = new Service();

    private AMasina masinaCurenta;

    private Service() {
    }

    public static Service getInstance() {
        return instance;
    }

    public AMasina getMasinaCurenta() {
        return masinaCurenta;
    }

    @Override
    public void acceptaMasina(AMasina masina) {
        if(masinaCurenta == null){
            masinaCurenta = masina;
            System.out.println("Masina acceptata are urmatoarele detalii: " + masina.toString());
        }else{
            System.out.println("Service-ul este ocupat! Nu poate fi acceptata nicio masina!");
        }
    }

    @Override
    public void eliberareService() {
        if(masinaCurenta != null){
            masinaCurenta = null;
            System.out.println("Service-ul s-a eliberat! Poate fi acceptata o alta masina!");
        }
    }
}
