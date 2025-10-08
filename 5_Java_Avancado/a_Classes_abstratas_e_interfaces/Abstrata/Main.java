package a_Classes_abstratas_e_interfaces.Abstrata;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Victor" , 5000);
        gerente.baterPonto();
        System.out.println("Bônus : " + gerente.calcularBonus());
    }
}
