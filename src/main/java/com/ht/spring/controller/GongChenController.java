package com.ht.spring.controller;

import com.ht.spring.Interface.GongchenUser;
import com.ht.spring.pojo.PmProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.List;

@Controller
public class GongChenController {
    @Autowired
    GongchenUser gongchenUser;
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/pmProjectusser")
    public String pmProjectusser(String name, String number,Model model){
        PmProject pmProject = gongchenUser.loginProject(name, number);
        if (pmProject == null) {
            model.addAttribute("tishi", "登录失败，账号或者密码错误请重新登录");
            return "login";
        } else {
            return "emp/list";
        }
    }
    @GetMapping("/pmProjectList")
    public String pmProjectList(Model model){
        List<PmProject> list = gongchenUser.pmProjectlist();
        model.addAttribute("list", list);
        return "emp/list";
    }

    @RequestMapping("/add")
    public String add(){
        return "emp/add";
    }

   @PostMapping("/addPmProject")
    public String  addPmProject(PmProject pmProject){
        gongchenUser.addPmProject(pmProject);
        return "redirect:/pmProjectList";
    }

    @GetMapping("/update/{id}")
    public String uadate(@PathVariable int id, Model model){
        PmProject userup = gongchenUser.userup(id);
        model.addAttribute("userup",userup);
        return "emp/update";
    }

    @PutMapping("/updatePmProject")
   public String updatePmProject(PmProject pmProject){
       gongchenUser.updatPmProject(pmProject);
       return "redirect:/pmProjectList";
   }

   @DeleteMapping("/deletePmProject/{id}")
   public String deletePmProject(@PathVariable int id){
       gongchenUser.delete(id);
        return "redirect:/pmProjectList";
   }



}
