package com.example.springbootmybatisxml.web;

import com.example.springbootmybatisxml.mapper.BsUserMapper;
import com.example.springbootmybatisxml.model.BsUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BsUserController {

    @Resource
    private BsUserMapper bsUserMapper;

    @RequestMapping("/getUsers")
    public List<BsUser> getUsers() {
        List<BsUser> users = bsUserMapper.getAll();
        return users;
    }

}
