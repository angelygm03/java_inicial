package ejemplos;
import java.util.Scanner;

public class Sesion4 {
    public static void main(String[] args) {
        /*Ingresar 2 números y generar 2 entre 1-100, los numeros generados
          se guardaran en variables, verificar de los numeros ingresados cual es
          el mayor y de los generados el menor. Luego elevar un numero ingresado
          a un numero generado
        */
        
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n1 = ing.nextInt();
        
        System.out.println("Ingrese otro numero: ");
        int n2 = ing.nextInt();
        
        int n3 = (int)(Math.random()*100+1);
        int n4 = (int)(Math.random()*100+1);
        
        System.out.println("Los numeros ingresados son: " + n1 + " y " + n2);
        System.out.println("Los numeros ingresados son: " + n3 + " y " + n4);
        
        System.out.println("El mayor de los numero ingresados es: " + Math.max(n1,n2));
        System.out.println("El menor de los numeros generados es: " + Math.min(n3,n4));
        System.out.println("El numero ingresado elevado al numero generado es: " + Math.pow(n1,n3));

    }
 
}
