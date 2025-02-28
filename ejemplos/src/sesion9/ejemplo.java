package sesion9;

import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        /*Realizar un programa que ingrese 10 alumnos con sus 10 notas, mostrar
        el promedio de las notas, mostrar la cantidad de alumnos aprobados y reprobados*/
        
        Scanner ing = new Scanner(System.in);
        double prom = 0;
        int suma = 0;
        int aprob = 0;
        int reprob = 0;
        
        for(int a=1;a<=10;++a)
        {
            System.out.println("Ingrese el nombre del alumno: ");
            String nom = ing.next();
            System.out.println("Ingrese la nota: ");
            int n = ing.nextInt();
            suma = suma+n;
            if (n>=60) {
                aprob = aprob+1;
            }
            else 
            {
                reprob = reprob+1;
            }
        }
        prom = suma/10;
        System.out.println("El promedio de las edades es: " + prom);
    }
}
