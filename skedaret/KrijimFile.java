package Librari.skedaret;

import java.io.File;

public class KrijimFile {

    private static final String FILE_LOCATION_STUDENT = "C:\\Users\\User";

    public static void main(String[] args) {
        File fileBrendaExplorer = new File(FILE_LOCATION_STUDENT);
        System.out.println("Ekziston file i 'student.txt'? " + fileBrendaExplorer.exists());
        System.out.println("Eshte nje skedar i thjeshte? " + fileBrendaExplorer.isFile() + "! Eshte nje direktori? " + fileBrendaExplorer.isDirectory());
    }
    // krijo nje metode qe liston permbajtjen e file it qe shenjon ne pathin "....\\TCT"
    // TCT eshte folder brenda sistemit tuaj dhe mban nje folder brenda tij me titull :DETYRA: dhe dy file, perkatesisht
    //  :ShenimeJava.txt:
    //  :UshtrimeJava.txt:

    //   TCT
    //         DETYRA
    //              Detyra1.txt
    //         ShenimeJava.txt
    //         UshtrimeJava.txt

    // Nese file eshte direktori te printohet "Ne file in TCT ndodhet nje direktori: " emri i direktorise dhe permban "x" file brenda tij
    // Nese file eshte skedar i thjesht te printohet :Ne file in TCT ndodhet nje skedar i thjeshte: emri i skedarit

    // OUTPUTI I DESHIRUAR:
    /*
        Ne file in TCT ndodhet nje direktori: DETYRA dhe permban 1 file brenda tij
        Ne file in TCT ndodhet nje skedar i thjeshte: ShenimeJava
        Ne file in TCT ndodhet nje skedar i thjeshte: UshtrimeJava
    */

}
