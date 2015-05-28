package manager;

import java.awt.*;

import javax.swing.*;

import SQL.StudentDB;

import java.sql.*;

public class allStudent extends JFrame {
    public allStudent() {
        try {
            jbInit();
            this.view();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setResizable(false);
        this.setTitle("所有信息");
        this.setSize(590,400);
        getContentPane().setLayout(null);
        jScrollPane1.setBounds(new Rectangle(2, 3, 580, 375));
        this.getContentPane().add(jScrollPane1);
        jScrollPane1.setViewportView(tablelist);
    }

    StudentDB r=new StudentDB();
    JScrollPane jScrollPane1 = new JScrollPane();
    JTextArea tablelist = new JTextArea();

    public void view() throws Exception{
        String mess="";
        ResultSet rs=r.getStudentRS();
        mess="ID      \t"+"姓名\t"+"性别\t"+"班级       \t";
        tablelist.append(mess);
        mess="";
        while(rs.next()){
            mess="\n"+rs.getString(1).trim()+"\t"+rs.getString(2).trim()+"\t"+rs.getString(3).trim()+"\t"+rs.getString(4).trim()+"\t";
            tablelist.append(mess);
        }
        tablelist.setEnabled(false);
        this.setVisible(true);
    }

	public void run() {
		// TODO Auto-generated method stub
		allStudent frame = new allStudent();
		frame.setVisible(true);
		
	}
}
