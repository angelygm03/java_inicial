package sesion7;
// @Angely García - Noelia Cabrera
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número");
        int num2 = sc.nextInt();
        System.out.println("Menu");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Residuo");
        System.out.println("6. Exponencial");
        System.out.println("7. Salir");
        System.out.println("Ingrese una opcion: ");
        int opc = sc.nextInt();
        switch (opc)
        {
            case 1:System.out.println("El resultado de la suma es: " + (num1+num2)); break;
            case 2:System.out.println("El resultado de la resta es: " + (num1-num2)); break;
            case 3:System.out.println("El resultado de la multiplicacion es: " + (num1*num2));break;
            case 4:System.out.println("El resultado de la division es: " + (num1/num2));break;
            case 5:System.out.println("El resultado del residuo es: " + (num1%num2));break;
            case 6:System.out.println("El resultado del primero elevado al segundo es: " + Math.pow(num1, num2));break;
            case 7:System.out.println("Fin del programa");break;
            default:System.out.println("Opcion inválida");break;
        }  
    }
}
