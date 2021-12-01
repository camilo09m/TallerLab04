package GUI;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DetalleDesastre extends JFrame {
    private DefaultTableModel model;
    private JPanel tablePanel;
    private JTable table;
    private JPanel buttonPanel;

    public DetalleDesastre(){
        this.tablePanel = new JPanel(new FlowLayout());
        add(tablePanel);
        this.buttonPanel = new JPanel(new FlowLayout());
        add(buttonPanel);
        agregarBoton();
        setTitle("Detalles de Desastres");
        setDefaultProperties();
    }
    private void setDefaultProperties(){
        setSize(800,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
}
    public DefaultTableModel getModel() {
        return model;
    }
    private void detalleDesaparecidos(){
        this.model = new DefaultTableModel();
        model.addColumn("Tipo de desastre Geofisico");
        model.addColumn("Numero de desaparecidos");
        this.table = new JTable(model);

        JScrollPane jScrollPane = new JScrollPane(this.table);
        this.tablePanel.add(jScrollPane);
    }
    private void agregarBoton(){

        JButton addContactButton = new JButton("Mostrar personas desaparecidas");
        addContactButton.addActionListener(e ->detalleDesaparecidos() );
        this.buttonPanel.add(addContactButton);

        JButton terminateProgramButton = new JButton("Cerrar");
        terminateProgramButton.addActionListener(e -> System.exit(0));
        this.buttonPanel.add(terminateProgramButton);
}
}

