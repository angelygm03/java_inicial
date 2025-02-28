package sesion7;

public class funcionswitch {
    public static void main(String[] args) {
        /*Realizar un programa que genere numero entre 1-6 simulando un dado.
        Según el número generado la persona obtiene un premio. Mostrar el premio ganado.
        Premios: 1 Gracias por participar, 2 Q100, 3 Q300, 4 Q500, 5 Q1500, 6 Q3000*/

        int n = (int)(Math.random()*6+1);
        System.out.println("1. Gracias por participar");
        System.out.println("2. Q100");
        System.out.println("3. Q300");
        System.out.println("4. Q500");
        System.out.println("5. Q1500");
        System.out.println("6. Q3000");
        System.out.println("Su numero es: " + n);
        
        
    }
  
}
