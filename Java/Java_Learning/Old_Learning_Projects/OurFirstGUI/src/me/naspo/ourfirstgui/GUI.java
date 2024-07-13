package me.naspo.ourfirstgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private final JFrame frame = new JFrame();
    private final JPanel panel = new JPanel();
    private final JLabel label = new JLabel();

    public GUI() {
        run();
    }

    public void run() {

        JButton button = new JButton("Click Me");
        label.setText("Number of clicks: 0");

        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
