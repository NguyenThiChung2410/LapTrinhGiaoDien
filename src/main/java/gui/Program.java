/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frm=new JFrame("Login System");
        JPanel p=new JPanel();
        
        p.setLayout(new FlowLayout());
        
        JLabel lbUser =new JLabel("User Name");
        JLabel lbPass=new JLabel("Password");
        
        JTextField txtUser=new JTextField(10);
        JTextField txtPass=new JPasswordField(10);
        
        JButton btLogin =new JButton("Login");
        JButton btReset=new JButton("Reset");
        
        p.add(lbUser);
        p.add(txtUser);
        p.add(lbPass);
        p.add(txtPass);
        p.add(btLogin);
        p.add(btReset);
        
        frm.add(p);
        frm.setSize(300,200);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        
    }
    
}
