package pei.zhang;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/helloWorld")
public class HelloWorldController {
    @GetMapping
    public String get(){
        return "hello world!";
    }
}
