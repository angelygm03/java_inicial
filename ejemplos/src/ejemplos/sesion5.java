package ejemplos;

import java.util.Scanner;

public class sesion5 {
  
    public static void main(String[] args) {
        /* Realizar un programa que ingrese usuario y contraseña, sin 
        ambas son correctas mostrar un mensaje de bienvenida y si no mostrar 
        datos incorrectos
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        String us = sc.next();
        System.out.print("Ingrese su contraseña: ");
        String con = sc.next();
        if (us.equals("Angely") && con.equals("123ab"))
        {
            System.out.println("Bienvenido "  + us);
        }
        else
        {
            System.out.println("Datos incorrectos");
        }
    }
}
