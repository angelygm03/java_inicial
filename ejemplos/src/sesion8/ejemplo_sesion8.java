package sesion8;

import java.util.Scanner;

public class ejemplo_sesion8 {
    public static void main(String[] args) {
        /* Realizar un programa que ingrese 50 números y mostrarlos*/
        
        Scanner ing = new Scanner (System.in);
        int num = 0;
        for (int r=1; r<=50; r+=1)
        {
            System.out.println("Ingrese un numero: " + r);
            num = ing.nextInt();
        }
        System.out.println("Los numeros son:" + num);
    }
}
