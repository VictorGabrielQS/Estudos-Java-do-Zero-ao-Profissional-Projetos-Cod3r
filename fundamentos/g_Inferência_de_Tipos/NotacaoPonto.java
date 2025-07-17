package g_Inferência_de_Tipos;

public class NotacaoPonto {

    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Senhora" )
        .toUpperCase()
        .concat("!!!");
        System.out.println(s);

        // Tipos Primitivos não tem o operador "."
        int a = 3;
        System.out.println(a);
        
    }
}
