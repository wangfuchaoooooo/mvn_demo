package cn.com.gree.service;

import cn.com.gree.entity.Phone;

import java.sql.SQLException;
import java.util.List;

public interface PhoneService {
    List<Phone> findPhone()throws SQLException;
}
