package tarea1;

public class Problema1 {
    
    public static void main(String[] args) {
        String nombreProd = " TV 65\" ";
        int precio = 12550;
        
        System.out.println("Producto: " + nombreProd);
        System.out.println("El precio es de: Q" + precio);
        System.out.println("Aplicando el descuento, el nuevo precio es de: Q" + (precio - (precio*0.05)));
    }
    
}
