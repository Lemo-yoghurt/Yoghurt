package com.lanou.controller;

import com.lanou.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by dllo on 17/10/9.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/params")
    public String paramPage(@RequestParam("username") String name,
                            @RequestParam("password") String password){
        System.out.println(name);
        System.out.println(password);
        System.out.println("---------");

        return "success";
    }

    @RequestMapping(value = "/login")
    public String loginTest(){
        return "login";
    }

    @RequestMapping(value = "/param")
    public String springLogin(Student student){
        System.out.println(student.getUsername());
        System.out.println(student.getPassword());

        return "success";

    }
}
