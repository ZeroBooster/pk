package manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class update extends JFrame {

	String sql="";

    String id="";
    String name="";
    String className="";
    String max="";
    String sex="";
    String readed="";
    
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update frame = new update();
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
	public update() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel update = new JLabel("修改");
		update.setFont(new java.awt.Font("隶书", Font.PLAIN, 26));
		update.setBounds(181, 10, 86, 21);
		contentPane.add(update);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(66, 58, 54, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("姓名:");
		lblNewLabel_1.setBounds(66, 83, 54, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("性别:");
		lblNewLabel_2.setBounds(66, 113, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("班级:");
		lblNewLabel_3.setBounds(66, 138, 54, 15);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(149, 55, 143, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(149, 83, 143, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(149, 110, 143, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(149, 135, 143, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("查看");		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allStudent in = new allStudent();
				in.run();
				dispose();
			}
		});
		btnNewButton.setBounds(311, 54, 93, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("修改");								          			         
		btnNewButton_1.setBounds(66, 192, 93, 23);
		contentPane.add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("重置");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_2){
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");	
					textField_3.setText("");
		        }
			}
		});
		btnNewButton_2.setBounds(230, 192, 93, 23);
		contentPane.add(btnNewButton_2);
	}

	public void run() {
		// TODO Auto-generated method stub
		update frame = new update();
		frame.setVisible(true);	
	}
}

