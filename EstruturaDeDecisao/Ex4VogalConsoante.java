package EstruturaDeDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex4VogalConsoante {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        String letra = scan.next();

        switch (letra.toUpperCase()){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":System.out.println("Vogal"); break;
            default: System.out.println("Consoante");
        }
    }
}
