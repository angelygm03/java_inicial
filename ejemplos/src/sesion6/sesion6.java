package sesion6;

import java.util.Scanner;


public class sesion6 {
    /* Realizar un programa que permita el ingreso de una persona por medio de su usuario y su
    contraseña: la contraseña será de de 3 dígitos junto con las letras zxy, el usuario quiere
    agregar saldo a su cuenta, la cual contiene Q750 y el saldo que desea agregar es de Q1250, 
    al ingresar debe mostrar su saldo total. 
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String us = "Admin";
        int con = (int)(Math.random()*900+100);
        String cont = con + "xyz";
        System.out.println("La contraseña es: " + cont);
        System.out.println("Ingrese su usuario: ");
        String usin = sc.next();
        System.out.println("Ingrese su contraseña: ");
        String conin = sc.next();
        
        double saldo = 750;
        
        if (us.equals(usin) && cont.equals(conin))
        {
            System.out.println("Bienvenido");
            System.out.println("Su saldo es: Q" + (saldo+1250));
        }
        else
        {
            System.out.println("Datos ingresados no validos.");
        }
    }
    
}
