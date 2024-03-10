import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private JTextField textField1;
	private JTextField textField2;
	
	private JButton btn_sum;
	private JButton btn_sub;
	private JButton btn_div;
	private JButton btn_mul;
	private JButton btn_per;
	
	int num1;
	int num2;
	int result;
	private JTextField resTextField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setBackground(Color.LIGHT_GRAY);
		setAlwaysOnTop(true);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField1 = new JTextField("");
		textField1.setBounds(10, 70, 108, 32);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(textField1.getText());
				num2=Integer.parseInt(textField2.getText());
				result=num1-num2;
				resTextField.setText(Integer.toString(result));
			}
		});
		btn_sub.setBounds(10, 113, 44, 44);
		contentPane.add(btn_sub);
		
		btn_mul = new JButton("X");
		btn_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(textField1.getText());
				num2=Integer.parseInt(textField2.getText());
				result=num1*num2;
				resTextField.setText(Integer.toString(result));
			}
		});
		btn_mul.setBounds(206, 113, 44, 44);
		contentPane.add(btn_mul);
		
		btn_div = new JButton("÷");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(textField1.getText());
				num2=Integer.parseInt(textField2.getText());
				result=num1/num2;
				resTextField.setText(Integer.toString(result));
			}
		});
		btn_div.setBounds(273, 113, 44, 44);
		contentPane.add(btn_div);
		
		btn_per = new JButton("%");
		btn_per.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(textField1.getText());
				num2=Integer.parseInt(textField2.getText());
				result=(num1/num2)*100;
				resTextField.setText(Integer.toString(result));
			}
		});
		btn_per.setBounds(140, 113, 44, 44);
		contentPane.add(btn_per);
		
		btn_sum = new JButton("+");
		btn_sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(textField1.getText());
				num2=Integer.parseInt(textField2.getText());
				result=num1+num2;
				resTextField.setText(Integer.toString(result));
			}
		});
		btn_sum.setBounds(74, 113, 44, 44);
		contentPane.add(btn_sum);
		
		textField2 = new JTextField();
		textField2.setBounds(209, 70, 108, 32);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Value 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 25, 108, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Value 2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(206, 25, 111, 34);
		contentPane.add(lblNewLabel_1);
		
		resTextField = new JTextField();
		resTextField.setBounds(140, 197, 108, 32);
		contentPane.add(resTextField);
		resTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(30, 197, 100, 28);
		contentPane.add(lblNewLabel_2);
	}
}
