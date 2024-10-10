import javax.swing.*;

public class IngresosClientes implements Runnable {

    CajaEmpresa ce = new CajaEmpresa();
    Articulos articulo1 = new Articulos(1, "Balon", 10f);
    Articulos articulo2 = new Articulos(1, "chaqueta", 29f);
    Articulos articulo3 = new Articulos(1, "sujetador", 8f);
    private int ingreso;


    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            String nombreProducto = JOptionPane.showInputDialog("Introduce el nombre del articulo a comprar(balon, chaqueta, sujetador):");

            while (!comprobarNombreProducto(nombreProducto)) {
                nombreProducto = JOptionPane.showInputDialog("Articulo inexistente, por favor, introduce el nombre del articulo a comprar(balon, chaqueta, sujetador):");
            }

            ingreso = Integer.parseInt(JOptionPane.showInputDialog("Introduce el pago: "));

            do {

            } while (ingreso <= 0);

            ce.setDineroCaja(ingreso);
            JOptionPane.showMessageDialog(null, "Dinero en caja: " + ce.getDineroCaja() + "€");


        }

    }

    public boolean comprandoArticulo(String nombre, float pago) {

        boolean marca = true;


        if (nombre.equalsIgnoreCase(articulo1.getNombre())) {

            if (pago < articulo1.getPrecio()) {
                marca = false;
            }

        } else if (nombre.equalsIgnoreCase(articulo2.getNombre())) {

            if (pago < articulo2.getPrecio()) {
                marca = false;
            }

        } else if (nombre.equalsIgnoreCase(articulo3.getNombre())) {

            if (pago < articulo3.getPrecio()) {
                marca = false;
            }

        }
        return marca;
    }

    public boolean comprobarNombreProducto(String nombre) {

        return nombre.equalsIgnoreCase("balon") || nombre.equalsIgnoreCase("chaqueta") || nombre.equalsIgnoreCase("sujetador");
    }

    public float damePrecio(String nombre) {

        if (nombre.equalsIgnoreCase(articulo1.getNombre())) {
            return articulo1.getPrecio();
        } else if (nombre.equalsIgnoreCase(articulo2.getNombre())) {
            return articulo2.getPrecio();
        } else if (nombre.equalsIgnoreCase(articulo3.getNombre())) {
            return articulo3.getPrecio();
        }
        return  0;
    }

}
