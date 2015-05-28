package manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class delete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					delete frame = new delete();
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
	public delete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("删除");
		label.setFont(new java.awt.Font("隶书", Font.PLAIN, 26));
		label.setBounds(192, 41, 54, 15);
		contentPane.add(label);
		
		JLabel lblid = new JLabel("学生ID:");
		lblid.setBounds(93, 100, 54, 15);
		contentPane.add(lblid);
		
		textField = new JTextField();
		textField.setBounds(157, 97, 149, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("删除");
		button.setBounds(75, 180, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("取消");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_1.setBounds(239, 180, 93, 23);
		contentPane.add(button_1);
	}

	public void run() {
		// TODO Auto-generated method stub
		delete frame = new delete();
		frame.setVisible(true);		
	}

}
