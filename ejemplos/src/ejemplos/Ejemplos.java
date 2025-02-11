package ejemplos;

public class Ejemplos {
    
    public static void main(String[] args) {
        int PrecioProducto=300;
        double Iva=0.12;
        System.out.println("Informacion del producto");
        System.out.println("El precio del producto es: " + PrecioProducto);
        System.out.println("El precio del producto, incluyendo IVA es: " + (PrecioProducto + (PrecioProducto*Iva)));
    }

}