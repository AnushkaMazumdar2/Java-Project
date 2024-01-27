/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacman;

/**
 *
 * @author DELL
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage extends JFrame {

    public WelcomePage() {
        initUI();
    }

    private void initUI() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Load the image
        ImageIcon pacmanImage = new ImageIcon("src/resources/images/titleScreen.jpg");
        JLabel imageLabel = new JLabel(pacmanImage);
        // Set the size of the label to match the image dimensions
        imageLabel.setBounds(0, 0, pacmanImage.getIconWidth(), pacmanImage.getIconHeight());
        panel.add(imageLabel);

        JButton startButton = new JButton("Start Pac-Man Game");
        startButton.setBounds(130, pacmanImage.getIconHeight() + 10, 200, 30);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Start the Pac-Man game when the button is clicked
                startGame();
            }
        });

        panel.add(startButton);

        setTitle("Welcome to Pac-Man");
        setSize(pacmanImage.getIconWidth() + 50, pacmanImage.getIconHeight() + 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(panel);
    }

    private void startGame() {
        // Create an instance of the Pacman class and make it visible
        Pacman pacmanGame = new Pacman();
        pacmanGame.setVisible(true);
        // Close or hide the welcome page when the game starts
        dispose();
    }

    public static void main(String[] args) {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.setVisible(true);
    }
}
