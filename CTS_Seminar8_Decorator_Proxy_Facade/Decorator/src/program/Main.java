package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Nota nota = new NotaPlata(150);
        nota.printareNota();

        System.out.println();

        Nota notaDecorata = new NotaAnNou(nota);
        notaDecorata.printareNota();

        System.out.println();

        Nota notaCraciun = new NotaCraciun(notaDecorata); // decorare multipla
        notaCraciun.printareNota();

        System.out.println();

        Nota notaPaste = new NotaPaste(notaDecorata);
        notaPaste.printareNota();

        System.out.println();

        Nota notaAnNou = new NotaAnNou(nota);
        notaAnNou.printareNota();
    }
}
