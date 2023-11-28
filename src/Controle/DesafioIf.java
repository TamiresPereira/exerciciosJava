package Controle;

public class DesafioIf {
    public static void main(String[] args) {

        double nota =4;
        if (nota>= 9.0)  {
            System.out.println("quadro de honra");
            System.out.println("você é fera");
        }
        if (nota <9 && nota >=7) {
            System.out.println("Você está dentro da média");
        }
        if (nota <7 && nota >=0) {
            System.out.println("Vamos melhorar");
        }

    }
}
