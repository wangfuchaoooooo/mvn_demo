package cn.com.gree.dao;

import cn.com.gree.entity.Phone;

import java.sql.SQLException;
import java.util.List;

public interface PhoneDao {
    List<Phone> queryPhone()throws SQLException;
}
