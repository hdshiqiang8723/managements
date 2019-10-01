package com.itch.demo.Service.Impl;

import com.itch.demo.Service.ShangciService;
import com.itch.demo.dao.ShangciDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShangciServiceimpl implements ShangciService {

    @Resource
    private ShangciDao dao;

    /**
     * 统计登陆次数
     * @param uids
     * @return
     */
    @Override
    public int countbyuid(int uids) {

        return dao.countbyuid(uids);
    }
}
