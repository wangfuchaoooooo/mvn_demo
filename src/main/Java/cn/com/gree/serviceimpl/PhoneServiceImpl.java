package cn.com.gree.serviceimpl;

import cn.com.gree.dao.PhoneDao;
import cn.com.gree.entity.Phone;
import cn.com.gree.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    PhoneDao phoneDao;

    public List<Phone> findPhone() throws SQLException {
        List<Phone> list = phoneDao.queryPhone();
        return list;
    }
}
