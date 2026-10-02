package it.unina.Boundary;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import it.unina.Boundary.FormRegistrazione;

public class MainForm {

    private JPanel panel1;
    private JButton registratiButton;
    private JButton autenticatiButton;

    public MainForm() {
        registratiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onClickRegistrati();
            }
        });
        autenticatiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onClickAccedi();
            }
        });
    }

    public void onClickRegistrati() {
        FormRegistrazione form = new FormRegistrazione;
    }

    public void onClickAccedi() {
        throw new UnsupportedOperationException();
    }
}




