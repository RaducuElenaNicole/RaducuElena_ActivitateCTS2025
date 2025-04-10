package Prototype;

import clase.Masina;

public class Sticker extends Masina implements ISticker{
    private String dimensiuni;

    public Sticker() {
        super();
    }

    public Sticker(String model, int anFabricatie, String dimensiuni) {
        super(model, anFabricatie);
        this.dimensiuni = dimensiuni;
    }

    @Override
    public ISticker cloneazaSticker(Masina masina) {
        Sticker stickerNou = new Sticker();

        stickerNou.dimensiuni = this.dimensiuni;
        stickerNou.anFabricatie = masina.anFabricatie;
        stickerNou.model = masina.model;

        return stickerNou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("dimensiuni='").append(dimensiuni).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append('}');
        return sb.toString();
    }

    public ISticker setDimensiuni(String dimensiuni) {
        this.dimensiuni = dimensiuni;
        return this;
    }
}
