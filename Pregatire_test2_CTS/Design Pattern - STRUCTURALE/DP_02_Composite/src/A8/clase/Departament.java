package A8.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements StructuraSpital {
    private String denumireDep;
    List<StructuraSpital> listaSubdepartamente;

    public Departament(String denumireDep) {
        this.denumireDep = denumireDep;
        this.listaSubdepartamente = new ArrayList<>();
    }

    public String getDenumireDep() {
        return denumireDep;
    }

    public List<StructuraSpital> getListaSubdepartamente() {
        return listaSubdepartamente;
    }

    @Override
    public void descriereStructuraSpital() {
        System.out.println("Departament: " + this.denumireDep + " - Subdepartamente: ");
        for(StructuraSpital dep: listaSubdepartamente){
            dep.descriereStructuraSpital();
            // DE FACUT!
            // System.out.println("Subdepartament: " + dep.getSubdepartament());
        }
    }

    @Override
    public void adaugaSubdepartament(StructuraSpital structura) {
        this.listaSubdepartamente.add(structura);
    }

    @Override
    public void stergeSubdepartament(StructuraSpital structura) {
        this.listaSubdepartamente.remove(structura);
    }

    @Override
    public StructuraSpital getSubdepartament() {
        return null;
    }
}
