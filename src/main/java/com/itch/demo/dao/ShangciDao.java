package com.itch.demo.dao;

import com.itch.demo.entity.Shangci;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;

public interface ShangciDao  {
    /**
     * 添加
     * @param shangci
     * @param sk
     * @return
     */
    int add(@Param("shangci") int shangci,@Param("sk") String sk);

    /***
     * 统计
     * @param uids
     * @return
     */
    int countbyuid(@Param("uids") int uids);
}
