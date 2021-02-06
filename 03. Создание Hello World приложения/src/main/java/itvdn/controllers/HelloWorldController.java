package itvdn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @GetMapping(path = {"/", "/hello"})
    public String getHelloWorld(Model model, @RequestParam(value = "name") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
}


