package cn.com.gree.daoimpl;

import cn.com.gree.entity.Student;
import cn.com.gree.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

public class StudentDaoImpl {
    /**
    * 添加对象
    */
public void add1() {
    SqlSession sqlSession = null;
    try {
        sqlSession = MyBatisUtils.getSqlSession();
        //事务开始(默认)
        //读取StudentMapper.xml中的SQL语句
        int i = sqlSession.insert("cn.com.gree.entity.Student.add1");
        System.out.println("本次操作影响了" + i + "行");
        //事务提交
        sqlSession.commit();
    }catch (Exception e){
        sqlSession.rollback();
        e.printStackTrace();
    }finally {
        MyBatisUtils.closeSqlSession();
    }
  }

  public void add2(Student student){
    SqlSession sqlSession = null;
    try{
        sqlSession = MyBatisUtils.getSqlSession();
        //开启事务(默认)
        //读取StudentMapper.xml中的SQl语句
        sqlSession.insert(student.getClass().getName()+".add2",student);
        //提交事务
        sqlSession.commit();
    }catch (Exception e){
        e.printStackTrace();
        //回滚事务
        sqlSession.rollback();
    }finally {
      MyBatisUtils.closeSqlSession();
    }

  }
  public void add3(Student student){
      SqlSession sqlSession = null;
      try{
          sqlSession = MyBatisUtils.getSqlSession();
          //开启事务(默认)
          //读取StudentMapper.xml中的SQl语句
          sqlSession.insert(student.getClass().getName()+".add3",student);
          //提交事务
          sqlSession.commit();
      }catch (Exception e){
          e.printStackTrace();
          //回滚事务
          sqlSession.rollback();
      }finally {
          MyBatisUtils.closeSqlSession();
      }
  }


  public static void main(String[] args){
      StudentDaoImpl dao = new StudentDaoImpl();
      // dao.add1();
      //dao.add2(new Student(2,"HeHe",8000D));
      dao.add3(new Student(3,"XiXi",9000D));
      dao.add3(new Student(4,"BenBen",9000D));
  }
}

