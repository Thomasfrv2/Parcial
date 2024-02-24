import java.util.Scanner;

public class Divicion {


    static int divicion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n /  divicion(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa un numero para calcular su divicion: ");
        int num = scanner.nextInt();


        int resultado = divicion(num);
        System.out.println("la divicion de " + num + " es " + resultado);
    }
}
