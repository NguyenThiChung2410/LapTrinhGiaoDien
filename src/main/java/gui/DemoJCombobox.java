/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author DELL
 */
public class DemoJCombobox extends JFrame {

    private JLabel lbNum1, lbNum2, lbOp, lbResult;
    private JTextField txtNum1, txtNum2, txtResult;
    private JButton btTinh, btNhapLai;
    private JComboBox<String> cboPhepTinh;

    public DemoJCombobox(String title) {
        super(title);
        createGUI();

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    private void createGUI() {

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 2, 10, 10));
        p.add(lbNum1 = new JLabel("Num 1"));
        p.add(txtNum1 = new JTextField(10));

        p.add(lbNum2 = new JLabel("Num 2"));
        p.add(txtNum2 = new JTextField(10));

        p.add(lbOp = new JLabel("Phép tính"));
        p.add(cboPhepTinh = new JComboBox<>());
        cboPhepTinh.addItem("Cộng");
        cboPhepTinh.addItem("Trừ");
        cboPhepTinh.addItem("Nhân");
        cboPhepTinh.addItem("Chia");
        p.add(lbResult = new JLabel("Result"));
        p.add(txtResult = new JTextField(10));

        txtResult.setEditable(false);

        p.add(btTinh = new JButton("Tính"));
        p.add(btNhapLai = new JButton("Nhập lại"));

        add(p);

        btTinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x = Double.parseDouble(txtNum1.getText());
                    double y = Double.parseDouble(txtNum2.getText());
                    double kq = 0;
                    int selectedIndex = cboPhepTinh.getSelectedIndex();
                    if (selectedIndex == 0) {
                        kq = x + y;
                    } else if (selectedIndex == 1) {
                        kq = x - y;

                    } else if (selectedIndex == 2) {
                        kq = x * y;
                    } else {
                        kq = x / y;
                        if (y == 0) {
                            JOptionPane.showMessageDialog(null, "Không thể chia cho 0", "Thông báo", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    txtResult.setText(String.valueOf(kq));

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Lỗi Nhập liệu", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btNhapLai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNum1.setText("");
                txtNum2.setText("");
                txtResult.setText("");
                cboPhepTinh.setSelectedIndex(0);
                txtNum1.requestFocus();

            }
        });

    }

    public static void main(String[] args) {

        DemoJCombobox frm = new DemoJCombobox("Simple  Calculaotor");
        frm.setVisible(true);
    }

}
