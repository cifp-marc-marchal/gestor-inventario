public class Inventory {
    String[] inventory = {"Ordenador", "Mesa", "Silla", "Pantalla", "Lapiz", "Goma", "Teclado", "Raton"};
    public void eliminar(String nombre) {
        String[] eliminado = new String[inventory.length - 1];
        if (nombre.equals("")) {
        }else {
            for (int i = 0; i < this.inventory.length; i++) {
                if (this.inventory[i].toLowerCase().equals(nombre.toLowerCase())) {
                    System.arraycopy(this.inventory,0, eliminado,0, i);
                    System.arraycopy(this.inventory,i+1, eliminado,i, this.inventory.length - i -1);
                    this.inventory = eliminado;
                }
            }
        }
    }
}
