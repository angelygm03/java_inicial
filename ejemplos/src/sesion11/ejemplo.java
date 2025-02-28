package sesion11;

import java.util.Scanner;

public class ejemplo {
    /*Realizar un programa que ingrese 5 nombres y 5 edades, cada uno en su vector. 
    Mostrar los nombres y las edades. Mostrar el promedio de las edades, en otro vector
    colocar si es menor o mayor de edad. Mostrar el nombre y su respectiva descripción
    si es menor o mayor de edad.*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombres[] = new String[10];
        String mayMen[] = new String[10];
        int edades[] = new int[10];
        System.out.println("Ingreso de nombres y edades");
        for(int i=0; i<=4;i++)
        {
            System.out.println("Ingrese el nombre: ");
            nombres[i] = sc.next();
            System.out.println("Ingrese la edad: ");
            edades[i] = sc.nextInt();
            if(edades[i] >= 18)
            {
                mayMen[i] = "Mayor de edad";
            }
            else
            {
                mayMen[i] = "Menor de edad";
            }
        }
        System.out.println("Mostrando datos de los vectores");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nombre: " + nombres[i] + " Edad: " + edades[i] + 
                    " Tipo: " + mayMen[i]);
        }
    }
}
