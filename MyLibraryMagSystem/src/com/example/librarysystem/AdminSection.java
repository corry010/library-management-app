package com.example.librarysystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminSection extends JFrame {

    private static JPanel adminSecPanel;
    private static JFrame adminSecFrame;
    private static JLabel adminSecLabel;
    private static JButton addLibrarianBtn, viewLibrarianBtn, deleteLibrarianBtn, logoutBtn;


    public AdminSection(){

        adminSecPanel = new JPanel();
        adminSecFrame = new JFrame();
        adminSecFrame.setSize(600, 600);
        adminSecPanel.setLayout(null);

        adminSecFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adminSecFrame.add(adminSecPanel);

        adminSecLabel = new JLabel("Admin Section");
        adminSecLabel.setBounds(200, 30, 200, 50);
        adminSecLabel.setFont(new Font("serif", Font.BOLD, 24));
        adminSecPanel.add(adminSecLabel);

        addLibrarianBtn = new JButton("Login");
        addLibrarianBtn.setBounds(225, 100, 150, 50);
        addLibrarianBtn.setFont(new Font("serif", Font.BOLD, 24));
        adminSecPanel.add(addLibrarianBtn);

        viewLibrarianBtn = new JButton("Login");
        viewLibrarianBtn.setBounds(225, 200, 150, 50);
        viewLibrarianBtn.setFont(new Font("serif", Font.BOLD, 24));
        adminSecPanel.add(viewLibrarianBtn);

        deleteLibrarianBtn = new JButton("Login");
        deleteLibrarianBtn.setBounds(225, 300, 150, 50);
        deleteLibrarianBtn.setFont(new Font("serif", Font.BOLD, 24));
        adminSecPanel.add(deleteLibrarianBtn);

        logoutBtn = new JButton("Login");
        logoutBtn.setBounds(225, 400, 150, 50);
        logoutBtn.setFont(new Font("serif", Font.BOLD, 24));
        adminSecPanel.add(logoutBtn);

        BtnListener listener = new BtnListener();
        addLibrarianBtn.addActionListener(listener);
        viewLibrarianBtn.addActionListener(listener);
        deleteLibrarianBtn.addActionListener(listener);
        logoutBtn.addActionListener(listener);

    }

    /**
     * BtnListener is a named inner class used as ActionEvent listener for all the Buttons.
     */

    private class BtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // Need to determine which button fired the event.
            // the getActionCommand() returns the Button's label
            String btnLabel = e.getActionCommand();
            if(btnLabel.equals("Add Librarian")){

        }else if(btnLabel.equals("Delete Librarian")){
            }
        }
    }



}
