package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Hello {

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable String name){
        return "hello" + name ;
    }
}
