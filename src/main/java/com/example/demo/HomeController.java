package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String index(Model model) {
        model.addAttribute("var1", "Yes, you can!");
        model.addAttribute("var2", "Let's have fun!");

        return "home";
    }

    @RequestMapping ("/displaypage")
    public String displayPage(){

        return "displayPage";

    }








    //@RequestMapping("/home")
    public String homePage(Model model){
        model.addAttribute("myvar", "Say hellow to people");
        return "hometemplate";
    }

//    1.03
    @RequestMapping("/home2")
    public String homePage2() {
        return "homeTemplate2fromfile";
    }




}
