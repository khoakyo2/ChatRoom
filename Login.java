package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton SignIn = new JButton("Sign in\r\n");
		SignIn.setBackground(new Color(153, 50, 204));
		SignIn.setForeground(new Color(255, 255, 255));
		SignIn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		SignIn.setBounds(459, 204, 97, 35);
		contentPane.add(SignIn);
		
		JLabel Label1 = new JLabel("Sign in");
		Label1.setForeground(new Color(153, 50, 204));
		Label1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		Label1.setBounds(287, 21, 87, 29);
		contentPane.add(Label1);
		
		JFormattedTextField UserName = new JFormattedTextField();
		UserName.setBackground(new Color(255, 255, 255));
		UserName.setToolTipText("");
		UserName.setForeground(Color.BLACK);
		UserName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		UserName.setBounds(285, 82, 271, 29);
		contentPane.add(UserName);
		
		Password = new JPasswordField();
		Password.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Password.setBounds(287, 147, 269, 29);
		contentPane.add(Password);
		
		JButton btnNewButton = new JButton("Don't have an User name? Sign up");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(153, 50, 204));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNewButton.setBounds(287, 269, 271, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("User Name\r\n");
		lblNewLabel_3.setForeground(new Color(153, 50, 204));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(285, 68, 73, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password\r\n");
		lblNewLabel_3_1.setForeground(new Color(153, 50, 204));
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(287, 133, 71, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 50, 204));
		panel.setForeground(new Color(204, 51, 255));
		panel.setBounds(0, 0, 271, 361);
		contentPane.add(panel);
	}
}
