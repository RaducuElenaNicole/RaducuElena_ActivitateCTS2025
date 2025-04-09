package SimpleFactory;

import clase.*;

public class MasinaFactory {
    private String nrInmatriculare;
    private int anFabricatie;
    private String marca;

    public MasinaFactory(String nrInmatriculare, int anFabricatie, String marca) {
        this.nrInmatriculare = nrInmatriculare;
        this.anFabricatie = anFabricatie;
        this.marca = marca;
    }

    public AMasina getMasina(TipMasina tip, String extra){
        switch (tip){
            case VAN:
                MasinaVAN masinaVAN = new MasinaVAN(nrInmatriculare, anFabricatie, marca, extra);
                return masinaVAN;
            case SUV:
                MasinaSUV masinaSUV = new MasinaSUV(nrInmatriculare, anFabricatie, marca, extra);
                return masinaSUV;
            case SEDAN:
                MasinaSEDAN masinaSEDAN = new MasinaSEDAN(nrInmatriculare, anFabricatie, marca, extra);
                return  masinaSEDAN;
            default:
                return null;
        }
    }
}
