package k_conversões;

public class Exercicio {
public static void main(String[] args) {
    

    // ✅ Exercicio 1 : 

    // 1 - Receba um número double com valor decimal.
    double valorDouble = 145.78; 
    System.out.println("Valor double: " + valorDouble);


    // 2 -Converta esse número para int e mostre o valor inteiro.
    int valorInt = (int) valorDouble;
    System.out.println("Convertido para int: " + valorInt);
    

    // 3 - Converta o número original para byte e mostre o resultado (pode estourar!).
    byte valorByte = (byte) valorDouble;
    System.out.println("Convertido para byte: " + valorByte);



    // 4 - Pegue um caractere (ex: 'Z') e mostre o valor inteiro (código ASCII).
    char caractere = 'Z';
    int valorCaractereInt = caractere;
    System.out.println("Caractere " + "'" + caractere +"'" + " em int: " + valorCaractereInt);

    
    //5 - Faça o caminho inverso: a partir de um número, exiba o caractere correspondente.
    int codigoInt = 88;
    char caractereCodigo = (char) codigoInt ;

    System.out.println("Código " +  codigoInt + " corresponde a: " + caractereCodigo);



}
}
