package com.itch.demo.Controller;

import com.itch.demo.Service.UsersService;
import com.itch.demo.entity.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UsersController {

    @Resource
    private UsersService service;

    @RequestMapping("/yanzhengs")
    public int yanzheng( String uname,
                        String pwds){
        return service.byname(uname, pwds);
    }

    @RequestMapping("/tianjia")
    public int add(String uname, String pwd) {
        Users s=new Users();
        s.setuName(uname);
        s.setPwds(pwd);
        return service.add(s);
    }

    @RequestMapping("updates")
    public int updates(String name, String pwd,String ids) {
        Users s=new Users();
        Long i =(long)Integer.parseInt(ids);
        s.setId(i);
        s.setuName(name);
        s.setPwds(pwd);
        return service.add(s);
    }

    /**
     * 删除
     * @param ids
     * @return
     */
    @RequestMapping("delets")
    public int deletes(String ids) {
        return service.detele(Integer.parseInt(ids));
    }
}
