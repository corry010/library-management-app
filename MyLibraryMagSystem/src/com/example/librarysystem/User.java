package com.example.librarysystem;

import javax.swing.*;

public class User extends JFrame {
    private static JPanel userPanel;
    private static JFrame userFrame;
    private static JLabel userLabel;

    public User(){
        userPanel = new JPanel();
        userFrame = new JFrame();
        userFrame.setSize(600, 600);
        userPanel.setLayout(null);

        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userFrame.add(userPanel);

        userLabel = new JLabel("User Login Form");
        userLabel.setBounds(40, 50, 200, 50);
        userPanel.add(userLabel);

        userFrame.setVisible(true);
    }

}
