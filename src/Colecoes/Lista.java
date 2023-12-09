package Colecoes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("ana");

        lista.add(u1);
        lista.add(new Usuario("carlos"));
        lista.add(new Usuario("lia"));
        lista.add(new Usuario("bia"));
        lista.add(new Usuario("manu"));

        System.out.println(lista.get(3)); //acessa pelo indice

        System.out.println(".... " + lista.remove(1));
        System.out.println(lista.remove(new Usuario("manu")));

        System.out.println("Tem? " + lista.contains(new Usuario("lia")));
        System.out.println("Tem? " + lista.contains(u1));

        for (Usuario u : lista){
            System.out.println(u);
        }
    }
}
