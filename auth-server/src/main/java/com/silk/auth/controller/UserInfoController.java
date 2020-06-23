package com.silk.auth.controller;

import com.silk.auth.entity.UserInfo;
import com.silk.auth.service.UserInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户表(UserInfo)表控制层
 *
 * @author makejava
 * @since 2019-08-13 14:06:29
 */
@RestController
@RequestMapping("userInfo")
public class UserInfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserInfoService userInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserInfo selectOne(Integer id) {
        return this.userInfoService.queryById(id);
    }

}