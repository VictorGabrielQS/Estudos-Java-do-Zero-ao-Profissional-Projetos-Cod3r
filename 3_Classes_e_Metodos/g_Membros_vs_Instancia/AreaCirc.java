package g_Membros_vs_Instancia;

public class AreaCirc {

    double raio;
    final static double pi = 3.14;


    AreaCirc(double raioInicial) {
       raio = raioInicial;
    }

    double area(){
        return  pi * Math.pow(raio, 2);
    }

}
