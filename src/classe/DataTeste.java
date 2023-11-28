package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();

        var d2 = new Data(15, 1, 2007);

        var d3 = new Data();
        d3.dia = 1;
        d3.mes = 5;
        d3.ano = 1969;

        System.out.println(d1.obterDataFormada());
        System.out.println(d2.obterDataFormada());
        System.out.println(d3.obterDataFormada());
    }
}
