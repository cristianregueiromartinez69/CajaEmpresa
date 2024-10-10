import javax.swing.*;

public class IngresosClientes implements Runnable{

    CajaEmpresa ce = new CajaEmpresa();
    private int ingreso;

    @Override
    public void run() {

        for(int i = 0; i < 10; i++){

            do{
                ingreso = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dinero para la compra del artículo, por favor: "));
                try{

                }catch(NumberFormatException e){
                    ingreso = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dinero para la compra del artículo, por favor: "));
                }
            }while(ingreso <=0);


        }

    }



}
