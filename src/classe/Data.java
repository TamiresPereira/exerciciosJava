package classe;

import javax.swing.*;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
    dia = 15;
    mes = 1;
    ano = 2007;
    }

    Data(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;

    }

    String obterDataFormada (){
        return String.format("%d/%d/%d",dia ,mes,ano );
    }

}
