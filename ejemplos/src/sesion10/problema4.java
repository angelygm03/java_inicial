package sesion10;

import java.util.Scanner;

public class problema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;  
        int impares = 0;
        int n = 1; 

        while (n <= 50) {
            System.out.print("Ingresa el número " + n + ": ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            n= n + 1;
        }
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

    }
}
