package presentacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logica.Parcial;

public class InterfazParcial extends JFrame implements ActionListener {

    private JTextField tBase;
    private JTextField tExponente;
    private JLabel lResultado;
    private JButton bCalcular;
    private Parcial parcial;

    public InterfazParcial() {
        this.parcial = new Parcial();

        this.setTitle("Calculadora de Potencia");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4, 4));

        this.add(new JLabel("Base (b):"));
        this.tBase = new JTextField();
        this.add(this.tBase);

        this.add(new JLabel("Exponente (e):"));
        this.tExponente = new JTextField();
        this.add(this.tExponente);

        this.bCalcular = new JButton("Calcular potencia");
        this.bCalcular.addActionListener(this);
        this.add(this.bCalcular);

        this.add(new JLabel("Resultado:"));
        this.lResultado = new JLabel(" ");
        this.add(this.lResultado);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int base = Integer.parseInt(this.tBase.getText());
            int exp = Integer.parseInt(this.tExponente.getText());
            int resultado = this.parcial.potencia(base, exp);
            this.lResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ingresa numeros enteros validos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException | ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new InterfazParcial();
    }
}
