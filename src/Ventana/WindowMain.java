package Ventana;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowMain extends JFrame {

    public JPanel panel1;
    private JLabel Nombre;
    private JTextField LabelNombre;
    private JLabel Apellido;
    private JTextField LabelApellido;
    private JLabel Edad;
    private JTextField LabelEdad;
    private JLabel Telefono;
    private JTextField LabelTelefono;
    private JLabel Tipo;
    private JTextField LabelTipo;
    private JButton realizarCompraButton;
    private JButton imprimirButton;
    private JButton enviarButton;
    private JTextField LabelProducto;
    private JTextField LabelPrecio;
    private JTextField LabelCantidad;
    private JTextField Total;


    public WindowMain() {
        realizarCompraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        imprimirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = LabelNombre.getText();
                String apellido = LabelApellido.getText();
                String edad = LabelEdad.getText();
                String telefono = LabelTelefono.getText();
                String tipo = LabelTipo.getText();
                String nombreProducto = LabelProducto.getText();
                Double precioProducto = Double.parseDouble(LabelPrecio.getText());
                int cantidadProducto = Integer.parseInt(LabelCantidad.getText());

                JOptionPane.showMessageDialog(null, "Nombre: " + nombre
                        + "\nApellido: " + apellido
                        + "\nEdad: " + edad
                        + "\nTelefono: " + telefono
                        + "\nTipo: " + tipo
                        + "\nNombre Producto: " + nombreProducto
                        + "\nPrecio Producto: " + precioProducto
                        + "\nCantidad Producto: " + cantidadProducto
                );
            }
        });
    }


}