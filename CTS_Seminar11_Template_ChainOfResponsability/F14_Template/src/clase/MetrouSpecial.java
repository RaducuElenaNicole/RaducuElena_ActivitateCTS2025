package clase;

public class MetrouSpecial extends MetrouTemplate {

    @Override
    protected void opresteStatia1() {
        System.out.println("Metroul a oprit in statia 1.");
    }

    @Override
    protected void opresteStatia2() {
        System.out.println("Metroul a oprit in statia 2.");
    }

    @Override
    protected void opresteStatia3() {
        System.out.println("Metroul nu a oprit in statia 3. Statia 3 este in renovare!");
    }

    @Override
    protected void opresteStatia4() {
        System.out.println("Metroul a oprit in statia 4.");
    }

    @Override
    protected void opresteStatia5() {
        System.out.println("Metroul nu a oprit in statia 5. Statia 5 este in renovare!");
    }
}
