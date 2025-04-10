package clase;

import SimpleFactory.IComponenta;

public class ComponentaUSA implements IComponenta {
    @Override
    public void descriere() {
        System.out.println("Componenta: USA");
    }
}
