package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogSiteAppController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    @RequestMapping("/author")
    public String author(){
        return "author";
    }


    @RequestMapping("/github1")
    public String gitHub1(){
        return "github-p1";
    }
    @RequestMapping("/github2")
    public String gitHub2(){
        return "github-p2";
    }

    @RequestMapping("/program1")
    public String program1(){
        return "program1";
    }
    @RequestMapping("/program2")
    public String program2(){
        return "program2";
    }

    @RequestMapping("/core1")
    public String core1(){
        return "core1";
    }
    @RequestMapping("/core2")
    public String core2(){
        return "core2";
    }

    @RequestMapping("/ooj1")
    public String ooj1(){
        return "ooj1";
    }
    @RequestMapping("/ooj2")
    public String ooj2(){
        return "ooj2";
    }

    @RequestMapping("/html1")
    public String html1(){
        return "html1";
    }
    @RequestMapping("/html2")
    public String html2(){
        return "html2";
    }
}
