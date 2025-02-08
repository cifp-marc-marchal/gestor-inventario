import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Inventory {
    String[] inventory = {"Ordenador", "Mesa", "Silla", "Pantalla", "Lapiz", "Goma", "Teclado", "Raton"};

    public Inventory() {
        File file = new File("inventory.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                saveInventoryToFile();
            } catch (IOException e) {
                System.out.println("Error al crear el archivo");
            }
        } else {
            try {
                Scanner scanner = new Scanner(file);
                if (scanner.hasNextLine()) {
                    int size = Integer.parseInt(scanner.nextLine());
                    this.inventory = new String[size];
                    for (int i = 0; i < this.inventory.length; i++) {
                        this.inventory[i] = scanner.nextLine();
                    }
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error al leer el archivo");
            } catch (NumberFormatException e) {
                System.out.println("Error en el formato del archivo de inventario");
            }
        }
    }

    private void saveInventoryToFile() {
        File file = new File("inventory.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(inventory.length + "\n");
            for (String string : inventory) {
                writer.write(string + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public void resumen() {
        if (inventory.length == 0) {
            System.out.println("El inventario esta vacio");
        } else {
            String[] noRepe;
            noRepe = Arrays.copyOf(inventory, inventory.length);
            System.out.println("+------------------------+");
            System.out.println("|  Producto  | Cantidad  |");
            System.out.println("+------------------------+");
            for (int i = 0; i < noRepe.length; i++) {
                int cont = 0;
                if (!noRepe[i].equalsIgnoreCase(" ")) {
                    for (int j = 0; j < noRepe.length; j++) {
                        if (noRepe[i].equals(noRepe[j])) {
                            cont++;
                            if (cont != 1) {
                                noRepe[j] = " ";
                            }
                        }
                    }
                    System.out.print("|   " + noRepe[i] + "   | " );
                    System.out.println(cont);
                    System.out.println("+-----------------------+");
                }
            }
        }
    }

    public void mostrar() {
        if (inventory.length == 0) {
            System.out.println("El inventario esta vacio");
        } else {
            System.out.println("+------------------------+");
            System.out.println("|  Pos  | Producto");
            System.out.println("+------------------------+");
            for (int i = 0; i < inventory.length; i++) {
                System.out.println("|   " + i + "   | " + inventory[i]);
                System.out.println("+------------------------+");
            }
        }
    }

    public void insertProduct(String product) {
        product = Helpers.normalize(product);
        this.inventory = Arrays.copyOf(inventory, inventory.length + 1);
        this.inventory[inventory.length - 1] = product;
        saveInventoryToFile();
    }

    public boolean eliminar(String nombre) {
        nombre = Helpers.normalize(nombre);
        String[] eliminado = new String[inventory.length - 1];
        if (!nombre.equals("")) {
            for (int i = 0; i < this.inventory.length; i++) {
                if (this.inventory[i].toLowerCase().equals(nombre.toLowerCase())) {
                    System.arraycopy(this.inventory, 0, eliminado, 0, i);
                    System.arraycopy(this.inventory, i + 1, eliminado, i, this.inventory.length - i - 1);
                    this.inventory = eliminado;
                    saveInventoryToFile();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean eliminarPos(int posicion) {
        String[] eliminado = new String[inventory.length - 1];
        if (posicion >= 0 && posicion < this.inventory.length) {
            for (int i = 0; i < this.inventory.length; i++) {
                if (i == posicion) {
                    System.arraycopy(this.inventory, 0, eliminado, 0, i);
                    System.arraycopy(this.inventory, i + 1, eliminado, i, this.inventory.length - i - 1);
                    this.inventory = eliminado;
                    saveInventoryToFile();
                    return true;
                }
            }
        }
        return false;
    }

    public void sustituirProducto(int posicion, String producto) {
        if (posicion >= 0 && posicion < this.inventory.length) {
            producto = Helpers.normalize(producto);
            this.inventory[posicion] = producto;
            saveInventoryToFile();
        } else {
            System.out.println("Posición fuera de rango.");
        }
    }

    public void modificarProducto(String oldName, String newName) {
        for (int i = 0; i < this.inventory.length; i++) {
            if (this.inventory[i].equalsIgnoreCase(oldName)) {
                newName = Helpers.normalize(newName);
                this.inventory[i] = newName;
                saveInventoryToFile();
                break;
            }
        }
    }
}