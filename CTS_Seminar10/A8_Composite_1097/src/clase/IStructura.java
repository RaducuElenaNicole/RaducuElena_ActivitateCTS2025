package clase;

public interface IStructura {
    void descriereStructura();

    // metode specifice composite

    void adaugaNod(IStructura structura) throws Exception;
    void stergeNod(IStructura structura) throws Exception;
    IStructura getNodCopil();
}
