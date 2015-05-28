package SQL;

import java.sql.*;

public class DBlogin {
    String sql="";

    public boolean checkLogin(String username,String password) throws SQLException {
        ConnDB cd=new ConnDB();
        sql="select * from usertable where u_name='"+username+"' and u_pass='"+password+"'";
        ResultSet rs=cd.getRS(sql);
        if(rs.next()&&rs.getString(2).equals(username)&&rs.getString(3).equals(password)){
            cd.closed();
            return true;
        }else{
            return false;
        }
    }
    public int getStutas() throws SQLException{
        ConnDB cd=new ConnDB();
        ResultSet rs=cd.getRS(sql);
        rs.next();
        int i=Integer.valueOf(rs.getString(4));
        return i;
    }
}

