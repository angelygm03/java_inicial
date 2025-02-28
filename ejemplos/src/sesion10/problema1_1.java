package sesion10;

import java.util.Scanner;

public class problema1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int p = 1;
        
        do {
            System.out.println("Ingrese el precio del producto " + p + ": ");
            double precio = sc.nextDouble();
            total = (precio + total);
            p = p + 1;
        } while (p <= 10);
            System.out.println("El total a pagar es: " + total);
    }
}
