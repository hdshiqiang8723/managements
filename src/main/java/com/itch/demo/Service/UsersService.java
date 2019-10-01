package com.itch.demo.Service;

import com.itch.demo.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface UsersService {

    int byname( String uname, String pwds);

    int add(Users users);

    int update(Users users);

    int detele( int id);
}
