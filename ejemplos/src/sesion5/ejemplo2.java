package sesion5;

import java.util.Scanner;

public class ejemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ni;
        System.out.println("Ingrese un numero: ");
        ni = sc.nextInt();
        if (ni %2 == 0) {
            System.out.println("El numero es par!!!");
        }
        else
        {
            System.out.println("El numero es impar!!!");
        }
        System.out.println("Fin del programa.");
    }
}
