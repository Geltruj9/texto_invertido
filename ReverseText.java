package textoinvertido;
import java.util.Scanner;
public class ReverseText{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Escribe algo: ");
        String entrada = sc.nextLine();
        String resultado = invertir(entrada);
        System.out.println("Resultado: " + resultado);
        sc.close();
    }

    public static String invertir(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
}


 