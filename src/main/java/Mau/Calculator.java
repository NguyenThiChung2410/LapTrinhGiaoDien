/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mau;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class Calculator extends JFrame {

    private JLabel lbNum1, lbNum2, lbResult;
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btAdd, btSub, btMul, btDiv,btExit;

    public Calculator(String title) {
        super(title);
        createGUI();
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void createGUI() {

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 2, 10, 10));
        p1.add(lbNum1 = new JLabel("Num 1"));
        p1.add(txtNum1 = new JTextField(10));
        p1.add(lbNum2 = new JLabel("Num 2"));
        p1.add(txtNum2 = new JTextField(10));
        p1.add(lbResult = new JLabel(" result"));
        p1.add(txtResult = new JTextField(10));
        txtResult.setEditable(false);

        JPanel p2 = new JPanel();
        p2.add(btAdd = new JButton("Add"));
        p2.add(btSub = new JButton("Sub"));
        p2.add(btMul = new JButton("Mul"));
        p2.add(btDiv = new JButton("Div"));
        p2.add(btExit=new JButton("Kết thúc"));

        setLayout(new BorderLayout());
        add(p1);
        add(p2, BorderLayout.SOUTH);

        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x = Double.parseDouble(txtNum1.getText());
                    double y = Double.parseDouble(txtNum2.getText());
                    double kq = x + y;
                    txtResult.setText(String.valueOf(kq));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ");
                }
            }
        });

        btSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x = Double.parseDouble(txtNum1.getText());
                    double y = Double.parseDouble(txtNum2.getText());
                    double kq = x - y;
                    txtResult.setText(String.valueOf(kq));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ!");
                }
            }
        });
        btMul.addActionListener((e) -> {
            try {
                double x = Double.parseDouble(txtNum1.getText());
                double y = Double.parseDouble(txtNum2.getText());
                double kq = x * y;
                txtResult.setText(String.valueOf(kq));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ!");
            }
        });
        btDiv.addActionListener((e) -> {
            try {
                double x = Double.parseDouble(txtNum1.getText());
                double y = Double.parseDouble(txtNum2.getText());
                double kq = x / y;
                if (y == 0) {
                    JOptionPane.showMessageDialog(null, "Không thể chia cho 0!");
                }
                txtResult.setText(String.valueOf(kq));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Giá trị không hợp lệ!");
            }
        });
        btExit.addActionListener((e) -> {
            int chon =JOptionPane.showConfirmDialog(null, "Bạn có chắc đóng không?", "Hỏi lại", JOptionPane.YES_NO_OPTION);
            if(chon==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
        });
    }

    public static void main(String[] args) {
        Calculator ccl = new Calculator("Calculator");
        ccl.setVisible(true);
    }

}
