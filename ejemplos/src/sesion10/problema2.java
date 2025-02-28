package sesion10;

import java.util.Scanner;

public class problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        
        System.out.println("Ingrese un numero positivo o negativo: ");
        int num = sc.nextInt();
        
        while (num >= 0) {
            suma = (suma + num);
            System.out.println("Ingrese otro numero positivo o negativo: ");
            num = sc.nextInt();
        }
        System.out.println("La suma total de los numeros es: " + suma);
    }
    
}
