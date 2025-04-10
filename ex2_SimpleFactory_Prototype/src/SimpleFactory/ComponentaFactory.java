package SimpleFactory;

import clase.ComponentaBARA;
import clase.ComponentaCAPOTA;
import clase.ComponentaPORTBAGAJ;
import clase.ComponentaUSA;

public class ComponentaFactory {
    public IComponenta getComponenta(TipComponenta tip){
        switch (tip){
            case USA:
                ComponentaUSA usa = new ComponentaUSA();
                return usa;
            case BARA:
                ComponentaBARA bara = new ComponentaBARA();
                return bara;
            case CAPOTA:
                ComponentaCAPOTA capota = new ComponentaCAPOTA();
                return capota;
            case PORTBAGAJ:
                ComponentaPORTBAGAJ portbagaj = new ComponentaPORTBAGAJ();
                return portbagaj;
            default:
                return null;
        }
    }
}
