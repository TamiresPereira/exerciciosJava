package classe;

import javax.swing.*;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
   this(1, 1, 1975);
    }

    Data(int diaInicial, int mesInicial, int anoInicial){
        this.dia = diaInicial;
        this.mes = mesInicial;
        this.ano = anoInicial;

    }

    String obterDataFormada (){
        final String formato = "%d/%d/%d";
        return String.format("%d/%d/%d",dia ,mes,ano );

    }
    void imprimirDataFormada(){
        System.out.println(this.obterDataFormada());
    }

}
