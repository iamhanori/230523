package kr.hs.study.UrlMapping2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/sub2/test2") //
    public String test2() {
        return "result";
    }

    @GetMapping("/sub2/test3")
    public String test3() {
        return "result";
    }

    @GetMapping("/sub2/test4")
    public String test4() {
        return "result";
    }


}

