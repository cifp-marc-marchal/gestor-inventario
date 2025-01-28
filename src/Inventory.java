import java.util.Arrays;

public class Inventory {
    String[] inventory = {"Ordenador", "Mesa", "Silla", "Pantalla", "Lapiz", "Goma", "Teclado", "Raton"};

    public void insertProduct(String product) {
        // Remove all spaces
        product = product.replaceAll("\\s+","");

        // Lowercase the product
        product = product.toLowerCase();

        // Make the first letter uppercase
        product = product.substring(0, 1).toUpperCase() + product.substring(1);

        // Do a copy of the array and add the new product
        this.inventory = Arrays.copyOf(inventory, inventory.length + 1);
        this.inventory[inventory.length - 1] = product;
    }
}