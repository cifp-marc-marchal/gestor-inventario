import java.util.Arrays;

public class Inventory {
    String[] inventory = {"Ordenador", "Mesa", "Silla", "Pantalla", "Lapiz", "Goma", "Teclado", "Raton"};

    public void insertProduct(String product) {
        this.inventory = Arrays.copyOf(inventory, inventory.length + 1);
        this.inventory[inventory.length - 1] = product;
    }
}