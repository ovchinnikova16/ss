package snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Menu extends JFrame{

    private JButton buttonRandom;
    private JButton buttonRedactor;
    private JButton buttonOpen;

    public Menu(){ initComponents();}

    @SuppressWarnings("unchecked")
    private void initComponents(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
        JPanel p = new JPanel();
        add(p);

        buttonRandom = new JButton();
        buttonRedactor = new JButton();
        buttonOpen = new JButton();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        buttonRandom.setText("Create random level and play");
        buttonRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {randomActionPerformed(evt);}});
        buttonOpen.setText("Upload saved level");
        buttonOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {uploadActionPerformed(evt);}});
        buttonRedactor.setText("Create new level");
        buttonRedactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {createActionPerformed(evt);}});

        p.add(buttonRandom);
        p.add(buttonRedactor);
        p.add(buttonOpen);
        p.setLayout(new GridLayout());
    }

    private void createActionPerformed(ActionEvent evt) {
        this.dispose();
        new NewGame("redact").setVisible(true);
    }

    private void uploadActionPerformed(ActionEvent evt) {
        //Config config = new Config(25, 25, 25, 250);
        this.dispose();
    }

    private void randomActionPerformed(ActionEvent evt) {
        this.dispose();
        new NewGame("rnd").setVisible(true);
    }
}
