import javax.swing.*;

public class parte {
    public static void main(String[] args) {
        int item;
        double resta, mult;
        float carro = 2000;
        float moto = 1000;
        int dato = 1;
        double multi;
        JOptionPane.showMessageDialog(null, "======================================= \n" +
                "bienvenido al parqueadero los caballero \n" +
                "el costo por hora\n" +
                "carro : 2000 \n" + "moto : 1000 \n" +
                "=================================================");
        item = Integer.parseInt(JOptionPane.showInputDialog(null, "1. agregar carro \n" + " 2. agregar moto\n" + " 3 . salir"));
        switch ((int) item) {
            case 1:

                for (int i = 3; i < 3; i++) ;
                int[] placa = new int[3];
                JOptionPane.showInputDialog(null, "ingrese placa");
                for (int c = 3; c < 3; c++) ;
                Double[] hora_entrada = new Double[3];
                Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese hora entrada"));
                for (int c = 3; c < 3; c++) ;
                Double[] hora_salida = new Double[3];
                Double.parseDouble(JOptionPane.showInputDialog(null, "porfavor ingrese la hora que salio"));
                    JOptionPane.showMessageDialog(null,"datos carro" + c );

            break;
            case 2:

                for (int i = 3; i < 3; i++) ;
                int[] placam = new int[3];
                JOptionPane.showInputDialog(null, "ingrese placa");
                for (int i = 3; i < 3; i++) ;
                Double[] hora_entradam = new Double[3];
                Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese hora entrada"));
                for (int i = 3; i < 3; i++) ;
                Double[] hora_salidam = new Double[3];
                Double.parseDouble(JOptionPane.showInputDialog(null, "porfavor ingrese la hora que salio"));
            JOptionPane.showMessageDialog(null,"datos moto" + i );
            case 3:
                JOptionPane.showMessageDialog(null, "a salido");
            default:
                JOptionPane.showMessageDialog(null, "ese item no existe");
        }
    }
}
























/*
            for (int i = 0; i < 10; i++)
                int [] placa = new int[10];
                JOptionPane.showInputDialog(null, "porfavor ingrese placa");
            int [] hora_entrada = new int[10];
                Double.parseDouble(JOptionPane.showInputDialog(null, "hora de ingreso"));
            int [] hora_salida = new int[10];
                Double.parseDouble(JOptionPane.showInputDialog(null, "hora salida"));

            JOptionPane.showMessageDialog(null,"carros :" + carros );
        }

    }
}
*/