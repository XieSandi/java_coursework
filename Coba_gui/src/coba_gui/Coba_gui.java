/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba_gui;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Xie Yue
 */
public class Coba_gui {
    
    JFrame frame;
    JPanel panel;
    JTextField textField;
    JButton button;
    Container contentPane;
    
    void launchingFrame(){
        /* Initial */
        frame = new JFrame("Hello Jodoh !");
        panel = new JPanel();
        textField = new JTextField("Lorem Ipsum Amet Sit Dolor");
        button = new JButton("ASS ON!");
        contentPane = frame.getContentPane();
        
        /* Add content */
        panel.add(textField);
        panel.add(button);
        
        contentPane.add(panel,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Coba_gui test = new Coba_gui();
        test.launchingFrame();
    }
    
}
