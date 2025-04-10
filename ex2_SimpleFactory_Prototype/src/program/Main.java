package program;

import Prototype.ISticker;
import Prototype.Sticker;
import SimpleFactory.ComponentaFactory;
import SimpleFactory.IComponenta;
import SimpleFactory.TipComponenta;
import clase.Masina;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nPrototype\n");
        Sticker sticker = new Sticker("BMW", 2021, "dimensiuni");
        System.out.println(sticker.toString());

        Masina m1 = new Masina("Kia", 2007);
        ISticker sticker1 = sticker.cloneazaSticker(m1);
        System.out.println(sticker1.toString());
        sticker1.setDimensiuni("dimensiuni1");
        System.out.println(sticker1.toString());

        System.out.println("\n\nSimpleFactory\n");

        ComponentaFactory componentaFabrica = new ComponentaFactory();

        IComponenta usa = componentaFabrica.getComponenta(TipComponenta.USA);
        usa.descriere();

        IComponenta capota = componentaFabrica.getComponenta(TipComponenta.CAPOTA);
        capota.descriere();

        IComponenta bara = componentaFabrica.getComponenta(TipComponenta.BARA);
        bara.descriere();

        IComponenta portbagaj = componentaFabrica.getComponenta(TipComponenta.PORTBAGAJ);
        portbagaj.descriere();
    }
}
