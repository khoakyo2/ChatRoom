package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class CreateUser extends JFrame {

	private JPanel contentPane;
	private JPasswordField PassWord;
	private JPasswordField PassWordCF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateUser frame = new CreateUser();
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
	public CreateUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create your Account");
		lblNewLabel.setForeground(new Color(153, 50, 204));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(10, 11, 213, 33);
		contentPane.add(lblNewLabel);
		
		JFormattedTextField FirstName = new JFormattedTextField();
		FirstName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		FirstName.setBounds(10, 82, 161, 33);
		contentPane.add(FirstName);
		
		JFormattedTextField LastName = new JFormattedTextField();
		LastName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		LastName.setBounds(194, 82, 161, 33);
		contentPane.add(LastName);
		
		JFormattedTextField UserName = new JFormattedTextField();
		UserName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		UserName.setBounds(10, 140, 345, 33);
		contentPane.add(UserName);
		
		PassWord = new JPasswordField();
		PassWord.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PassWord.setBounds(10, 221, 161, 33);
		contentPane.add(PassWord);
		
		PassWordCF = new JPasswordField();
		PassWordCF.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PassWordCF.setBounds(196, 221, 161, 33);
		contentPane.add(PassWordCF);
		
		JLabel lblNewLabel_1 = new JLabel("Use 8 or more characters with a mix of letters, numbers & \r\nsymbols");
		lblNewLabel_1.setForeground(new Color(153, 50, 204));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(10, 262, 389, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("you can use letters, number & periods");
		lblNewLabel_2.setForeground(new Color(153, 50, 204));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(10, 175, 228, 20);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Sign up\r\n");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(153, 50, 204));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(249, 306, 108, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Password\r\n");
		lblNewLabel_3.setForeground(new Color(153, 50, 204));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 206, 73, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Confirm Password\r\n");
		lblNewLabel_3_1.setForeground(new Color(153, 50, 204));
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3_1.setBounds(196, 207, 113, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("User Name\r\n");
		lblNewLabel_3_2.setForeground(new Color(153, 50, 204));
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3_2.setBounds(10, 126, 73, 14);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("First Name\r\n");
		lblNewLabel_3_3.setForeground(new Color(153, 50, 204));
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3_3.setBounds(10, 67, 73, 14);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Last Name\r\n");
		lblNewLabel_3_4.setForeground(new Color(153, 50, 204));
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3_4.setBounds(194, 68, 73, 14);
		contentPane.add(lblNewLabel_3_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 50, 204));
		panel.setBounds(399, 0, 185, 361);
		contentPane.add(panel);
	}

}
