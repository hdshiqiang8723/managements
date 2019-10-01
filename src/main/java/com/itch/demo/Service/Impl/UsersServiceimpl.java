package com.itch.demo.Service.Impl;

import com.itch.demo.Service.UsersService;
import com.itch.demo.dao.ShangciDao;
import com.itch.demo.dao.UsersDao;
import com.itch.demo.entity.Shangci;
import com.itch.demo.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UsersServiceimpl implements UsersService {

    @Resource
    private UsersDao usersDao;
    @Resource
    private ShangciDao shangciDao;

    @Override
    public int byname(String uname, String pwds) {
        int byname = usersDao.byname(uname, pwds);
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd ss:dd:mm");
        String format = sim.format(new Date());
        shangciDao.add(byname,format);
        return byname;
    }

    @Override
    public int add(Users users) {
        return usersDao.add(users);
    }

    @Override
    public int update(Users users) {
        return usersDao.update(users);
    }

    @Override
    public int detele(int id) {
        return usersDao.detele(id);
    }
}
