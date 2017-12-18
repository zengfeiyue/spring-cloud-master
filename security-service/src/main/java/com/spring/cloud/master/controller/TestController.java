package com.spring.cloud.master.controller;

import com.spring.cloud.master.dao.security.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by zfy on 2017/8/24.
 */
@RestController
public class TestController {

    @Autowired
    private SysUserMapper sysUserMapper;

    @CacheEvict(value = {"select2"}, allEntries = true)
    @RequestMapping("/test3")
    public String test3() {

        return "1213";
    }

    @RequestMapping("/test")
    public String test4() {
        System.err.println(sysUserMapper);
        return "1213";
    }
}
