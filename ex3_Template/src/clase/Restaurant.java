package clase;

public class Restaurant extends TemplateOcupareMasa {


    @Override
    public void curata() {
        System.out.println("Toate mesele libere sunt curatate.");
    }

    @Override
    public void aseazaServetele() {
        System.out.println("Exista servetele pe fiecare masa intr-un suport.");
    }

    @Override
    public void aseazaTacamuri() {
        System.out.println("Tacamurile sunt aduse de chelner dupa ce s-a luat comanda.");
    }

    @Override
    public void invitatiePersoana(Invitat invitat) {
        System.out.println("La acest restaurant nu se realizeaza invitatii nominale! " +
                "Pe numele " + invitat.getNume() + " s-a facut o rezervare!");
    }
}
