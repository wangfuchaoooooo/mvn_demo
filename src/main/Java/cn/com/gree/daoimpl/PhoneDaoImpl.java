package cn.com.gree.daoimpl;

import cn.com.gree.dao.PhoneDao;
import cn.com.gree.entity.Phone;
import cn.com.gree.utils.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class PhoneDaoImpl implements PhoneDao {

    public List<Phone> queryPhone()throws SQLException {
    QueryRunner qr = JDBCUtils.getQueryRunner();
    String sql = "SELECT * FROM phone";
    List<Phone> list = (List<Phone>)qr.query(sql,new BeanListHandler(Phone.class));
    return list;
    }
}
