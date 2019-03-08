/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("save.htm")

    public String doSave(@Valid @ModelAttribute("login") Login p, BindingResult result, Model m) {
        if (result.hasErrors()) {
            return "createAcc";

        }

        LoginDAO dao = new LoginDAO();
        dao.doSave(p);
        return "loginPage";

    }

    @RequestMapping("delete.htm")
    public String doDelete(@ModelAttribute("login") Login p, Model m) {

        LoginDAO dao = new LoginDAO();
        dao.doDelete(p);
        List<Login> li = new ArrayList<>();
        li = dao.doShow(p);
        m.addAttribute("ai", li);
        return "result";

    }

    @RequestMapping("update.htm")

    public String doUpdate(@Valid @ModelAttribute("login") Login p, BindingResult result, Model m) {
        if (result.hasErrors()) {
            return "update";

        }

        LoginDAO dao = new LoginDAO();
        dao.doUpdate(p);
        List<Login> li = new ArrayList<>();
        li = dao.show2(p);

        return "result";

    }

    @RequestMapping("check.htm")
    public String doShow(@Valid @ModelAttribute("login") Login p, BindingResult result, Model m) {
        LoginDAO dao = new LoginDAO();
        if (dao.checkUser(p.getId(), p.getPassword())) {
            List<Login> li = new ArrayList<>();
            li = dao.doShow(p);
            m.addAttribute("ai", li);
            return "result";

        } else {
            return "loginPage";
        }

    }

    @RequestMapping("show.htm")
    public String show2(@ModelAttribute("login") Login p, Model m) {

        LoginDAO dao = new LoginDAO();
        
        List<Login> li = new ArrayList<>();
        li = dao.show2(p);
        m.addAttribute("ai", li);
        
        return "update";

    }

}
