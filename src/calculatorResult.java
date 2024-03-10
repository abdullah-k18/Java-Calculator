import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class calculatorResult extends Calculator{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JFrame frame;
	public JTextField resTextField;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorResult window = new calculatorResult();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculatorResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 289, 141);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		resTextField = new JTextField();
		resTextField.setBounds(119, 31, 101, 34);
		frame.getContentPane().add(resTextField);
		resTextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Result");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(29, 31, 80, 34);
		frame.getContentPane().add(lblNewLabel);
	}
}