package e_veriaveis_constantes;

public class AreaCircunferencia {
    public static void main(String[] args) {
     
        double raio = 3.4;
        final double PI = 3.14159;

        double area = PI * raio * raio;
        System.out.println(area);


        raio = 3.4;
        area = PI * raio * raio;
        System.out.println(area);

        System.out.println("Area : "+ area);


    }
}
