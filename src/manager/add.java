package manager;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import SQL.StudentDB;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class add extends JFrame {
	
	String id1="";
    String name1="";
    String sex1="";
    String class1="";
    String max1="";

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add frame = new add();
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
	public add() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("注册");
		lblNewLabel.setFont(new java.awt.Font("隶书", Font.PLAIN, 26));
		lblNewLabel.setBounds(183, 10, 54, 15);
		contentPane.add(lblNewLabel);
		
		final JLabel id = new JLabel("ID:");
		id.setBounds(84, 38, 54, 15);
		contentPane.add(id);
		
		final JLabel name = new JLabel("姓名:");
		name.setBounds(84, 73, 54, 15);
		contentPane.add(name);
		
		JLabel sex = new JLabel("性别:");
		sex.setBounds(84, 104, 54, 15);
		contentPane.add(sex);
		
		final JLabel classes = new JLabel("班级:");
		classes.setBounds(84, 129, 54, 15);
		contentPane.add(classes);
		
		final JButton ok = new JButton("注册");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==ok){
		            id1=id.getText().trim();
		            if(id1==null||id1.equals("")){
		                JOptionPane.showMessageDialog(null,"请输入ID！");
		                return;
		            }
		            if(id1.length()!=10){
		                JOptionPane.showMessageDialog(null,"ID限制为10位数！");
		                return;
		            }
		            name1=name.getText().trim();
		            if(name1==null||name1.equals("")){
		                JOptionPane.showMessageDialog(null,"请输入姓名！");
		                return;
		            }
		            if(name1.length()>10){
		                JOptionPane.showMessageDialog(null,"请将姓名长度限制在10位以内！");
		                return;
		            }
		            class1=classes.getText().trim();
		            if(class1==null||class1.equals("")){
		                JOptionPane.showMessageDialog(null,"请输入班级名称！");
		                return;
		            }		   
		            StudentDB r=new StudentDB();
		            if(r.getStudent(id)){
		                JOptionPane.showMessageDialog(null,"该读者ID已经存在，请重新输入！");
		                return;
		            }
		            if(r.addStudent(id1,name1,sex1,class1, class1)){
		                JOptionPane.showMessageDialog(null,"注册成功！");
		            }else{
		                JOptionPane.showMessageDialog(null,"注册失败！");
		                return;
		            }
		            r.closed();
		        }
			}
		});
		ok.setBounds(80, 178, 93, 23);
		contentPane.add(ok);
		
		final JButton exit = new JButton("重置");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==exit){
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");		      
		        }
			}
		});
		exit.setBounds(233, 178, 93, 23);
		contentPane.add(exit);
		
		textField = new JTextField();
		textField.setBounds(148, 35, 178, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 70, 178, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("男");
		rdbtnNewRadioButton.setBounds(147, 100, 57, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("女");
		rdbtnNewRadioButton_1.setBounds(216, 100, 57, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(148, 129, 178, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
	}

	public void run() {
		// TODO Auto-generated method stub
		add frame = new add();
		frame.setVisible(true);
		
	}
}
