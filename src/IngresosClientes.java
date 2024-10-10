import javax.swing.*;

public class IngresosClientes implements Runnable{

    CajaEmpresa ce = new CajaEmpresa();

    @Override
    public void run() {

        for(int i = 0; i < 10; i++){

            int ingreso = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dinero para la compra del artículo, por favor: "));
            

        }

    }



}
