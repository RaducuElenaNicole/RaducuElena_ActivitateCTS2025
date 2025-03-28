package clase;

public class Pacient {
    private String numePacient;
    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCamera;
    private boolean areHalat;
    private String numeInsotitor;

    protected Pacient(String numePacient, boolean arePatRabatabil, boolean areMicDejun, boolean arePapuciDeCamera, boolean areHalat, String numeInsotitor) {
        this.numePacient = numePacient;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejun = areMicDejun;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalat = areHalat;
        this.numeInsotitor = numeInsotitor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient ");
        sb.append(numePacient);
        sb.append(" { ");
        sb.append("arePatRabatabil = ").append(arePatRabatabil);
        sb.append(" | areMicDejun = ").append(areMicDejun);
        sb.append(" | arePapuciDeCamera = ").append(arePapuciDeCamera);
        sb.append(" | areHalat = ").append(areHalat);
        sb.append(" | numeInsotitor = ").append(numeInsotitor);
        sb.append(" }");
        return sb.toString();
    }

    protected void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    protected void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    protected void setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
    }

    protected void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    protected void setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
    }

    protected void setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
    }
}
