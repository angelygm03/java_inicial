package sesion12;

import java.util.Scanner;

public class problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] clientes = new String[15][4];
        int opc = 0;
        
        do {
            System.out.println("-------------- MENU -------------");
            System.out.println("1. Ingresar clientes");
            System.out.println("2. Mostrar los datos");
            System.out.println("3. Reporte de clientes hombres");
            System.out.println("4. Reporte de cuentas de ahorro");
            System.out.println("5. Salir");
            System.out.println("Ingresa una opcion: ");
            opc = sc.nextInt();
            sc.nextLine();
            
            switch (opc) {
                case 1:
                    for (int c = 0; c < 15; c++) {
                        System.out.println("Datos personales del cliente " + (c+1));
                        System.out.println("Nombre: ");
                        clientes[c][0] = sc.nextLine();
                        System.out.println("Edad: ");
                        clientes[c][1] = sc.nextLine();
                        System.out.println("Genero F/M: ");
                        clientes[c][2] = sc.nextLine();
                        System.out.println("Tipo de cuenta: ");
                        clientes[c][3] = sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("------ INFORMACION DE CLIENTES ------");
                    for (int i = 0; i < 15; i++) {
                        System.out.println("Cliente " + (i + 1) + ": ");
                        System.out.println("Nombre: " + clientes[i][0]);
                        System.out.println("Edad: " + clientes[i][1]);
                        System.out.println("Genero: " + clientes[i][2]);
                        System.out.println("Cuenta: " + clientes[i][3]);
                        System.out.println("-------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("---- REPORTE DE CLIENTES HOMBRES ----");
                    for (int i = 0; i < 15; i++) {
                        if (clientes[i][2].equals("M")) {
                            System.out.println("Cliente " + (i + 1) + ": " + clientes[i][0]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("---- REPORTE CUENTAS DE AHORRO ----");
                    for (int i = 0; i < 15; i++) {
                        if (clientes[i][3].equals("Ahorro")) {
                            System.out.println("Cliente " + (i + 1) + ": " + clientes[i][0]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Hasta luego...");
                    break;
                    
                default:
                    System.out.println("Ingresa una opcion valida.");
            }
        } while (opc != 5);
    }
}
