package ejemplos;

public class ejemplo3 {
    public static void main(String[] args) {
        System.out.print("Un numero al azar entre 0 y 1: ");
        System.out.println(Math.random());
        System.out.print("Un numero al azar ente 50 y 150: ");
        System.out.println((int)(Math.random()*100+50));
        System.out.print("Una letra minuscula al azar: ");
        System.out.println((char)(Math.random()*26+'a'));
        
        System.out.print("Coseno de PI radianes: ");
        System.out.println(Math.cos(Math.PI));
        System.out.print("Seno de 45 grados: ");
        System.out.println(Math.sin(Math.toRadians(45)));
        System.out.print("Arco cuya tangente es 1: ");
        System.out.println(Math.toDegrees(Math.atan(1)));
        
        System.out.print("Raíz cuadrada de 36: ");
        System.out.println(Math.sqrt(36));
        System.out.print("Cinco elevado al cubo: ");
        System.out.println(Math.pow(5.0, 3.0));
        System.out.print("Exponencial de 2: ");
        System.out.println(Math.exp(2));
        System.out.print("Logaritmo de 2,71828: ");
        System.out.println(Math.log(2.71828));

        System.out.print("Mayor valor entre 2 y 3: ");
        System.out.println(Math.max(2, 3));
        System.out.print("Valor absoluto de -4.5: ");
        System.out.println(Math.abs(-4.5));
        System.out.print("Menor entero mas cercano a -4.5: ");
        System.out.println(Math.floor(-4.5));
        System.out.print("Mayor entero mas cercano a -4.5: ");
        System.out.println(Math.ceil(-4.5));
        System.out.print("Redondeando -4.5 con ROUND: ");
        System.out.println(Math.round(-4.5));
        System.out.print("Redondeando 4.5 con ROUND: ");
        System.out.println(Math.round(4.5));
        System.out.print("Redondeando -4.6 con RINT: ");
        System.out.println(Math.rint(-4.6));
        System.out.print("Redondeando 4.5 con RINT: ");
        System.out.println(Math.rint(4.5));
    }
}
