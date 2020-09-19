package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 402);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 50, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton CreateRoom = new JButton("+\r\n");
		CreateRoom.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		CreateRoom.setBounds(10, 59, 43, 43);
		contentPane.add(CreateRoom);
		
		JButton Home = new JButton("");
		Home.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Home.setBounds(10, 11, 43, 43);
		contentPane.add(Home);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(148, 0, 211));
		panel_1.setBounds(63, 0, 146, 361);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 47, 146, 43);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Friends\r\n");
		lblNewLabel.setBounds(42, 11, 57, 21);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(153, 50, 204));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JFormattedTextField Search = new JFormattedTextField();
		Search.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Search.setBounds(0, 0, 146, 47);
		panel_1.add(Search);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 318, 146, 43);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton YourAccount = new JButton("Y");
		YourAccount.setBounds(0, 0, 43, 43);
		panel_4.add(YourAccount);
		YourAccount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Online\r\n");
		lblNewLabel_2.setBounds(41, -1, 105, 43);
		panel_4.add(lblNewLabel_2);
		lblNewLabel_2.setBackground(new Color(153, 50, 204));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 110, 63, 36);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Room\r\n");
		lblNewLabel_1.setBounds(0, 0, 63, 36);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setForeground(new Color(153, 50, 204));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(208, 54, 376, 307);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton Send = new JButton(">\r\n");
		Send.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		Send.setBounds(333, 264, 43, 43);
		panel_3.add(Send);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		formattedTextField.setBounds(0, 264, 334, 43);
		panel_3.add(formattedTextField);
		
		JButton AddFriends = new JButton("Add Friends");
		AddFriends.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		AddFriends.setBounds(389, 0, 133, 54);
		contentPane.add(AddFriends);
		
		JButton Call = new JButton("Call\r\n");
		Call.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Call.setBounds(208, 0, 90, 54);
		contentPane.add(Call);
		
		JButton VideoCall = new JButton("Video");
		VideoCall.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		VideoCall.setBounds(299, 0, 90, 54);
		contentPane.add(VideoCall);
		
		JButton Option = new JButton("!\r\n");
		Option.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		Option.setBounds(521, 0, 63, 54);
		contentPane.add(Option);
	}
}
