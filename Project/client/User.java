package client;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class User extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 7912406445829494669L;
    private String name;
    private JTextField nameField;

    public User(String name) {
        this.name = name;
        nameField = new JTextField(name);
        nameField.setEditable(false);
        this.setLayout(new BorderLayout());
        this.add(nameField);
    }

    public String getName() {
        return name;
    }
}