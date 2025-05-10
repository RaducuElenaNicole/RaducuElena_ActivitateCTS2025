package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura{
    String nume;
    List<IStructura> lista;

    public Departament(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<IStructura> getLista() {
        return lista;
    }

    public void setLista(List<IStructura> lista) {
        this.lista = lista;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Departamentul: " + this.nume + " - Sectii: ");
        for(IStructura structura: lista){
            structura.descriereStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura structura) {
        lista.add(structura);
    }

    @Override
    public void stergeNod(IStructura structura) {
        lista.remove(structura);
    }

    @Override
    public IStructura getNodCopil() {
        return null;
    }
}
