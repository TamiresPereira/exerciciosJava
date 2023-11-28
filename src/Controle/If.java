package Controle;

import java.util.Scanner;

public class If {
    public static void main (String[] ags) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("informe a média:");
        double media = entrada.nextDouble();

        if(media >=7 && media <+10) {
            System.out.println("Aprovado");
            System.out.println("Parabens");
        }
        if(media <7 && media >=5) {
            System.out.println("Recuperação");
        }
        if(media <5 && media >=0) {
            System.out.println("Reprovado");
        }
        entrada.close();

    }
}
