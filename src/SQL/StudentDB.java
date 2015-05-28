package SQL;

import java.sql.ResultSet;

import javax.swing.JLabel;

public class StudentDB {
    String sql="";
    ResultSet rs=null;
    ConnDB cd=new ConnDB();
    /**
     * 查看ID是否已经存在，如果存在返回真，否则返回假
     * */
    public boolean getStudent(JLabel id){
        sql = "select * from reader where r_id='" + id + "'";
        rs = cd.getRS(sql);
        try {
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {}
        return false;
   }

   /**
    * 返回该ID的记录集，查看信息
    * */
   public ResultSet getStudentRS(String id){
       sql = "select * from reader where r_id='" + id + "'";
       rs = cd.getRS(sql);
       return rs;
   }

   /**
    * 返回记录集，查看所有信息
    * */
   public ResultSet getStudentRS() {
       sql = "select * from reader";
       rs = cd.getRS(sql);
       return rs;
   }

   /**
    * 添加ID，如果添加成功返回真，否则返回假
    * */
   public boolean addStudent(String id,String name,String sex,String classname,String max){
       sql = "insert reader(r_id,r_name,r_sex,r_class,r_max) values('"+id+"','"+name+"','"+sex+"','"+classname+"','"+max+"')";
       try {
           int i=cd.execsql(sql);
           if (i>0) {
               return true;
           } else {
               return false;
           }
       } catch (Exception ex) {}
       return false;
   }

   /**
    * 修改信息，修改成功返回真，否则返回假
    * */
   public boolean updateStudent(String name,String sex,String className,String max,String readed,String id){
       sql="update reader set r_name='"+name+"',r_sex='"+sex+"',r_class='"+className+"',r_max="+max+"";
       int i=cd.execsql(sql);
       if(i>0){
           return true;
       }else{
           return false;
       }
    }

    /**删除信息，删除成功返回真，否则返回假。
     */
   public boolean deleteStudent(String id){
       sql="delete reader where r_id='"+id+"'";
       int a=cd.execsql(sql);
       if(a>0){
           return true;
       }else{
           return false;
       }
   }
   
   /**
    * 关闭数据库连接
    * */
   public void closed(){
       cd.closed();
   }
}

