package com.aqua.waterapiinterface.controller;

import com.aqua.waterapi_client_sdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称 API
 * @author water king
 * @time 2024/1/28
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/get")
    public String getNameByGet(String name, HttpServletRequest request) {
        System.out.println(request.getHeader("water"));
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
        String result = "POST 用户名字是" + user.getUsername();
        return result;
    }
}
