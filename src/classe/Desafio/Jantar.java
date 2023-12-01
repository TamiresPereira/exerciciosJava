package classe.Desafio;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("arroz", 0.223);
        Comida c2 = new Comida("feijao",0.300);

        Pessoa p = new classe.Desafio.Pessoa("Heloisa", 60.1);

        System.out.println(p.apresentar());
        p.comer(c1);

        System.out.println(p.apresentar());
        p.comer(c2);

        System.out.println(p.apresentar());
    }
}
