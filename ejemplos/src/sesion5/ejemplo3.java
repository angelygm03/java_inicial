package sesion5;

import java.util.Scanner;

public class ejemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int n;
        int ni;
        n = ((int)(Math.random()*10+1));
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Adivina el numero generado entre 1 a 10: ");
        ni = sc.nextInt();
        if (n == ni) {
            System.out.println(nombre + " , felicidades. Acertaste!!!");
        }
        else 
        {
             System.out.println(nombre + ". Lo sentimos, el numero generado es " + n);
        }
        System.out.println("Fin del programa");
    }
}
