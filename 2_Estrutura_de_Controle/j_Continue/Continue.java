package j_Continue;

public class Continue {
    public static void main(String[] args) {
        

        for (int i = 0; i <= 5; i++) {

            if (i == 3) {
               continue; // pula quando i for 3
            }
            
            System.out.println("Numero contado : " + i);
        }


    }

}
