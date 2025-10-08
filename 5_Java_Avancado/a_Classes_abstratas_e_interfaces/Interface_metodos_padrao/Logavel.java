package a_Classes_abstratas_e_interfaces.Interface_metodos_padrao;

public interface Logavel {

    void log(String msg);

    default void logInfo(String msg){
        System.out.println("[INFO]" + msg);
    }

    static void logErro(String msg) {
        System.err.println("[ERRO] " + msg);
    }

}
