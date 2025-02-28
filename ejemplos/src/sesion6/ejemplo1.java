package sesion6;

import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ni;
        System.out.println("Ingrese un numero: ");
        ni = sc.nextInt();
        if (ni < 0)
        {
            System.out.println("El numero es negativo!!!");
        }
        else
        {
            if(ni > 0)
            {
                System.out.println("El numero es positivo!!!");
            }
            else
            {
                System.out.println("El numero es cero!!!");
            }
        }
        System.out.println("Fin del programa");
    }
}
