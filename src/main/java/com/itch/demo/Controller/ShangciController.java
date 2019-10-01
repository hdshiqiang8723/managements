package com.itch.demo.Controller;

import com.itch.demo.Service.ShangciService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ShangciController {
    @Resource
    private ShangciService shangciService;


    @RequestMapping("tongji")
    public int tongji(String ids) {

       return  shangciService.countbyuid(Integer.parseInt(ids));
    }
}
