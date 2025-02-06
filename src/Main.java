import java.sql.Time;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("INVENTARIO CIFP PERE DE SON GALL");
            System.out.println("1. Añadir producto");
            System.out.println("2. Eliminar producto por nombre");
            System.out.println("3. Eliminar producto por posición");
            System.out.println("4. Sustituir producto");
            System.out.println("5. Modificar producto");
            System.out.println("6. Mostrar productos");
            System.out.println("7. Mostrar resumen del inventario");
            System.out.println("8. Salir");
            System.out.print("Introduce tu opción: ");

            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del producto que quieres Insertar: ");
                    inventory.insertProduct(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto que quieres eliminar: ");
                    inventory.eliminar(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Ingrese la posicion del producto que quieres eliminar: ");
                    inventory.eliminarPos(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Ingrese la posicion del producto que quieres sustituir y el producto que quieres substituir: ");
                    inventory.sustituirProducto(scanner.nextInt(), scanner.nextLine());
                    break;
                case 5:
                    System.out.println("Funcionalidad para modificar producto aún no implementada.");
                    break;
                case 6:
                    System.out.println("Mostrando inventario: ");
                    inventory.mostrar();
                    break;
                case 7:
                    System.out.println("Mostrando resumen del inventario: ");
                    inventory.resumen();
                    break;
                case 8:
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 8.");
                    break;
            }
        }

        scanner.close();
    }
}