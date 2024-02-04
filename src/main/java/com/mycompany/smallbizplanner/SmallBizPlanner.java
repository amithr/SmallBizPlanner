/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.smallbizplanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author amith
 */
public class SmallBizPlanner {

    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Hello, World App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed
        frame.setSize(400, 200); // Set the window size
        
         // Create a JLabel (text label)
        JLabel label = new JLabel("Hello, World!");
        label.setHorizontalAlignment(JLabel.CENTER); // Center-align the text
        
        // Add the label to the frame
        frame.add(label);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
