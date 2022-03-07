import java.util.Scanner;
public class Fluxo {

    public static void main (String[] args) {

        int valor1 = 1;
        int valor2 = 2;

        Scanner leitura=new Scanner (System.in);

        System.out.println ("digite um numero");
        valor1=leitura.nextInt();

        System.out.println ("digite outro numero");
        valor2=leitura.nextInt();

        System.out.println ((valor1>valor2 ? +valor1+ " é maior" : +valor2+" é maior"));
        if (valor1 > valor2) {
            System.out.println("1 é maior");
        } else {
            System.out.println("2 é maior");
        }
    }
}