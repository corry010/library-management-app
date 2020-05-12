package com.example.librarysystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.example.librarysystem.Admin;

public class MainPage implements ActionListener{

    private static JButton adminBtn;
    private static JButton userBtn;
    private static JLabel mainLabel;
    private static JFrame frame;
    private static JPanel panel;
    private JPanel mainPanel;

//    public MainPage() {
//        adminLoginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public static void main(String[] args){
         panel = new JPanel();
         frame = new JFrame();
        frame.setSize(600, 600);
        panel.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
         mainLabel = new JLabel("Library Management - JavaTpoint");
        mainLabel.setFont(new Font("serif", Font.BOLD, 20));
        mainLabel.setBounds(150, 30, 300,50);
        panel.add(mainLabel);

         adminBtn = new JButton("Admin Login");
        adminBtn.setBounds(200, 150, 200, 50);
        adminBtn.addActionListener(new MainPage());
        panel.add(adminBtn);

         userBtn = new JButton("Libraian Login");
        userBtn.setBounds(200, 250, 200, 50);
        userBtn.addActionListener(new MainPage());
        panel.add(userBtn);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == adminBtn){
            new Admin();
            // admin.setVisible(true);
            frame.dispose();
        }if(e.getSource() == userBtn){
            new User();
            frame.dispose();
        }


    }
}
