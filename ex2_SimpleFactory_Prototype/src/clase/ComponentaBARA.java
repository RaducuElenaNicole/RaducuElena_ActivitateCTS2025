package clase;

import SimpleFactory.IComponenta;

public class ComponentaBARA implements IComponenta {
    @Override
    public void descriere() {
        System.out.println("Componenta: BARA");
    }
}
