package clase;

public class MetrouStanga extends MetrouTemplate {
    private int numarMetrou;

    public MetrouStanga(int numarMetrou) {
        this.numarMetrou = numarMetrou;
    }

    @Override
    protected void opresteStatia5() {
        System.out.println("Metroul cu numarul " + this.numarMetrou +
                " a oprit in statia 5 cu iesirea pe partea stanga.");
    }

    @Override
    protected void opresteStatia4() {
        System.out.println("Metroul cu numarul " + this.numarMetrou +
                " a oprit in statia 4 cu iesirea pe partea stanga.");
    }

    @Override
    protected void opresteStatia3() {
        System.out.println("Metroul cu numarul " + this.numarMetrou +
                " a oprit in statia 3 cu iesirea pe partea stanga.");
    }

    @Override
    protected void opresteStatia2() {
        System.out.println("Metroul cu numarul " + this.numarMetrou +
                " a oprit in statia 2 cu iesirea pe partea stanga.");
    }

    @Override
    protected void opresteStatia1() {
        System.out.println("Metroul cu numarul " + this.numarMetrou +
                " a oprit in statia 1 cu iesirea pe partea stanga.");
    }
}
