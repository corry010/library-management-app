package com.example.librarysystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.example.librarysystem.AdminSection;

public class Admin extends JFrame implements ActionListener {

    private static JLabel adminLabel, userLabel, passwordLabel ;
    private static JPanel adminPanel;
    private static JFrame adminFrame;
    private static JTextField userTextField;
    private static JPasswordField passwordField;
    private static JButton adminLoginBtn;



    public Admin(){
         adminPanel = new JPanel();
         adminFrame = new JFrame();
        adminFrame.setSize(600, 600);
        adminPanel.setLayout(null);

        adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminFrame.add(adminPanel);

        adminLabel = new JLabel("Admin Login Form");
        adminLabel.setBounds(200, 30, 200, 50);
        adminLabel.setFont(new Font("serif", Font.BOLD, 24));
        adminPanel.add(adminLabel);

        userLabel = new JLabel("Enter Name:");
        userLabel.setBounds(50, 150,200 , 50);
        userLabel.setFont(new Font("serif", Font.BOLD, 20));
        adminPanel.add(userLabel);

        userTextField = new JTextField();
        userTextField.setBounds(250, 150, 200, 50);
        userTextField.setFont(new Font("serif", Font.PLAIN, 20));
        adminPanel.add(userTextField);

        passwordLabel = new JLabel("Enter Password");
        passwordLabel.setBounds(50, 250, 200, 50);
        passwordLabel.setFont(new Font("serif", Font.BOLD, 20));
        adminPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(250, 250, 200, 50);
        passwordField.setFont(new Font("serif", Font.BOLD, 20));
        adminPanel.add(passwordField);

        adminLoginBtn = new JButton("Login");
        adminLoginBtn.setBounds(225, 350, 150, 50);
        adminLoginBtn.setFont(new Font("serif", Font.BOLD, 24));
        adminLoginBtn.addActionListener(this);
        adminPanel.add(adminLoginBtn);






        adminFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnLabel = e.getActionCommand();
        if(btnLabel.equals("Login")){
            new  AdminSection();
            dispose();

        }

    }
}
