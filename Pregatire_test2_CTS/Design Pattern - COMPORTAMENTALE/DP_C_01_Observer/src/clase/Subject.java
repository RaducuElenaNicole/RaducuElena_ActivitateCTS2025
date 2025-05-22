package clase;

public interface Subject {
    public void trimiteNotificare(String mesaj);

    public void adaugaCalator(Observer_Notificare obs);
    public void StergeCalator(Observer_Notificare obs);
}
