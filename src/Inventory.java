import java.util.Arrays;

public class Inventory {
    String[] inventory = {"Ordenador", "Mesa", "Silla", "Pantalla", "Lapiz", "Goma", "Teclado", "Raton"};

    public void mostrar() {
        if (inventory.length == 0) {
            System.out.println("El inventario esta vacio");
        } else {
            String[] noRepe;
            noRepe = Arrays.copyOf(inventory, inventory.length);
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
                    System.out.print(noRepe[i] + " ");
                    System.out.println(cont);
                }
            }
        }
    }
  
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
  
   public void eliminar(String nombre) {
        String[] eliminado = new String[inventory.length - 1];
        if (!nombre.equals("")) {
            for (int i = 0; i < this.inventory.length; i++) {
                if (this.inventory[i].toLowerCase().equals(nombre.toLowerCase())) {
                    System.arraycopy(this.inventory, 0, eliminado,0, i);
                    System.arraycopy(this.inventory, i + 1, eliminado,i, this.inventory.length - i - 1);
                    this.inventory = eliminado;
                }
            }
        }
    }
}