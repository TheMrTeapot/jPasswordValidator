package com.ism510;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Program to validate a password with the following requirements
 * Minimum 8 characters in length
 * Contains the following items:
 * - 2 Uppercase Letters
 * - 2 Lowercase Letters
 * - 2 Numbers
 *
 * @author Rafael Robledo Alonso
 * Author: Rafael Robledo Alonso
 * E-mail Address:  rafael.robledoalonso@student.uagc.edu
 * Programming assignment 1
 * created on: 09/13/2021
 */

public class Main {

    public static void main(String[] args) {


        JFrame frame = new JFrame("Password Validator");

        frame.setContentPane(new PasswordForm().passwordView);
        frame.setPreferredSize(new Dimension(600, 200));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
