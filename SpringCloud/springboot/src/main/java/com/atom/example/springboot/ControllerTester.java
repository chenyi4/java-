package com.atom.example.springboot;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTester {
    @ResponseBody
    @RequestMapping(value="/hello")
    public String sayHello(){
        String text = "textNames1111";
        return text;
    }
}
