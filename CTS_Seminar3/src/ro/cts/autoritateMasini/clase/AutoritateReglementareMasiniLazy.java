package ro.cts.autoritateMasini.clase;

// Singleton - Lazy initialization

public class AutoritateReglementareMasiniLazy {
    private String nume;
    private String webSite;
    private int nrReglementari;
    private static AutoritateReglementareMasiniLazy instance = null;

    private AutoritateReglementareMasiniLazy(String nume, String webSite,
                                              int nrReglementari) {
        this.nume = nume;
        this.webSite = webSite;
        this.nrReglementari = nrReglementari;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public void reglementeazaModelMasina(String numeModel){
        nrReglementari++;
    }

    public static synchronized AutoritateReglementareMasiniLazy getInstance
            (String nume, String webSite) {
        if(instance == null){
            instance = new AutoritateReglementareMasiniLazy("Auto_Lazy", "www.autoritate_Lazy.ro", 0);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "AutoritateReglementareMasiniEager{" +
                "nume ='" + nume + '\'' +
                " | webSite ='" + webSite + '\'' +
                " | nrReglementari =" + nrReglementari +
                '}';
    }
}
