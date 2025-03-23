package UI;

import javax.swing.*;
import java.awt.*;

public class AddMaterialPanel extends JPanel {
    public AddMaterialPanel() {
        setLayout(new GridLayout(8, 2));

        add(new JLabel("Código:"));
        JTextField codigoField = new JTextField();
        add(codigoField);

        add(new JLabel("Título:"));
        JTextField tituloField = new JTextField();
        add(tituloField);

        // Agregar más campos según el tipo de material...

        JButton agregarButton = new JButton("Agregar");
        agregarButton.addActionListener(e -> {
            // Lógica para agregar material
        });
        add(agregarButton);
    }
}
