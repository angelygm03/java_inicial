package sesion8;

import java.util.Scanner;

public class ejemplo {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese 10 nombres y 10 edades ");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese nombre " + i);
            String nombre = sc.next();
            System.out.println("Ingrese edad " + i);
            int edad = sc.nextInt();
            suma = suma + edad;
        }

        System.out.println("El promedio de las edades es " + (suma / 10));
    }
}

