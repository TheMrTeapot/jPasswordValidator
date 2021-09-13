package com.ism510;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * PasswordForm is the GUI created that will hold the password field and the button
 */
public class PasswordForm {
    JButton validatePasswordButton;
    JPanel passwordView;
    private JPasswordField passwordField;
    final String PASSWORD_REGEX = "^(?=.*[0-9]){2,}(?=.*[a-z]){2,}(?=.*[A-Z]){2,}(?=\\S+$).{8,}$";

    public PasswordForm() {

        /**
         * This method will validate the password requirements via a regex check.
         */
        validatePasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isPasswordValid = new String(passwordField.getPassword()).matches(PASSWORD_REGEX);
                String passwordNoteText = isPasswordValid ? "Password Valid" : "Password Invalid";
                showMessageDialog(null, passwordNoteText);
            }
        });
    }
}
