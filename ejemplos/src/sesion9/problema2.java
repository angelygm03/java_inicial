package sesion9;

import java.util.Scanner;

public class problema2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vocal = 0;
        int cons = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Ingrese una letra " + i + ": ");
            char letra = scanner.next().charAt(0);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocal =  vocal + 1;
            } else {
                cons = cons + 1;
            }
        }

        System.out.println("Cantidad de vocales ingresadas: " + vocal);
        System.out.println("Cantidad de consonantes ingresadas: " + cons);

        scanner.close();
    }
}

