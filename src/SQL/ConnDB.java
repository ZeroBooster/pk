package SQL;

import java.sql.*;
import javax.swing.*;

public class ConnDB {
    private String DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
    private String URL = "jdbc:odbc:SQL";
    private String username="sa";
    private String password="";

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    int rsall = 0;

    /*
    获得会话
    */
    public Statement getStatement() {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, username, password);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            return stmt;
        } catch (Exception e){
        JOptionPane.showMessageDialog(null,"系统报错！无法连接到数据库！");
        }
        return null;
    }

    /*
    获得结果集
    */
    public ResultSet getRS(String sql) {
        try {
            this.getStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (Exception e) {}
        return null;
    }

    /*
    返回执行SQL语句成功的个数
    */
    public int execsql(String sql) {
        try {
            this.getStatement();
            rsall = stmt.executeUpdate(sql);
            return rsall;
        } catch (Exception e) {}
        return 0;
    }

    /*
    关闭
    */
    public void closed() {
        try {
            if (rs!=null||stmt!=null||conn!=null) {
                rs.close();
                stmt.close();
                conn.close();
            }
        } catch (Exception e) {}
    }
}

