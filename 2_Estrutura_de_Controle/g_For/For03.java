package g_For;

public class For03 {
    
    // E Possivel criar um for dentro de outro for 
    public static void main(String[] args) {

        for (int i = 0; i <= 3 ; i++) {
                for(int j = 0; j <= 10; j++){
                    System.out.println("i : " + i + " j : " + j);
                
            }
        }
    }
}
