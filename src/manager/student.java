package manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class student extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student frame = new student();
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
	public student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel student = new JLabel("学生信息管理");
		student.setFont(new java.awt.Font("隶书", Font.PLAIN, 26));
		student.setBounds(140, 31, 168, 31);
		contentPane.add(student);
		
		final JButton add = new JButton("新建信息");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add xj = new add();
				xj.run();
				dispose();			        
			}

		});
		add.setBounds(169, 86, 93, 23);
		contentPane.add(add);
		
		final JButton update = new JButton("修改信息");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update xg = new update();
				xg.run();
				dispose();		
			}
		});
		update.setBounds(169, 135, 93, 23);
		contentPane.add(update);
		
		final JButton delete = new JButton("删除信息");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete sc = new delete();
				sc.run();
				dispose();
			}
		});
		delete.setBounds(169, 183, 93, 23);
		contentPane.add(delete);
	}


}
