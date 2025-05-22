package A8.clase;

public interface StructuraSpital {
    void descriereStructuraSpital();

    // metode specifice Composite
    void adaugaSubdepartament(StructuraSpital structura) throws Exception;
    void stergeSubdepartament(StructuraSpital structura) throws Exception;
    StructuraSpital getSubdepartament();
}
