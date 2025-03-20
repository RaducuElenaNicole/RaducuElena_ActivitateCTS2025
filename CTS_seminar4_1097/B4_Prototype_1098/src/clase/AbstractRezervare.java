package clase;

public abstract class AbstractRezervare {
    protected float nrParticpanti;
    protected int ora;
    protected String numeClient;
    protected int ziuaLunii;

    public AbstractRezervare() {
        this.nrParticpanti = 10;
        this.ora = 5;
        this.ziuaLunii = 2;
        this.numeClient = "Vasile";
    }

    public AbstractRezervare(float nrParticpanti, int ora, String numeClient, int ziuaLunii) {
        if(nrParticpanti < 2){
            this.nrParticpanti = 2;
        }else{
            this.nrParticpanti = nrParticpanti;
        }

        if(ora >= 10 && ora <= 22){
            this.ora = ora;
        }else{
            this.ora = 12;
        }

        if(numeClient.length() >= 3){
            this.numeClient = numeClient;
        }else{
            this.numeClient = "Anonim";
        }

        if(ziuaLunii >= 1 && ziuaLunii <= 31){
            this.ziuaLunii = ziuaLunii;
        }else{
            this.ziuaLunii = 1;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractRezervare{");
        sb.append("nrParticpanti=").append(nrParticpanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }

    public abstract AbstractRezervare creeazaRezervare(int x);

    public void setNrParticpanti(float nrParticpanti) {
        this.nrParticpanti = nrParticpanti;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setZiuaLunii(int ziuaLunii) {
        this.ziuaLunii = ziuaLunii;
    }
}
