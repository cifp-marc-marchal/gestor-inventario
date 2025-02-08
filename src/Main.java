import java.util.Scanner;

public class Main {


    private static void separarEnPantalla() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = leerOpcion(scanner);
            separarEnPantalla();

            switch (opcion) {
                case 1:
                    insertarProducto(inventory, scanner);
                    break;
                case 2:
                    eliminarProductoPorNombre(inventory, scanner);
                    break;
                case 3:
                    eliminarProductoPorPosicion(inventory, scanner);
                    break;
                case 4:
                    sustituirProducto(inventory, scanner);
                    break;
                case 5:
                    System.out.println("Ingresa primero lo que quieres cambiar y luego lo que quieres poner: ");
                    inventory.modificarProducto(scanner.next(), scanner.next());
                    break;
                case 6:
                    mostrarInventario(inventory);
                    break;
                case 7:
                    mostrarResumenDelInventario(inventory);
                    break;
                case 8:
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    salir = true;
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 8.");
                    break;
            }

            System.out.println("Pulsa una tecla para continuar...");
            System.out.println();
            scanner.nextLine();
        }
        scanner.close();
    }

    private static void mostrarMenu() {
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
    }

    private static int leerOpcion(Scanner scanner) {
        int opcion;
        try {
            opcion = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, introduce un número válido.");
            return -1;
        }
        return opcion;
    }

    private static void insertarProducto(Inventory inventory, Scanner scanner) {
        System.out.println("Ingrese el nombre del producto que quieres Insertar: ");
        inventory.insertProduct(scanner.nextLine());
    }

    private static void eliminarProductoPorNombre(Inventory inventory, Scanner scanner) {
        System.out.println("Ingrese el nombre del producto que quieres eliminar: ");
        inventory.eliminar(scanner.nextLine());
    }

    private static void eliminarProductoPorPosicion(Inventory inventory, Scanner scanner) {
        System.out.println("Ingrese la posicion del producto que quieres eliminar: ");
        inventory.eliminarPos(scanner.nextInt());
    }

    private static void sustituirProducto(Inventory inventory, Scanner scanner) {
        System.out.println("Ingrese la posicion del producto que quieres sustituir y el producto que quieres substituir: ");
        inventory.sustituirProducto(scanner.nextInt(), scanner.nextLine());
    }

    private static void mostrarInventario(Inventory inventory) {
        System.out.println("Mostrando inventario: ");
        inventory.mostrar();
    }

    private static void mostrarResumenDelInventario(Inventory inventory) {
        System.out.println("Mostrando resumen del inventario: ");
        inventory.resumen();
    }
}