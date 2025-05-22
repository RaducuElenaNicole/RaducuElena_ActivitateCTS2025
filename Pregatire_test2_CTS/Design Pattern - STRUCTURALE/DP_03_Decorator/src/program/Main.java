package program;

import clase.baza.Nota;
import clase.baza.NotaPlata;
import clase.clase_decorate.NotaFelicitareAnNou;
import clase.clase_decorate.NotaFelicitareCraciun;
import clase.clase_decorate.NotaFelicitarePaste;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------- DECORATOR ----------\n");

        Nota nota = new NotaPlata(150);
        nota.printareNota();

        System.out.println("\n-----------------");

        Nota notaCraciun = new NotaFelicitareCraciun(nota);
        notaCraciun.printareNota();

        System.out.println("\n-----------------");

        Nota notaPaste = new NotaFelicitarePaste(nota);
        notaPaste.printareNota();

        System.out.println("\n-----------------");

        Nota notaAnNou = new NotaFelicitareAnNou(nota);
        notaAnNou.printareNota();

        System.out.println("\n-----------------");

        Nota notaDecorareMultipla = new NotaFelicitareAnNou(notaCraciun);
        notaDecorareMultipla.printareNota();
    }
}
