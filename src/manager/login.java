package manager;


import SQL.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {
	String name="";
    String pass="";

	private JPanel contentPane;
	private JTextField textusername;
	private JPasswordField textpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel login = new JLabel("登录",JLabel.CENTER);
		login.setFont(new java.awt.Font("隶书", Font.PLAIN, 26));
		login.setBounds(139, 10, 152, 45);
		contentPane.add(login);
		
		JLabel username = new JLabel("\u7528\u6237\u540D:");
		username.setBounds(78, 81, 54, 15);
		contentPane.add(username);
		
		JLabel password = new JLabel(" \u5BC6 \u7801:");
		password.setBounds(78, 129, 54, 15);
		contentPane.add(password);
		
		textusername = new JTextField();
		textusername.setBounds(165, 78, 153, 21);
		contentPane.add(textusername);
		textusername.setColumns(10);
		
		textpassword = new JPasswordField();
		textpassword.setBounds(165, 126, 153, 21);
		contentPane.add(textpassword);
		
		final JButton ok = new JButton("\u767B\u5F55");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 login frame=new login();
			        if(e.getSource()==ok){
			            name=textusername.getText().trim();
			            pass=String.valueOf(textpassword.getPassword());
			            if(name.equals("")||name==null){
			                JOptionPane.showMessageDialog(null,"请输入用户名！");
			                return;
			            }
			            if(pass.equals("")||pass==null){
			                JOptionPane.showMessageDialog(null,"请输入密码！");
			                return;
			            }
			            DBlogin dl=new DBlogin();
			            try{
			                if (dl.checkLogin(name, pass) && dl.getStutas() == 1) {
			                    JOptionPane.showMessageDialog(null,"欢迎管理员");
			                    this.dispose();			        
			                    frame.setView();			           
			                }else{
			                    JOptionPane.showMessageDialog(null,"登陆错误请重新登录");
			                    return;
			                }
			            }catch(Exception ex){}
			        }
			       
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		ok.setBounds(81, 186, 80, 23);
		contentPane.add(ok);
		
		final JButton exit = new JButton("\u9000\u51FA");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
		exit.setBounds(238, 186, 80, 23);
		contentPane.add(exit);
				
	}

	protected void setView() {
		// TODO Auto-generated method stub
		
	}

}
