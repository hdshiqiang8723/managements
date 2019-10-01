package com.itch.demo.dao;

import com.itch.demo.entity.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersDao {

    /**
     * 验证
     * @param uname
     * @param pwds
     * @return
     */
    int byname(@Param("uname") String uname, @Param("pwd") String pwds);

    /**
     * 添加
     * @param users
     * @return
     */
    int add(Users users);

    /**
     * 修改
     * @param users
     * @return
     */
    int update(Users users);

    /**
     * 删除
     * @param id
     * @return
     */
    int detele(@Param("id") int id);
}
