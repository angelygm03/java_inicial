package tarea1;

public class Problema4 {
    
    public static void main(String[] args) {
        int n1 = (int)(Math.random()*51+50); 
        int n2 = (int)(Math.random()*51+50); 
        int n3 = (int)(Math.random()*51+50);
        double promedio = (n1+n2+n3)/3;
        
        System.out.println("El primer numero generado es: " + n1);
        System.out.println("El segundo numero generado es: " + n2);
        System.out.println("El tercer numero generado es: " + n3);
        System.out.println("El promedio es de: " + promedio);
    }
}
