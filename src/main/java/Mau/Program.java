/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mau;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
        JFrame frm=new JFrame("Simple calculator");
        JPanel p=new JPanel();
        
        p.setLayout(new FlowLayout());
        
        JLabel lbNum1 =new JLabel("Num 1");
        JLabel lbNum2=new JLabel("Num 2");
        JLabel lbResult=new JLabel("Result");
        
        JTextField txtNum1=new JTextField(10);
        JTextField txtNum2=new JTextField(10);
        JTextField txtResult=new JTextField (10);
        
        JButton btAdd =new JButton("Add");
        JButton btSub=new JButton("Sub");
        JButton btMul=new JButton("Mul");
        JButton btDiv=new JButton("Div");
        
        p.add(lbNum1);
        p.add(txtNum1);
        p.add(lbNum2);
        p.add(txtNum2);
        p.add(lbResult);
        p.add(txtResult);
        p.add(btAdd);
        p.add(btSub);
        p.add(btMul);
        p.add(btDiv);
        
        frm.add(p);
        frm.setSize(500,400);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
    
}
