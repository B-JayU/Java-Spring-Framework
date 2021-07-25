package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    // application에서 "/hello" 로 접근하면 이곳으로 연결됨.

    public String hello(Model model) {
        model.addAttribute("data", "spring!!");
        return "hello";
        // resources 에있는 templates 내의 hello.html과 동일함.

    }
}
