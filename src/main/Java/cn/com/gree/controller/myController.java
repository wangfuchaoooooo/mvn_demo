package cn.com.gree.controller;


import cn.com.gree.entity.Phone;
import cn.com.gree.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;
import java.util.List;

@Controller
public class myController {

    @Autowired
    PhoneService phoneService;

    @RequestMapping("/")
    public String welcomePage() {
        return "login";
    }

    @RequestMapping(value = "/showPage",method = RequestMethod.POST)
    public String showPhone(Model model) throws SQLException {
       List<Phone> showPhoneList =  phoneService.findPhone();
       model.addAttribute("showPhoneList",showPhoneList);
        return "show";
    }
}
