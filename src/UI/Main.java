package UI;

import UI.AddMaterialPanel;

import javax.swing.*;
import java.awt.*;

class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Gestión de Mediateca");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Agregar Material", new AddMaterialPanel());
        tabbedPane.addTab("Listar Materiales", new ListMaterialsPanel());

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow();
            window.setVisible(true);
        });
    }

    private static class ListMaterialsPanel extends Component {
    }
}
