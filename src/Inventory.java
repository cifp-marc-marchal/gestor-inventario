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
}