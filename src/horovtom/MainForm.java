package horovtom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by horovtom on 10/12/16.
 */
public class MainForm extends JFrame {

    private JTextField textField1;
    private JButton button1;
    private JTextArea textArea1;
    private JPanel panelMain;

    public MainForm() {
        super("New Game");
        setContentPane(panelMain);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        requestFocus();
        setResizable(false);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
